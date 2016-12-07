package com.zjgt.paySys.service.citic.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springside.modules.mapper.BeanMapper;

import com.zjgt.paySys.common.citic.CiticConfig;
import com.zjgt.paySys.common.citic.CiticProps;
import com.zjgt.paySys.common.citic.bean.Result;
import com.zjgt.paySys.common.citic.bean.Row;
import com.zjgt.paySys.common.citic.bean.Stream;
import com.zjgt.paySys.common.citic.bean.VilcstDataList;
import com.zjgt.paySys.common.citic.enums.AccGenTypeEnum;
import com.zjgt.paySys.common.citic.enums.AccTypeEnum;
import com.zjgt.paySys.common.citic.enums.AppFlagEnum;
import com.zjgt.paySys.common.citic.enums.AutoAssignInterestFlagEnum;
import com.zjgt.paySys.common.citic.enums.AutoAssignTranFeeFlag;
import com.zjgt.paySys.common.citic.enums.CalInterestFlagEnum;
import com.zjgt.paySys.common.citic.enums.FeeTypeEnum;
import com.zjgt.paySys.common.citic.enums.OverFlagEnum;
import com.zjgt.paySys.common.citic.enums.PreFlgEnum;
import com.zjgt.paySys.common.citic.enums.RealNameParmEnum;
import com.zjgt.paySys.common.citic.enums.SttEnum;
import com.zjgt.paySys.common.citic.enums.SubAccPrintParmEnum;
import com.zjgt.paySys.common.citic.enums.TranFlagEnum;
import com.zjgt.paySys.common.citic.utils.Bean2Json;
import com.zjgt.paySys.common.citic.utils.ClientIDUtil;
import com.zjgt.paySys.common.citic.utils.HttpUtil;
import com.zjgt.paySys.common.citic.utils.XmlUtil;
import com.zjgt.paySys.common.citic.vo.AccountCancellationVo;
import com.zjgt.paySys.common.citic.vo.BalanceAccountVo;
import com.zjgt.paySys.common.citic.vo.BaseVo;
import com.zjgt.paySys.common.citic.vo.DealDetailVo;
import com.zjgt.paySys.common.citic.vo.DealVo;
import com.zjgt.paySys.common.citic.vo.FreezeDetailVo;
import com.zjgt.paySys.common.citic.vo.FreezeVo;
import com.zjgt.paySys.common.citic.vo.HandlingChargeDetailVo;
import com.zjgt.paySys.common.citic.vo.HandlingChargeVo;
import com.zjgt.paySys.common.citic.vo.MemberInfoVo;
import com.zjgt.paySys.common.citic.vo.PrintDetailVo;
import com.zjgt.paySys.common.citic.vo.PrintVo;
import com.zjgt.paySys.common.citic.vo.RegisterVo;
import com.zjgt.paySys.common.citic.vo.WithdrawVo;
import com.zjgt.paySys.dao.CiticInvokeLogDao;
import com.zjgt.paySys.entity.CiticInvokeLog;
import com.zjgt.paySys.service.citic.CiticService;

@Service
public class CiticServiceImpl implements CiticService {
	
	@Autowired
	private CiticInvokeLogDao citicInvokeLogDao;

