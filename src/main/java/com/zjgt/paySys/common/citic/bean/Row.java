package com.zjgt.paySys.common.citic.bean;

public class Row {
	/**
	 * 付款账号 varchar(19)
	 */
	private String payAccNo;
	/**
	 * 付款账户名称 varchar(122)
	 */
	private String payAccNm;
	/**
	 * 原订单号 varchar(20)
	 */
	private String orderNo;
	/**
	 * 交易日期 char(8)
	 */
	private String tranDate;
	/**
	 * 交易时间 char(6)
	 */
	private String tranTime;
	/**
	 * 充退流水号（序号）char(20)-
	 */
	private String seqNo;
	/**
	 * 充值退回金额 decimal(15, 2)
	 */
	private String tranAmt;
	/**
	 * 收款账号 char(19)
	 */
	private String recvAccNo;
	/**
	 * 收款账户名称 char(122)
	 */
	private String recvAccNm;
	/**
	 * 冻结标志 char(1) Y：已冻结 N：未冻结
	 */
	private String freezeFlg;
	/**
	 * 摘要 varchar(102)
	 */
	private String memo;
	/**
	 * 状态标志 char(2) 00：处理中 01：成功 02：失败
	 */
	private String stt;
	/**
	 * 状态代码 char(7)
	 */
	private String status;
	/**
	 * 状态信息varchar(254)
	 */
	private String statusText;
	/**
	 * 附属账号varchar(19)
	 */
	private String subAccNo;
	/**
	 * 附属账户名称varchar(122)
	 */
	private String SUBACCNM;
	/**
	 * 透支额度decimal(15,2)
	 */
	private String TZAMT;
	/**
	 * 实体账户可用资金decimal(15,2)
	 */
	private String XSACVL;
	/**
	 * 可用余额 decimal(15,2)
	 */
	private String KYAMT;
	/**
	 * 实际余额decimal(15,2)
	 */
	private String SJAMT;
	/**
	 * 冻结金额decimal(15,2)
	 */
	private String DJAMT;
	/**
	 * 冻结类型varchar(2)
	 */
	private String DJTYPE;
	/**
	 * 冻结编号varchar(22)
	 */
	private String DJCODE;
	/**
	 * 冻结日期char(8)
	 */
	private String DJDATE;
	/**
	 * 冻结时间char(6)
	 */
	private String DJTIME;
	/**
	 * 冻结柜员交易号varchar(14)
	 */
	private String DJOPR;
	/**
	 * 解冻日期char(8)
	 */
	private String JDDATE;
	/**
	 * 解冻时间char(6)
	 */
	private String JDTIME;
	/**
	 * 解冻柜员交易号varchar(14)
	 */
	private String JDOPR;
	/**
	 * 受理原因varchar(60)-
	 */
	private String REASON;
	/**
	 * 交易类型varchar(2)
	 */
	private String TRANTYPE;
	/**
	 * 交易日期char(8)
	 */
	private String TRANDATE;
	/**
	 * 交易时间char(6)
	 */
	private String TRANTIME;
	/**
	 * 柜员交易号varchar(14)
	 */
	private String HOSTFLW;
	/**
	 * 交易序号varchar(13)
	 */
	private String HOSTSEQ;
	/**
	 * 对方账号varchar(19)-
	 */
	private String OPPACCNO;
	/**
	 * 对方账户名称varchar(122)
	 */
	private String OPPACCNAME;
	/**
	 * 对方开户行名称varchar(122)
	 */
	private String OPPBRANCHNAME;
	/**
	 * 借贷标志varchar (1) D：借，C：贷
	 */
	private String CDFG;
	/**
	 * 交易金额decimal(15,2)
	 */
	private String TRANAMT;
	/**
	 * 账户余额decimal(15,2)
	 */
	private String ACCBAL;
	/**
	 * 手续费金额decimal(15,2)
	 */
	private String XTSFAM;
	/**
	 * 摘要varchar(102)
	 */
	private String RESUME;

