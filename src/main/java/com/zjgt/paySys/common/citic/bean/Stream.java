package com.zjgt.paySys.common.citic.bean;
	
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("stream")
public class Stream {
	/**
	 * 请求代码
	 */
	private String action;
	/**
	 * 登录名 varchar(30)
	 */
	private String userName;
	/**
	 * 客户流水号 char(20)
	 */
	private String clientID;
	/**
	 * 资金初始化账号varchar(19)
	 */
	private String accountNo;
	/**
	 * 调入附属账号varchar(19)
	 */
	private String subAccNo;
	/**
	 * 调入附属账户名称varchar(122)
	 */
	private String subAccNm;
	/**
	 * 初始化交易金额decimal(15,2)
	 */
	private String tranAmt;
	/**
	 * 摘要varchar(102) 可空
	 */
	private String memo;
	/**
	 * 调入交易资金账号varchar(19)
	 */
	private String recvAccNo;
    /**
     * 调入交易资金账户名称varchar(122)
     */
    private String recvAccNm;
	/**
	 * 被调账日期char(8)
	 */
	private String hostDate;
	/**
	 * 被调账柜员交易号varchar(14)
	 */
	private String hostFlw;
	/**
	 * 被调账交易序号varchar(13)
	 */
	private String hostSeq;
	/**
	 * 调入会员交易资金账号varchar(19)
	 */
	private String payAccNo;
	/**
	 * 中信标识char(1) 0：本行 1： 他行
	 */
	private String sameBank;
	/**
	 * 转账类型varchar(2) ，BF：转账；BG：解冻；BH：解冻支付；BR：冻结；BS：支付冻结
	 */
	private String tranType;
	/**
	 * 冻结编号varchar(22)，转账类型为“解冻”或“解冻支付”时，必输
	 */
	private String freezeNo;
	/**
	 * 转账时效标识char (1)，0：异步交易；1：同步交易
	 */
	private String tranFlag;
	/**
	 * 原订单号varchar(20)
	 */
	private String orderNo;
	/**
	 * 清算日期char(8) 
	 */
	private String date;
	/**
	 * 原请求代码char(8)，可空，若客户能保证各交易类型的流水号唯一，则可空，否则需上送原请求代码。  资金初始化：DLFNDINI；调账入款：DLTRSFIN；错账调回：DLWFDRTN ；入金：DLFONDIN；出金：DLFNDOUT；保证金退还：DLGTYRTN；转账：DLSUBTRN；强制转账：DLMDETRN；平台出金：DLFCSOUT；手工结息：DLIRTSTL
	 */
	private String type;
	/**
	 * 起始日期char(8)
	 */
	private String startDate;
	/**
	 * 终止日期char(8)
	 */
	private String endDate;
	/**
	 * 查询类型 varchar(1) 1：查询待调账交易明细 空：查询全部交易明细
	 */
	private String queryType;
	/**
	 * 起始记录号char(4)
	 */
	private String startRecord;
	/**
	 * 请求记录条数 char(2)最大为10
	 */
	private String pageNumber;
	/**
	 * 商户编号varchar(8)-
	 */
	private String mctNo;
	/**
	 * 商户流水号varchar(20)
	 */
	private String mctJnlNo;
	/**
	 * 法透协议编号 varchar(20) 可空 与商户编号不能同时为空
	 */
	private String lawAgtNo;
	/**
	 * 网络编号varchar(20)
	 */
	private String netWorkCode;
	