	/**
	 * 初始化资金池
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param subAccNo
	 *            调入附属账号
	 * @param subAccNm
	 *            调入附属账户名称
	 * @param tranAmt
	 *            初始化交易金额
	 * @param memo
	 *            摘要
	 * @return
	 */
	@Override
	public String initializeFund(String invokeUser, String subAccNo, String subAccNm, String tranAmt, String memo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLFNDINI);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(ClientIDUtil.generateClientID());
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_INIT));
		stream.setSubAccNo(subAccNo);
		stream.setSubAccNm(subAccNm);
		stream.setTranAmt(tranAmt);
		if (StringUtils.isNotEmpty(memo)) {
			stream.setMemo(memo);
		} else {
			stream.setMemo(CiticConfig.EMPTY);
		}
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		// 状态处理
		BaseVo vo = statusCheck(stream, result, invokeUser, CiticConfig.ACTION_DLFNDINI);
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}

	/**
	 * 会员注册
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param subAccNm
	 *            附属账户名称
	 * @param vtlCustNm
	 *            虚拟客户名称
	 * @param legalPersonNm
	 *            法人名称
	 * @param custCertType
	 *            客户证件类型
	 * @param custCertNo
	 *            客户证件号码
	 * @param commAddress
	 *            通讯地址
	 * @param contactName
	 *            联系人姓名
	 * @param contactPhone
	 *            联系电话
	 * @param mailAddress
	 *            邮件地址
	 * @return
	 */
	@Override
	public String register(String invokeUser,String subAccNm, String vtlCustNm, String legalPersonNm, String custCertType,
			String custCertNo, String commAddress, String contactName, String contactPhone,
			String mailAddress) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLBREGSN);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setMainAccNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setAppFlag(AppFlagEnum.B2B.getCode());
		stream.setAccGenType(AccGenTypeEnum.AUTO.getCode());
		stream.setSubAccNo(CiticConfig.EMPTY);
		stream.setSubAccNm(subAccNm);
		stream.setAccType(AccTypeEnum.TRADE_ACCOUNT.getCode());
		stream.setCalInterestFlag(CalInterestFlagEnum.NO.getCode());
		stream.setInterestRate(CiticConfig.EMPTY);
		stream.setOverFlag(OverFlagEnum.NO.getCode());
		stream.setOverAmt(CiticConfig.EMPTY);
		stream.setOverRate(CiticConfig.EMPTY);
		stream.setAutoAssignInterestFlag(AutoAssignInterestFlagEnum.NO.getCode());
		stream.setAutoAssignTranFeeFlag(AutoAssignTranFeeFlag.NO.getCode());
		stream.setFeeType(FeeTypeEnum.NO.getCode());
		stream.setRealNameParm(RealNameParmEnum.YES.getCode());
		stream.setSubAccPrintParm(SubAccPrintParmEnum.VIRTUAL_ACCOUNT_ID.getCode());
		stream.setMngNode(CiticProps.getProperty(CiticConfig.REGISTER_MNGNODE));
		stream.setVtlCustNm(vtlCustNm);
		stream.setLegalPersonNm(legalPersonNm);
		stream.setCustCertType(custCertType);
		stream.setCustCertNo(custCertNo);
		stream.setBranch(CiticProps.getProperty(CiticConfig.REGISTER_BRANCH));
		stream.setCommAddress(commAddress);
		VilcstDataList list = new VilcstDataList();
		List<Row> rowList = new ArrayList<Row>();
		Row row = new Row();
		row.setContactName(contactName);
		row.setContactPhone(contactPhone);
		row.setMailAddress(mailAddress);
		rowList.add(row);
		list.setRow(rowList);
		stream.setList(list);
		System.out.println(Bean2Json.convertJson(stream));
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		RegisterVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new RegisterVo(result.getStatusText(),stream);
			vo.setSubAccNo(result.getSubAccNo());
			vo.setSubAccNm(result.getSubAccNm());
			vo.setHostNo(result.getHostNo());
		}else{
			vo = new RegisterVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}

	/**
	 * 交易状态查询
	 * 
	 * @param invokeUser
	 *            调用者信息
	 * @param clientID
	 *            客户流水号	             	 
	 * @param type
	 *            原请求代码
	 * @return
	 */
	@Override
	public String queryStatus(String invokeUser,String clientID,String type) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLCIDSTT);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(clientID);
		stream.setType(type);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		BaseVo vo = null;
		if(result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())){
			String stt = result.getList().getRow().get(0).getStt();
			if(SttEnum.SUCCESS.getCode().equals(stt)){
				vo = new BaseVo(SttEnum.SUCCESS.getMessage(),stream);	
			}else if(SttEnum.UNKNOWN.getCode().equals(stt)){
				vo = new BaseVo(CiticConfig.HANDLING,SttEnum.getMessage(stt),stream);
			}else{
				vo = new BaseVo(CiticConfig.ERROR,SttEnum.getMessage(stt),stream);	
			}
		}else{
			vo = new BaseVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}
	
	/**
	 * 交易状态查询(内容使用)
	 * 
	 * @param invokeUser
	 *            调用者信息
	 * @param clientID
	 *            客户流水号	             	 
	 * @param type
	 *            原请求代码
	 * @return
	 */	
	private Result getStatus(String invokeUser,String clientID,String type) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLCIDSTT);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(clientID);
		stream.setType(type);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		//保存日志
		generateLog(invokeUser, stream, result);
		return result;
	}

	/**
	 * 商户附属账户余额查询
	 * 
	 * @param invokeUser
	 *            调用者信息	  
	 * @param subAccNo
	 *            附属账号
	 * @return
	 */
	@Override
	public String queryBalanceAccount(String invokeUser,String subAccNo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLSBALQR);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setSubAccNo(subAccNo);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		BalanceAccountVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new BalanceAccountVo(result.getStatusText(),stream);
			Row row = result.getList().getRow().get(0);
			vo.setSubAccNo(row.getSubAccNo());
			vo.setSUBACCNM(row.getSUBACCNM());
			vo.setTZAMT(row.getTZAMT());
			vo.setXSACVL(row.getXSACVL());
			vo.setKYAMT(row.getKYAMT());
			vo.setSJAMT(row.getSJAMT());
			vo.setDJAMT(row.getDJAMT());
		}else{
			vo = new BalanceAccountVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);

	}

	/**
	 * 强制转账
	 *
	 * @param invokeUser
	 *            调用者信息	 	  
	 * @param payAccNo
	 *            付款账号
	 * @param tranType
	 *            转账类型(BF：转账；BG：解冻；BH：解冻支付；BR：冻结；BS：支付冻结)
	 * @param recvAccNo
	 *            收款账号
	 * @param recvAccNm
	 *            收款账户名称
	 * @param tranAmt
	 *            交易金额
	 * @param freezeNo
	 *            冻结编号
	 * @param memo
	 *            摘要
	 * @return
	 */
	@Override
	public String transfer(String invokeUser,String payAccNo, String tranType, String recvAccNo, String recvAccNm, String tranAmt,
			String freezeNo, String memo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLMDETRN);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(ClientIDUtil.generateClientID());
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setPayAccNo(payAccNo);
		stream.setTranType(tranType);
		if (StringUtils.isNotEmpty(recvAccNo)) {
			stream.setRecvAccNo(recvAccNo);
		} else {
			stream.setRecvAccNo(CiticConfig.EMPTY);
		}
		if (StringUtils.isNotEmpty(recvAccNm)) {
			stream.setRecvAccNm(recvAccNm);
		} else {
			stream.setRecvAccNm(CiticConfig.EMPTY);
		}
		if (StringUtils.isNotEmpty(tranAmt)) {
			stream.setTranAmt(tranAmt);
		} else {
			stream.setTranAmt(CiticConfig.EMPTY);
		}		
		if (StringUtils.isNotEmpty(freezeNo)) {
			stream.setFreezeNo(freezeNo);
		} else {
			stream.setFreezeNo(CiticConfig.EMPTY);
		}
		if (StringUtils.isNotEmpty(memo)) {
			stream.setMemo(memo);
		} else {
			stream.setMemo(CiticConfig.EMPTY);
		}
		stream.setTranFlag(TranFlagEnum.SYNCHRONIZATION.getCode());
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		// 状态处理
		BaseVo vo = statusCheck(stream, result, invokeUser, CiticConfig.ACTION_DLMDETRN);				
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}
	
	/**
	 * 查询账户冻结信息
	 * 
	 * @param invokeUser
	 *            调用者
	 * @param subAccNo
	 *            附属账户
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            终止日期
	 * @return
	 */
	@Override
	public String queryFreeze(String invokeUser, String subAccNo, String startDate, String endDate) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLSFRZQR);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setSubAccNo(subAccNo);
		stream.setStartDate(startDate);
		stream.setEndDate(endDate);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		FreezeVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new FreezeVo(result.getStatusText(),stream);
			List<Row> row = result.getList().getRow();
            List<FreezeDetailVo> freezeDetailList = BeanMapper.mapList(row, FreezeDetailVo.class);
            vo.setFreezeList(freezeDetailList);
		}else{
			vo = new FreezeVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}

	/**
	 * 提现
	 * 
	 * @param invokeUser
	 *            调用者	  
	 * @param accountNo
	 *            付款账号
	 * @param recvAccNo
	 *            收款账号
	 * @param recvAccNm
	 *            收款账户名称
	 * @param tranAmt
	 *            交易金额
	 * @param sameBank
	 *            中信标识
	 * @param recvTgfi
	 *            收款账户开户行支付联行号
	 * @param recvBankNm
	 *            收款账户开户行名
	 * @param memo
	 *            摘要
	 * @return
	 */
	@Override
	public String withdrawMoney(String invokeUser,String accountNo, String recvAccNo, String recvAccNm, String tranAmt,String sameBank,String recvTgfi,String recvBankNm,String memo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLFCSOUT);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(ClientIDUtil.generateClientID());
		stream.setAccountNo(accountNo);	
		stream.setRecvAccNo(recvAccNo);
		stream.setRecvAccNm(recvAccNm);
		stream.setTranAmt(tranAmt);
		stream.setSameBank(sameBank);
		stream.setRecvTgfi(recvTgfi);
		stream.setRecvBankNm(recvBankNm);
		stream.setMemo(memo);
		stream.setPreFlg(PreFlgEnum.NO_ORDER.getCode());
		stream.setPreDate(CiticConfig.EMPTY);
		stream.setPreTime(CiticConfig.EMPTY);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		// 状态处理
		BaseVo vo = statusCheck(stream, result, invokeUser, CiticConfig.ACTION_DLFCSOUT);			
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}

	/**
	 * 对外支付
	 * 
	 * @param invokeUser
	 *            调用者	  
	 * @param preFlg
	 *            预约支付标志 0：非预约交易；1：预约交易
	 * @param preDate
	 *            延期支付日期char(8) 格式YYYYMMDD ，预约时非空
	 * @param preTime
	 *            延期支付时间char(6) 格式hhmmss只限100000，120000，140000，160000 四个时间点，预约时非空
	 * @param recBankNo
	 *            收款人所属银行行号 varchar(20)，可空，支付方式为05(网银跨行支付)时非空
	 * @param payAccountNo
	 *            付款账号
	 * @param recAccountNo
	 *            收款账号 char(32)，当支付方式为00(汇票)时，收款账号可空
	 * @param recAccountName
	 *            收款账户名称
	 * @param recOpenBankName
	 *            收款账户开户行名(全称)
	 * @param recOpenBankCode
	 *           收款账户开户行联行网点号	                       
	 * @param citicbankFlag
	 *            中信标志 0：中信；1：他行 
	 * @param cityFlag
	 *            同城标志 0：同城；1：异地
	 * @param tranAmount
	 *           金额	                       
	 * @param zhaiYao
	 *            摘要
	 * @param memo
	 *            备注 可空	             	 
	 * @return
	 */	
	@Override
	public String externalPay(String invokeUser, String payType, String recBankNo,
			String payAccountNo, String recAccountNo, String recAccountName, String recOpenBankName, String recOpenBankCode,
			String citicbankFlag, String cityFlag, String tranAmount, String zhaiYao, String memo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLOUTTRN);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(ClientIDUtil.generateClientID());
		stream.setPreFlg(PreFlgEnum.NO_ORDER.getCode());
		stream.setPreDate(CiticConfig.EMPTY);
		stream.setPreTime(CiticConfig.EMPTY);
		stream.setPayType(payType);
		stream.setRecBankNo(recBankNo);
		stream.setPayAccountNo(payAccountNo);
		stream.setRecAccountNo(recAccountNo);
		stream.setRecAccountName(recAccountName);
		stream.setRecOpenBankName(recOpenBankName);
		stream.setRecOpenBankCode(recOpenBankCode);
		stream.setCiticbankFlag(citicbankFlag);
		stream.setCityFlag(cityFlag);
		stream.setTranAmount(tranAmount);
		if (StringUtils.isNotEmpty(zhaiYao)) {
			stream.setZhaiYao(zhaiYao);
		} else {
			stream.setZhaiYao(CiticConfig.EMPTY);
		}
		if (StringUtils.isNotEmpty(memo)) {
			stream.setMemo(memo);
		} else {
			stream.setMemo(CiticConfig.EMPTY);
		}
		stream.setTakerName(CiticConfig.EMPTY);
		stream.setTakerID(CiticConfig.EMPTY);
		stream.setTakerIDType(CiticConfig.EMPTY);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		WithdrawVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new WithdrawVo(result.getStatusText(),stream);
			vo.setTranDate(result.getTranDate());
			vo.setTranTime(result.getTranTime());
			vo.setTranNo(result.getTranNo());
			vo.setPayAccountNo(result.getPayAccountNo());
			vo.setPayAccountName(result.getPayAccountName());
			vo.setPayOpenBankName(result.getPayOpenBankName());
			vo.setRecAccountNo(result.getRecAccountNo());
			vo.setRecAccountName(result.getRecAccountName());
			vo.setRecOpenBankName(result.getRecOpenBankName());
			vo.setTranAmount(result.getTranAmount());
			vo.setResume(result.getResume());
		}else{
			vo = new WithdrawVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}
	
	/**
	 * 商户附属账户交易明细查询
	 * 
	 * @param subAccNo
	 *            附属账号
	 * @param queryType
	 *            查询类型
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            终止日期
	 * @param tranType
	 *            交易类型
	 * @param startRecord
	 *            起始记录号
	 * @param pageNumber
	 *            请求记录条数
	 * @return
	 */
	@Override
	public String queryListForDeal(String invokeUser,String subAccNo,String queryType,String startDate,String endDate,String tranType,String startRecord,String pageNumber) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLSTRNDT);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setSubAccNo(subAccNo);
		if(StringUtils.isNotEmpty(tranType)){
			stream.setQueryType(queryType);
		}else{
			stream.setQueryType(CiticConfig.EMPTY);
		}
		stream.setStartDate(startDate);
		stream.setEndDate(endDate);
		if(StringUtils.isNotEmpty(tranType)){
			stream.setTranType(tranType);
		}else{
			stream.setTranType(CiticConfig.EMPTY);
		}
		stream.setStartRecord(startRecord);
		stream.setPageNumber(pageNumber);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		DealVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new DealVo(result.getStatusText(),stream);
			List<Row> row = result.getList().getRow();
            List<DealDetailVo> dealDetailList = BeanMapper.mapList(row, DealDetailVo.class);
            vo.setDealList(dealDetailList);
            vo.setPageNumber(stream.getPageNumber());
            vo.setStartRecord(stream.getStartRecord());
            vo.setReturnRecords(result.getReturnRecords());

		}else{
			vo = new DealVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}
	
	/**
	 * 非登录打印明细查询
	 * 
	 * @param subAccNo
	 *            附属账号
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            终止日期
	 * @param startRecord
	 *            起始记录号
	 * @param pageNumber
	 *            请求记录条数
	 * @return
	 */
	@Override
	public String queryListForPrint(String invokeUser,String subAccNo, String startDate, String endDate,
			String startRecord, String pageNumber) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLPTDTQY);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setMainAccNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));	
		stream.setSubAccNo(subAccNo);
		stream.setStartDate(startDate);
		stream.setEndDate(endDate);
		stream.setStartRecord(startRecord);
		stream.setPageNumber(pageNumber);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		PrintVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new PrintVo(result.getStatusText(),stream);
			List<Row> row = result.getList().getRow();
            List<PrintDetailVo> printDetailList = BeanMapper.mapList(row, PrintDetailVo.class);
            vo.setStartRecord(stream.getStartRecord());
            vo.setPageNumber(stream.getPageNumber());
            vo.setPrintList(printDetailList);
		}else{
			vo = new PrintVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}
	
	/**
	 * 生成log
	 * @param invokeUser
	 * @param stream
	 * @param result
	 * @return
	 */
	@Transactional
	public CiticInvokeLog generateLog(String invokeUser, Stream stream, Result result){
		CiticInvokeLog log = new CiticInvokeLog();
		log.setInvokeUser(invokeUser);
		log.setInvokeParameters(XmlUtil.toXml(stream));
		log.setInvokeCode(stream.getAction());
		log.setClientNo(stream.getClientID());
		log.setInvokeResult(XmlUtil.toXml(result));
		log.setCreateDate(new Date());
		if(CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())){
			log.setStatus((short)0);
		}else if(CiticConfig.TRADE_STATUS_AAAAAAB.equals(result.getStatus())){
			log.setStatus((short)1);
		}else if(CiticConfig.TRADE_STATUS_AAAAAAC.equals(result.getStatus())){
			log.setStatus((short)2);
		}else if(CiticConfig.TRADE_STATUS_AAAAAAD.equals(result.getStatus())){
			log.setStatus((short)3);
		}else if(CiticConfig.TRADE_STATUS_AAAAAAE.equals(result.getStatus())){
			log.setStatus((short)4);
		}else{
			log.setStatus((short)5);
		}
		citicInvokeLogDao.save(log);
		return log;
	}
	
	/**
	 * 共同状态判断
	 * @param stream
	 * @param result
	 * @param invokeUser
	 * @param type
	 * @return
	 */
	private  BaseVo statusCheck(Stream stream,Result result,String invokeUser,String type){
		BaseVo vo = null;
		// 调用交易状态查询
		Result statusResult = getStatus(invokeUser,stream.getClientID(),type);
		if(statusResult != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(statusResult.getStatus())){
			String stt = statusResult.getList().getRow().get(0).getStt();
			if(SttEnum.SUCCESS.getCode().equals(stt)){
				vo = new BaseVo(SttEnum.SUCCESS.getMessage(),stream);	
			}else if(SttEnum.UNKNOWN.getCode().equals(stt)){
				vo = new BaseVo(CiticConfig.HANDLING,SttEnum.getMessage(stt),stream);
			}else{
				vo = new BaseVo(CiticConfig.ERROR,SttEnum.getMessage(stt),stream);	
			}
		}else{
			vo = new BaseVo(CiticConfig.ERROR,statusResult.getStatusText(),stream);
		}
		return vo;
	}
	
	/**
	 * 附属账户参数管理
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param subAccNo
	 *            附属账号
	 * @param subAccNm
	 *            附属账户名称
	 * @param AutoAssignTranFeeFlag
	 *            自动分配转账手续费标char(1)，0：否；1：是
	 * @param feeType
	 *            手续费收取方式 char(1)，0：不收取；1：实时收取；2：月末累计
	 * @return
	 */
	@Override
	public String manageAccount(String invokeUser, String subAccNo, String subAccNm, String autoAssignTranFeeFlag, String feeType) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLSBAMAN);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setMainAccNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setSubAccNo(subAccNo);
		if(StringUtils.isNotEmpty(subAccNm)){
			stream.setSubAccNm(subAccNm);
		}else{
			stream.setSubAccNm(CiticConfig.EMPTY);
		}
		stream.setAutoAssignInterestFlag(AutoAssignInterestFlagEnum.NO.getCode());
		stream.setCalInterestFlag(CalInterestFlagEnum.NO.getCode());
		stream.setInterestRate("0");
		stream.setAutoAssignTranFeeFlag(autoAssignTranFeeFlag);
		stream.setFeeType(feeType);
		System.out.println(Bean2Json.convertJson(stream));
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		BaseVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new BaseVo(result.getStatusText(),stream);
		}else{
			vo = new BaseVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}

	/**
	 * 在线销户
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param subAccNo
	 *            附属账号
	 * @param subAccNm
	 *            附属账户名称
	 * @param AutoAssignTranFeeFlag
	 *            自动分配转账手续费标char(1)，0：否；1：是
	 * @param feeType
	 *            手续费收取方式 char(1)，0：不收取；1：实时收取；2：月末累计
	 * @return
	 */	
	@Override
	public String accountCancellation(String invokeUser, String subAccNo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLOLCACC);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setMainAccNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setSubAccNo(subAccNo);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		AccountCancellationVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new AccountCancellationVo(result.getStatusText(),stream);
			vo.setSubAccNo(result.getSubAccNo());
			vo.setSubAccNm(result.getSubAccNm());
		}else{
			vo = new AccountCancellationVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}
	
	/**
	 * 调账入款
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param recvAccNo
	 *            调入交易资金账号
	 * @param recvAccNm
	 *            调入交易资金账户名称
	 * @param tranAmt
	 *            调账金额
	 * @param hostDate
	 *            被调账日期
	 * @param hostFlw
	 *            被调账柜员交易号
	 * @param hostSeq
	 *            被调账交易序号
	 * @param memo
	 *            摘要             	             	             
	 * @return
	 */	
	@Override
	public String deposit(String invokeUser, String recvAccNo, String recvAccNm, String tranAmt, String hostDate,
			String hostFlw, String hostSeq, String memo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLTRSFIN);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(ClientIDUtil.generateClientID());
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_ADJUSTMENTS));
		stream.setRecvAccNo(recvAccNo);
		stream.setRecvAccNm(recvAccNm);
		stream.setTranAmt(tranAmt);
		stream.setHostDate(hostDate);
		stream.setHostFlw(hostFlw);
		stream.setHostSeq(hostSeq);
		if (StringUtils.isNotEmpty(memo)) {
			stream.setMemo(memo);
		} else {
			stream.setMemo(CiticConfig.EMPTY);
		}
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		// 状态处理
		BaseVo vo = statusCheck(stream, result, invokeUser, CiticConfig.ACTION_DLTRSFIN);
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}

	/**
	 * 错帐调回
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param payAccNo
	 *            调入会员交易资金账号
	 * @param tranAmt
	 *            调回金额
	 * @param hostDate
	 *            被调账日期
	 * @param hostFlw
	 *            被调账柜员交易号
	 * @param hostSeq
	 *            被调账交易序号
	 * @param memo
	 *            摘要             	             	             
	 * @return
	 */		
	@Override
	public String depositBack(String invokeUser, String payAccNo, String tranAmt, String hostDate, String hostFlw,
			String hostSeq, String memo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLWFDRTN);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(ClientIDUtil.generateClientID());
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
        stream.setPayAccNo(payAccNo);
        stream.setRecvAccNo(CiticProps.getProperty(CiticConfig.ACCOUNT_ADJUSTMENTS));
        stream.setRecvAccNm(CiticProps.getProperty(CiticConfig.ACCOUNT_ADJUSTMENTS_NAME));
		stream.setTranAmt(tranAmt);
		stream.setHostDate(hostDate);
		stream.setHostFlw(hostFlw);
		stream.setHostSeq(hostSeq);
		if (StringUtils.isNotEmpty(memo)) {
			stream.setMemo(memo);
		} else {
			stream.setMemo(CiticConfig.EMPTY);
		}
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		// 状态处理
		BaseVo vo = statusCheck(stream, result, invokeUser, CiticConfig.ACTION_DLWFDRTN);
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);
	}

	/**
	 * 附属账户签约状态查询
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param subAccNo
	 *            附属账号
	 * @param stt
	 *            状态 char(1)，0：正常；1：待审核；2：注销；3：审核拒绝；可空，空则代表全部状态
	 * @param startDate
	 *            开始日期
	 * @param endDate
	 *            截止日期            	             	             
	 * @return
	 */	
	@Override
	public String queryMemberInfo(String invokeUser, String subAccNo, String stt, String startDate, String endDate) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLSASQRY);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setMainAccNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));	
		stream.setStt(stt);
		stream.setSubAccNo(subAccNo);
		stream.setStartDate(startDate);
		stream.setEndDate(endDate);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		MemberInfoVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new MemberInfoVo(result.getStatusText(),stream);
			Row row = result.getList().getRow().get(0);
			vo.setSubAccNo(row.getSubAccNo());
			vo.setSubAccNm(row.getSubAccNm());
			vo.setAccType(row.getAccType());
			vo.setStatus(row.getStatus());
			vo.setCalInterestFlag(row.getCalInterestFlag());
			vo.setInterestRate(row.getInterestRate());
			vo.setFeeType(row.getFeeType());
			vo.setOverFlag(row.getOverFlag());
			vo.setOverAmt(row.getOverAmt());
			vo.setOverRate(row.getOverRate());
			vo.setAutoAssignInterestFlag(row.getAutoAssignInterestFlag());
			vo.setAutoAssignTranFeeFlag(row.getAutoAssignTranFeeFlag());
			vo.setCenterNo(row.getCenterNo());
			vo.setCenterNm(row.getCenterNm());
			vo.setRealNameParm(row.getRealNameParm());
			vo.setSubAccPrintParm(row.getSubAccPrintParm());		
		}else{
			vo = new MemberInfoVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}

	/**
	 * 附属账户手续费查询
	 * 
	 * @param invokeUser
	 *            调用者信息	 
	 * @param subAccNo
	 *            附属账号
	 * @param tranDate
	 *            查询日期            	             	             
	 * @return
	 */		
	@Override
	public String queryHandlingCharge(String invokeUser, String subAccNo, String tranDate) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLSAFQRY);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setSubAccNo(subAccNo);
        stream.setTranDate(tranDate);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		HandlingChargeVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new HandlingChargeVo(result.getStatusText(),stream);
			List<Row> rowList = result.getList().getRow();
			if(rowList != null && rowList.size()>0){
				List<HandlingChargeDetailVo> handlingChargeList = new ArrayList<HandlingChargeDetailVo>();
				for(Row row :rowList){
					HandlingChargeDetailVo detailVo = BeanMapper.map(row, HandlingChargeDetailVo.class);
					handlingChargeList.add(detailVo);
				}
				vo.setHandlingChargeList(handlingChargeList);
			}
		}else{
			vo = new HandlingChargeVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}
	
	/**
	 * 查询账户冻结信息
	 * 
	 * @param invokeUser
	 *            调用者
	 * @param subAccNo
	 *            附属账户
	 * @param startDate
	 *            起始日期
	 * @param endDate
	 *            终止日期
	 * @return
	 */
	@Override
	public String findFreezeNo(String invokeUser, String subAccNo, String startDate, String endDate) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLSFRZQR);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setAccountNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setSubAccNo(subAccNo);
		stream.setStartDate(startDate);
		stream.setEndDate(endDate);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		FreezeVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new FreezeVo(result.getStatusText(),stream);
			List<Row> row = result.getList().getRow();
            List<FreezeDetailVo> freezeDetailList = BeanMapper.mapList(row, FreezeDetailVo.class);
            vo.setFreezeList(freezeDetailList);
		}else{
			vo = new FreezeVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		//查找冻结编号
		String freezeNo = getFreezeNo(vo);
		return Bean2Json.convertJson(freezeNo);		
	}
	
	/**
	 * 获取冻结编号
	 * 
	 * @param freezeVo
	 *            冻结信息列表	 
	 * @param dateStr
	 *            时间戳           	             	             
	 * @return
	 */		
	private String getFreezeNo(FreezeVo freezeVo) {
		List<FreezeDetailVo> list = freezeVo.getFreezeList();
		if(list != null && list.size()>0){
			//根据djtime字段来排序，然后取出第一条。
			Collections.sort(list, new Comparator<FreezeDetailVo>(){
				@Override
				public int compare(FreezeDetailVo o1, FreezeDetailVo o2) {
					return Long.decode(o2.getDJTIME()).compareTo(Long.decode(o1.getDJTIME()));
				}
			});
			return list.get(0).getDJCODE();			
		}
        return "";
	}

	/**
	 * 手工结息
	 * 
	 * @param invokeUser
	 *            调用者
	 * @param subAccNo
	 *            附属账号          	             	             
	 * @return
	 */	
	@Override
	public String manualKnot(String invokeUser, String subAccNo) {
		Stream stream = new Stream();
		stream.setAction(CiticConfig.ACTION_DLIRTSTL);
		stream.setUserName(CiticProps.getProperty(CiticConfig.ACCOUNT_USERNAME));
		stream.setClientID(ClientIDUtil.generateClientID());
		stream.setMainAccNo(CiticProps.getProperty(CiticConfig.ACCOUNT_MAIN));
		stream.setSubAccNo(subAccNo);
		Result result = HttpUtil.postXml(stream,CiticProps.getProperty(CiticConfig.URL));
		System.out.println(result.getStatus());
		System.out.println(result.getStatusText());
		RegisterVo vo = null;
		// 判定编译成功
		if (result != null && CiticConfig.TRADE_STATUS_AAAAAAA.equals(result.getStatus())) {
			vo = new RegisterVo(result.getStatusText(),stream);
			vo.setSubAccNo(result.getSubAccNo());
			vo.setSubAccNm(result.getSubAccNm());
		}else{
			vo = new RegisterVo(CiticConfig.ERROR,result.getStatusText(),stream);
		}		
		//保存日志
		generateLog(invokeUser, stream, result);
		return Bean2Json.convertJson(vo);		
	}
	
}