	/**
	 * 对方支付联行号varchar(20)
	 */
	private String OPPBANKNO;
	/**
	 * 冻结编号varchar(22)
	 */
	private String freezeNo;
	/**
	 * 货币代码char(3)
	 */
	private String cryCode;
	/**
	 * 网络编号varchar(20)
	 */
	private String netWorkCode;
	/**
	 * 市场额度decimal(15,2)
	 */
	private String amount;
	/**
	 * 已用额度decimal(15,2)
	 */
	private String usedAmt;
	/**
	 * 未用额度decimal(15,2)
	 */
	private String unUsedAmt;
	/**
	 * 到期日char(8) ，格式YYYYMMDD
	 */
	private String ntDate;
	/**
	 * 是否临时额度varchar(2) 1：否；2：是
	 */
	private String isTempAmt;
	/**
	 * 是否可循环char(1) 1：循环；2：非循环
	 */
	private String isLoop;
	/**
	 * 网络起始日char(8) ，格式YYYYMMDD
	 */
	private String ntStartDate;
	/**
	 * 经办机构名称varchar(122)
	 */
	private String oprOrgName;
	/**
	 * 经办机构编号 varchar(100)
	 */
	private String oprOrgCode;
	/**
	 * 仓库代码varchar(30)
	 */
	private String wareHouseCode;
	/**
	 * 仓库名称varchar(300)
	 */
	private String wareHouseNm;
	/**
	 * 详细地址varchar(300)
	 */
	private String address;
	/**
	 * 联系人姓名 varchar(122) 
	 */
	private String contactName;
	/**
	 * 联系电话 varchar(20)
	 */
	private String contactPhone;	
	/**
	 * 邮件地址 varchar(152) 
	 */
	private String mailAddress;
	/**
	 * 交易类型 varchar(2) 
	 */
	private String tranType;	
	/**
	 * 柜员交易号
	 */
	private String tellerNo;	
	/**
	 * 交易序号 varchar(13) 
	 */
	private String tranSeqNo;
	/**
	 * 对方账号 varchar(19)
	 */
	private String accountNo;	
	/**
	 * 对方账户名称 varchar(122)
	 */
	private String accountNm;	
	/**
	 * 对方开户行名称 varchar(122) 
	 */
	private String accBnkNm;
	/**
	 * 借贷标识 "D":借,"C":贷 varchar(1)  
	 */
	private String loanFlag;	
	/**
	 * 账户余额 decimal(15,2)   
	 */
	private String accBalAmt;
	/**
	 * 手续费金额 decimal(15,2) 
	 */
	private String pdgAmt;
	/**
	 * 打印校验码 varchar(20)
	 */
	private String verifyCode;	
	/**
	 * 币种代码 char(2)
	 */
	private String CRYTYPE;
	/**
	 * 附属账户名称
	 */
	private String subAccNm;		
	/**
	 * 附属账户类型char(2)，03：一般交易账号；04：保证金帐
	 */
	private String accType;	
	/**
	 * 是否计算利息标示char(1)，0：不计息 1：不分段计息 2：分段计息
	 */
	private String calInterestFlag;
	/**
	 * -默认计息利率
	 */
	private String interestRate;
	/**
	 * 手续费收取方式char(1)，空：不收取；1：实时收取；2：月末累计
	 */
	private String feeType;
	/**
	 * 是否允许透支char(1)，0：不允许；1：限额透支；2：全额透支
	 */
	private String overFlag;
	/**
	 * 透支额度
	 */
	private String overAmt;	
	/**
	 * 透支利率
	 */
	private String overRate;
	/**
	 * 自动分配利息标示char(1)，0：否；1；是
	 */
	private String autoAssignInterestFlag;
	/**
	 * 自动分配手续费标示
	 */
	private String autoAssignTranFeeFlag;		
	/**
	 * 会员签约中心
	 */
	private String centerNo;
	/**
	 * 会员签约中心名称
	 */
	private String centerNm;
	/**
	 * 实名制更换char(1)，0：账户名与账号全不换；1：账户名与账号全换；2：换账户名；3：换账号
	 */
	private String realNameParm;	
	/**
	 * 附属账户凭证打印更换char(1)， 0：全部显示；1：显示附属账户名和账号；2：显示实体账户名和账号；3：显示附属账户名和实体账号；4：显示实体账户名和附属账号
	 */
	private String subAccPrintParm;
	/**
	 * 币种 char(2)
	 */
	private String cryType;	
	/**
	 * 手续费金额 decimal(15,2)
	 */
	private String feeAmt;	
	
	public String getPayAccNo() {
		return payAccNo;
	}