	private VilcstDataList list;
	/**
	 * 主体账号char(19)
	 */
	private String mainAccNo;
	/**
	 * 应用系统char(1)， 2：B2B电子商务；3：投标保证金
	 */
	private String appFlag;	
	/**
	 * 附属账户生成方式char(1) ，0：自动输入 ；1：手动生成
	 */
	private String accGenType;
	/**
	 * 附属账户类型 char(2)，03：一般交易账号；04：保证金账号；11：招投标保证金
	 */
	private String accType;	
	/**
	 * 是否计算利息标志 char(1)， 0：不计息；1：不分段计息；2：分段计息；当appFlag为3时，是否计算利息标志必须为0
	 */
	private String calInterestFlag;	
	/**
	 * 默认计息利率 decimal(9.7)，calInterestFlag为 0时，可空；appFlag为3时，必须为0
	 */
	private String interestRate;		
	/**
	 * 是否允许透支char(1)，0：不允许；1：限额透支；2：全额透支 ；appFlag为3时，必须为0
	 */
	private String overFlag;
	/**
	 * 透支额度decimal(15.2)，当overFlag为 0时，可空；appFlag为3时，必须为空
	 */
	private String overAmt;	
	/**
	 * 透支利率decimal(9.7)，当overFlag为 0时，可空；appFlag为3时，必须为空
	 */
	private String overRate;	
	/**
	 * 自动分配利息标示char(1)，0：否；1：是；appFlag为3时，必须为0-
	 */
	private String autoAssignInterestFlag;	
	/**
	 * 自动分配转账手续费标char(1)，0：否；1：是；appFlag为3时，必须为0
	 */
	private String autoAssignTranFeeFlag;		
	/**
	 * 手续费收取方式 char(1)，0：不收取；1：实时收取；2：月末累计；appFlag为3时，必须为0
	 */
	private String feeType;
	/**
	 * 实名制更换char(1) ，0：账户名与账号全不换；1：账户名与账号全换；2：换账户名；3：换账号；appFlag为3时，必须为0
	 */
	private String realNameParm;	
	/**
	 * 附属账户凭证打印更换 char(1)，0：全部显示；1：显示附属账户名和账号；2：显示实体账户名和账号；3：显示附属账户名和实体账号；4：显示实体账户名和附属账号；appFlag为3时，必须为0
	 */
	private String subAccPrintParm;		
	/**
	 * 会员确认中心char(6)
	 */
	private String mngNode;	
	/**
	 * 虚拟客户名称
	 */
	private String vtlCustNm;	
	/**
	 * 法人名称 varchar(122)
	 */
	private String legalPersonNm;	
	/**
	 * 客户证件类型 varchar(1)
	 */
	private String custCertType;
	/**
	 * 客户证件号码 varchar(30) 
	 */
	private String custCertNo;	
	/**
	 * 所属机构 char(3)
	 */
	private String branch;		
	/**
	 * 通讯地址 varchar(152)
	 */
	private String commAddress;	
	/**
	 * 收款账户开户行支付联行号varchar(20) 
	 */
	private String recvTgfi;
	/**
	 * 收款账户开户行名varchar (122)
	 */
	private String recvBankNm;
	/**
	 * 预约日期char(8) 格式：YYYYMMDD 预约时非空
	 */	
	private String preFlg;
	/**
	 * 预约日期char(8) 格式：YYYYMMDD 预约时非空
	 */	
	private String preDate;	
	/**
	 * 预约时间char(6) 格式：hhmmss 预约时非空，只限100000、120000、140000、160000四个时间点
	 */	
	private String preTime;
	/**
	 * 支付方式 00：汇票； 01：中信内部转账；02：大额支付；03：小额支付；04：同城票交char(2) ；05：网银跨行支付
	 */	
	private String payType;	
	/**
	 * -收款人所属银行行号
	 */	
	private String recBankNo;
	/**
	 * 付款账号
	 */	
	private String payAccountNo;
	/**
	 * 收款账号
	 */	
	private String recAccountNo;
	/**
	 * 收款账户名称
	 */	
	private String recAccountName;	
	/**
	 * 收款账户开户行名
	 */	
	private String recOpenBankName;	
	/**
	 * 收款账户开户行联行网点号
	 */	
	private String recOpenBankCode;
	/**
	 * 中信标志 0：中信；1：他行
	 */	
	private String citicbankFlag;	
	/**
	 * 同城标志 0：同城；1：异地
	 */	
	private String cityFlag;	
	/**
	 * 金额
	 */	
	private String tranAmount;	
	/**
	 * 摘要
	 */	
	@XStreamAlias("abstract")
	private String zhaiYao;	
	/**
	 * 取票人姓名
	 */	
	private String takerName;		
	/**
	 * 取票人证件号
	 */	
	private String takerID;	
	/**
	 * 取票人证件类型
	 */	
	private String takerIDType;	
	/**
	 * 状态标志 char(2) 00：处理中 01：成功 02：失败
	 */
	private String stt;
	/**
	 *查询日期
	 */	
	private String tranDate;
	
