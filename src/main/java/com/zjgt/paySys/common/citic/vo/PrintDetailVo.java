package com.zjgt.paySys.common.citic.vo;

public class PrintDetailVo {
	/**
	 * 附属账号varchar(19) 
	 */
	private String subAccNo;	
	/**
	 * 交易类型 varchar(2) 
	 */
	private String tranType;
	/**
	 * 交易日期 char(8) 格式YYYYMMDD 
	 */
	private String tranDate;
	/**
	 * 交易时间 char(6) 格式HHMMSS 
	 */
	private String tranTime;		
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
	 * 充值退回金额 decimal(15, 2)
	 */
	private String tranAmt;
	/**
	 * 摘要 varchar(102)
	 */
	private String memo;
	public String getSubAccNo() {
		return subAccNo;
	}
	public String getTranType() {
		return tranType;
	}
	public String getTranDate() {
		return tranDate;
	}
	public String getTranTime() {
		return tranTime;
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
	public String getTranAmt() {
		return tranAmt;
	}
	public String getMemo() {
		return memo;
	}
	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
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
	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
}