	public String getPayAccNm() {
		return payAccNm;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public String getTranDate() {
		return tranDate;
	}

	public String getTranTime() {
		return tranTime;
	}

	public String getSeqNo() {
		return seqNo;
	}

	public String getTranAmt() {
		return tranAmt;
	}

	public String getRecvAccNo() {
		return recvAccNo;
	}

	public String getRecvAccNm() {
		return recvAccNm;
	}

	public String getFreezeFlg() {
		return freezeFlg;
	}

	public String getMemo() {
		return memo;
	}

	public String getStt() {
		return stt;
	}

	public String getStatus() {
		return status;
	}

	public String getStatusText() {
		return statusText;
	}

	public String getSubAccNo() {
		return subAccNo;
	}

	public String getSUBACCNM() {
		return SUBACCNM;
	}

	public String getTZAMT() {
		return TZAMT;
	}

	public String getXSACVL() {
		return XSACVL;
	}

	public String getKYAMT() {
		return KYAMT;
	}

	public String getSJAMT() {
		return SJAMT;
	}

	public String getDJAMT() {
		return DJAMT;
	}

	public String getDJTYPE() {
		return DJTYPE;
	}

	public String getDJCODE() {
		return DJCODE;
	}

	public String getDJDATE() {
		return DJDATE;
	}

	public String getDJTIME() {
		return DJTIME;
	}

	public String getDJOPR() {
		return DJOPR;
	}

	public String getJDDATE() {
		return JDDATE;
	}

	public String getJDTIME() {
		return JDTIME;
	}

	public String getJDOPR() {
		return JDOPR;
	}

	public String getREASON() {
		return REASON;
	}

	public String getTRANTYPE() {
		return TRANTYPE;
	}

	public String getTRANDATE() {
		return TRANDATE;
	}

	public String getTRANTIME() {
		return TRANTIME;
	}

	public String getHOSTFLW() {
		return HOSTFLW;
	}

	public String getHOSTSEQ() {
		return HOSTSEQ;
	}

	public String getOPPACCNO() {
		return OPPACCNO;
	}

	public String getOPPACCNAME() {
		return OPPACCNAME;
	}

	public String getOPPBRANCHNAME() {
		return OPPBRANCHNAME;
	}

	public String getCDFG() {
		return CDFG;
	}

	public String getTRANAMT() {
		return TRANAMT;
	}

	public String getACCBAL() {
		return ACCBAL;
	}

	public String getXTSFAM() {
		return XTSFAM;
	}

	public String getRESUME() {
		return RESUME;
	}

	public String getOPPBANKNO() {
		return OPPBANKNO;
	}

	public String getFreezeNo() {
		return freezeNo;
	}

	public String getCryCode() {
		return cryCode;
	}

	public String getNetWorkCode() {
		return netWorkCode;
	}

	public String getAmount() {
		return amount;
	}

	public String getUsedAmt() {
		return usedAmt;
	}

	public String getUnUsedAmt() {
		return unUsedAmt;
	}

	public String getNtDate() {
		return ntDate;
	}

	public String getIsTempAmt() {
		return isTempAmt;
	}

	public String getIsLoop() {
		return isLoop;
	}

	public String getNtStartDate() {
		return ntStartDate;
	}

	public String getOprOrgName() {
		return oprOrgName;
	}

	public String getOprOrgCode() {
		return oprOrgCode;
	}

	public String getWareHouseCode() {
		return wareHouseCode;
	}

	public String getWareHouseNm() {
		return wareHouseNm;
	}

	public String getAddress() {
		return address;
	}

	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}