	public String getAction() {
		return action;
	}
	public String getUserName() {
		return userName;
	}
	public String getClientID() {
		return clientID;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getSubAccNo() {
		return subAccNo;
	}
	public String getSubAccNm() {
		return subAccNm;
	}
	public String getTranAmt() {
		return tranAmt;
	}
	public String getMemo() {
		return memo;
	}
	public String getRecvAccNo() {
		return recvAccNo;
	}
	public String getRecvAccNm() {
		return recvAccNm;
	}
	public String getHostDate() {
		return hostDate;
	}
	public String getHostFlw() {
		return hostFlw;
	}
	public String getHostSeq() {
		return hostSeq;
	}
	public String getPayAccNo() {
		return payAccNo;
	}
	public String getSameBank() {
		return sameBank;
	}
	public String getTranType() {
		return tranType;
	}
	public String getFreezeNo() {
		return freezeNo;
	}
	public String getTranFlag() {
		return tranFlag;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public String getDate() {
		return date;
	}
	public String getType() {
		return type;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getQueryType() {
		return queryType;
	}
	public String getStartRecord() {
		return startRecord;
	}
	public String getPageNumber() {
		return pageNumber;
	}
	public String getMctNo() {
		return mctNo;
	}
	public String getMctJnlNo() {
		return mctJnlNo;
	}
	public String getLawAgtNo() {
		return lawAgtNo;
	}
	public String getNetWorkCode() {
		return netWorkCode;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}
	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
	}
	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}
	public void setRecvAccNm(String recvAccNm) {
		this.recvAccNm = recvAccNm;
	}
	public void setHostDate(String hostDate) {
		this.hostDate = hostDate;
	}
	public void setHostFlw(String hostFlw) {
		this.hostFlw = hostFlw;
	}
	public void setHostSeq(String hostSeq) {
		this.hostSeq = hostSeq;
	}
	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	public void setSameBank(String sameBank) {
		this.sameBank = sameBank;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public void setFreezeNo(String freezeNo) {
		this.freezeNo = freezeNo;
	}
	public void setTranFlag(String tranFlag) {
		this.tranFlag = tranFlag;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	public void setStartRecord(String startRecord) {
		this.startRecord = startRecord;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}
	public void setMctNo(String mctNo) {
		this.mctNo = mctNo;
	}
	public void setMctJnlNo(String mctJnlNo) {
		this.mctJnlNo = mctJnlNo;
	}
	public void setLawAgtNo(String lawAgtNo) {
		this.lawAgtNo = lawAgtNo;
	}
	public void setNetWorkCode(String netWorkCode) {
		this.netWorkCode = netWorkCode;
	}
	public VilcstDataList getList() {
		return list;
	}
	public void setList(VilcstDataList list) {
		this.list = list;
	}
	public String getMainAccNo() {
		return mainAccNo;
	}
	public String getAppFlag() {
		return appFlag;
	}
	public String getAccGenType() {
		return accGenType;
	}
	public String getAccType() {
		return accType;
	}
	public String getCalInterestFlag() {
		return calInterestFlag;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public String getOverFlag() {
		return overFlag;
	}
	public String getOverAmt() {
		return overAmt;
	}
	public String getOverRate() {
		return overRate;
	}
	public String getAutoAssignInterestFlag() {
		return autoAssignInterestFlag;
	}
	public String getAutoAssignTranFeeFlag() {
		return autoAssignTranFeeFlag;
	}
	public String getFeeType() {
		return feeType;
	}
	public String getRealNameParm() {
		return realNameParm;
	}
	public String getSubAccPrintParm() {
		return subAccPrintParm;
	}
	public String getMngNode() {
		return mngNode;
	}
	public String getVtlCustNm() {
		return vtlCustNm;
	}
	public String getLegalPersonNm() {
		return legalPersonNm;
	}
	public String getCustCertType() {
		return custCertType;
	}
	public String getCustCertNo() {
		return custCertNo;
	}
	public String getBranch() {
		return branch;
	}
	public String getCommAddress() {
		return commAddress;
	}
	public void setMainAccNo(String mainAccNo) {
		this.mainAccNo = mainAccNo;
	}
	public void setAppFlag(String appFlag) {
		this.appFlag = appFlag;
	}
	public void setAccGenType(String accGenType) {
		this.accGenType = accGenType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public void setCalInterestFlag(String calInterestFlag) {
		this.calInterestFlag = calInterestFlag;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public void setOverFlag(String overFlag) {
		this.overFlag = overFlag;
	}
	public void setOverAmt(String overAmt) {
		this.overAmt = overAmt;
	}
	public void setOverRate(String overRate) {
		this.overRate = overRate;
	}
	public void setAutoAssignInterestFlag(String autoAssignInterestFlag) {
		this.autoAssignInterestFlag = autoAssignInterestFlag;
	}
	public void setAutoAssignTranFeeFlag(String autoAssignTranFeeFlag) {
		this.autoAssignTranFeeFlag = autoAssignTranFeeFlag;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public void setRealNameParm(String realNameParm) {
		this.realNameParm = realNameParm;
	}
	public void setSubAccPrintParm(String subAccPrintParm) {
		this.subAccPrintParm = subAccPrintParm;
	}
	public void setMngNode(String mngNode) {
		this.mngNode = mngNode;
	}
	public void setVtlCustNm(String vtlCustNm) {
		this.vtlCustNm = vtlCustNm;
	}
	public void setLegalPersonNm(String legalPersonNm) {
		this.legalPersonNm = legalPersonNm;
	}
	public void setCustCertType(String custCertType) {
		this.custCertType = custCertType;
	}
	public void setCustCertNo(String custCertNo) {
		this.custCertNo = custCertNo;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setCommAddress(String commAddress) {
		this.commAddress = commAddress;
	}
	public String getRecvTgfi() {
		return recvTgfi;
	}
	public String getRecvBankNm() {
		return recvBankNm;
	}
	public String getPreFlg() {
		return preFlg;
	}
	public String getPreDate() {
		return preDate;
	}
	public String getPreTime() {
		return preTime;
	}
	public void setRecvTgfi(String recvTgfi) {
		this.recvTgfi = recvTgfi;
	}
	public void setRecvBankNm(String recvBankNm) {
		this.recvBankNm = recvBankNm;
	}
	public void setPreFlg(String preFlg) {
		this.preFlg = preFlg;
	}
	public void setPreDate(String preDate) {
		this.preDate = preDate;
	}
	public void setPreTime(String preTime) {
		this.preTime = preTime;
	}
	public String getPayType() {
		return payType;
	}
	public String getRecBankNo() {
		return recBankNo;
	}
	public String getPayAccountNo() {
		return payAccountNo;
	}
	public String getRecAccountNo() {
		return recAccountNo;
	}
	public String getRecAccountName() {
		return recAccountName;
	}
	public String getRecOpenBankName() {
		return recOpenBankName;
	}
	public String getRecOpenBankCode() {
		return recOpenBankCode;
	}
	public String getCiticbankFlag() {
		return citicbankFlag;
	}
	public String getCityFlag() {
		return cityFlag;
	}
	public String getTranAmount() {
		return tranAmount;
	}
	public String getZhaiYao() {
		return zhaiYao;
	}
	public String getTakerName() {
		return takerName;
	}
	public String getTakerID() {
		return takerID;
	}
	public String getTakerIDType() {
		return takerIDType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public void setRecBankNo(String recBankNo) {
		this.recBankNo = recBankNo;
	}
	public void setPayAccountNo(String payAccountNo) {
		this.payAccountNo = payAccountNo;
	}
	public void setRecAccountNo(String recAccountNo) {
		this.recAccountNo = recAccountNo;
	}
	public void setRecAccountName(String recAccountName) {
		this.recAccountName = recAccountName;
	}
	public void setRecOpenBankName(String recOpenBankName) {
		this.recOpenBankName = recOpenBankName;
	}
	public void setRecOpenBankCode(String recOpenBankCode) {
		this.recOpenBankCode = recOpenBankCode;
	}
	public void setCiticbankFlag(String citicbankFlag) {
		this.citicbankFlag = citicbankFlag;
	}
	public void setCityFlag(String cityFlag) {
		this.cityFlag = cityFlag;
	}
	public void setTranAmount(String tranAmount) {
		this.tranAmount = tranAmount;
	}
	public void setZhaiYao(String zhaiYao) {
		this.zhaiYao = zhaiYao;
	}
	public void setTakerName(String takerName) {
		this.takerName = takerName;
	}
	public void setTakerID(String takerID) {
		this.takerID = takerID;
	}
	public void setTakerIDType(String takerIDType) {
		this.takerIDType = takerIDType;
	}
	public String getStt() {
		return stt;
	}
	public void setStt(String stt) {
		this.stt = stt;
	}
	public String getTranDate() {
		return tranDate;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	
}