	public void setPayAccNm(String payAccNm) {
		this.payAccNm = payAccNm;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}

	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}

	public void setRecvAccNm(String recvAccNm) {
		this.recvAccNm = recvAccNm;
	}

	public void setFreezeFlg(String freezeFlg) {
		this.freezeFlg = freezeFlg;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public void setSUBACCNM(String sUBACCNM) {
		SUBACCNM = sUBACCNM;
	}

	public void setTZAMT(String tZAMT) {
		TZAMT = tZAMT;
	}

	public void setXSACVL(String xSACVL) {
		XSACVL = xSACVL;
	}

	public void setKYAMT(String kYAMT) {
		KYAMT = kYAMT;
	}

	public void setSJAMT(String sJAMT) {
		SJAMT = sJAMT;
	}

	public void setDJAMT(String dJAMT) {
		DJAMT = dJAMT;
	}

	public void setDJTYPE(String dJTYPE) {
		DJTYPE = dJTYPE;
	}

	public void setDJCODE(String dJCODE) {
		DJCODE = dJCODE;
	}

	public void setDJDATE(String dJDATE) {
		DJDATE = dJDATE;
	}

	public void setDJTIME(String dJTIME) {
		DJTIME = dJTIME;
	}

	public void setDJOPR(String dJOPR) {
		DJOPR = dJOPR;
	}

	public void setJDDATE(String jDDATE) {
		JDDATE = jDDATE;
	}

	public void setJDTIME(String jDTIME) {
		JDTIME = jDTIME;
	}

	public void setJDOPR(String jDOPR) {
		JDOPR = jDOPR;
	}

	public void setREASON(String rEASON) {
		REASON = rEASON;
	}

	public void setTRANTYPE(String tRANTYPE) {
		TRANTYPE = tRANTYPE;
	}

	public void setTRANDATE(String tRANDATE) {
		TRANDATE = tRANDATE;
	}

	public void setTRANTIME(String tRANTIME) {
		TRANTIME = tRANTIME;
	}

	public void setHOSTFLW(String hOSTFLW) {
		HOSTFLW = hOSTFLW;
	}

	public void setHOSTSEQ(String hOSTSEQ) {
		HOSTSEQ = hOSTSEQ;
	}

	public void setOPPACCNO(String oPPACCNO) {
		OPPACCNO = oPPACCNO;
	}

	public void setOPPACCNAME(String oPPACCNAME) {
		OPPACCNAME = oPPACCNAME;
	}

	public void setOPPBRANCHNAME(String oPPBRANCHNAME) {
		OPPBRANCHNAME = oPPBRANCHNAME;
	}

	public void setCDFG(String cDFG) {
		CDFG = cDFG;
	}

	public void setTRANAMT(String tRANAMT) {
		TRANAMT = tRANAMT;
	}

	public void setACCBAL(String aCCBAL) {
		ACCBAL = aCCBAL;
	}

	public void setXTSFAM(String xTSFAM) {
		XTSFAM = xTSFAM;
	}

	public void setRESUME(String rESUME) {
		RESUME = rESUME;
	}

	public void setOPPBANKNO(String oPPBANKNO) {
		OPPBANKNO = oPPBANKNO;
	}

	public void setFreezeNo(String freezeNo) {
		this.freezeNo = freezeNo;
	}

	public void setCryCode(String cryCode) {
		this.cryCode = cryCode;
	}

	public void setNetWorkCode(String netWorkCode) {
		this.netWorkCode = netWorkCode;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setUsedAmt(String usedAmt) {
		this.usedAmt = usedAmt;
	}

	public void setUnUsedAmt(String unUsedAmt) {
		this.unUsedAmt = unUsedAmt;
	}

	public void setNtDate(String ntDate) {
		this.ntDate = ntDate;
	}

	public void setIsTempAmt(String isTempAmt) {
		this.isTempAmt = isTempAmt;
	}

	public void setIsLoop(String isLoop) {
		this.isLoop = isLoop;
	}

	public void setNtStartDate(String ntStartDate) {
		this.ntStartDate = ntStartDate;
	}

	public void setOprOrgName(String oprOrgName) {
		this.oprOrgName = oprOrgName;
	}

	public void setOprOrgCode(String oprOrgCode) {
		this.oprOrgCode = oprOrgCode;
	}

	public void setWareHouseCode(String wareHouseCode) {
		this.wareHouseCode = wareHouseCode;
	}

	public void setWareHouseNm(String wareHouseNm) {
		this.wareHouseNm = wareHouseNm;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactName() {
		return contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getTranType() {
		return tranType;
	}

	public String getTellerNo() {
		return tellerNo;
	}

	public String getTranSeqNo() {
		return tranSeqNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountNm() {
		return accountNm;
	}

	public String getAccBnkNm() {
		return accBnkNm;
	}

	public String getLoanFlag() {
		return loanFlag;
	}

	public String getAccBalAmt() {
		return accBalAmt;
	}

	public String getPdgAmt() {
		return pdgAmt;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public void setTellerNo(String tellerNo) {
		this.tellerNo = tellerNo;
	}

	public void setTranSeqNo(String tranSeqNo) {
		this.tranSeqNo = tranSeqNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountNm(String accountNm) {
		this.accountNm = accountNm;
	}

	public void setAccBnkNm(String accBnkNm) {
		this.accBnkNm = accBnkNm;
	}

	public void setLoanFlag(String loanFlag) {
		this.loanFlag = loanFlag;
	}

	public void setAccBalAmt(String accBalAmt) {
		this.accBalAmt = accBalAmt;
	}

	public void setPdgAmt(String pdgAmt) {
		this.pdgAmt = pdgAmt;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getCRYTYPE() {
		return CRYTYPE;
	}

	public void setCRYTYPE(String cRYTYPE) {
		CRYTYPE = cRYTYPE;
	}

	public String getSubAccNm() {
		return subAccNm;
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

	public String getFeeType() {
		return feeType;
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

	public String getCenterNo() {
		return centerNo;
	}

	public String getCenterNm() {
		return centerNm;
	}

	public String getRealNameParm() {
		return realNameParm;
	}

	public String getSubAccPrintParm() {
		return subAccPrintParm;
	}

	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
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

	public void setFeeType(String feeType) {
		this.feeType = feeType;
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

	public void setCenterNo(String centerNo) {
		this.centerNo = centerNo;
	}

	public void setCenterNm(String centerNm) {
		this.centerNm = centerNm;
	}

	public void setRealNameParm(String realNameParm) {
		this.realNameParm = realNameParm;
	}

	public void setSubAccPrintParm(String subAccPrintParm) {
		this.subAccPrintParm = subAccPrintParm;
	}

	public String getCryType() {
		return cryType;
	}

	public String getFeeAmt() {
		return feeAmt;
	}

	public void setCryType(String cryType) {
		this.cryType = cryType;
	}

	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}

}
