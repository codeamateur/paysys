package com.zjgt.paySys.common.citic.vo;

public class HandlingChargeDetailVo {
	/**
	 * 附属账号varchar(19) 
	 */
	private String subAccNo;	
	/**
	 * 币种 char(2)
	 */
	private String cryType;
	/**
	 * 交易日期 char(8)
	 */
	private String tranDate;
	/**
	 * 交易时间 char(8)
	 */
	private String tranTime;
	/**
	 * 交易金额 decimal(15,2)
	 */
	private String tranAmt;
	/**
	 * 手续费金额 decimal(15,2)-
	 */
	private String feeAmt;
	/**
	 * 付款账号 char(19)-
	 */
	private String payAccNo;
	/**
	 * 付款账户名称 varchar(122)-
	 */
	private String payAccNm;
	/**
	 * 收款账号 varchar(32)-
	 */
	private String recvAccNo;
	/**
	 * 收款账户名称 varchar(122)-
	 */
	private String recvAccNm;
	public String getSubAccNo() {
		return subAccNo;
	}
	public String getCryType() {
		return cryType;
	}
	public String getTranDate() {
		return tranDate;
	}
	public String getTranTime() {
		return tranTime;
	}
	public String getTranAmt() {
		return tranAmt;
	}
	public String getFeeAmt() {
		return feeAmt;
	}
	public String getPayAccNo() {
		return payAccNo;
	}
	public String getPayAccNm() {
		return payAccNm;
	}
	public String getRecvAccNo() {
		return recvAccNo;
	}
	public String getRecvAccNm() {
		return recvAccNm;
	}
	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}
	public void setCryType(String cryType) {
		this.cryType = cryType;
	}
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}
	public void setTranAmt(String tranAmt) {
		this.tranAmt = tranAmt;
	}
	public void setFeeAmt(String feeAmt) {
		this.feeAmt = feeAmt;
	}
	public void setPayAccNo(String payAccNo) {
		this.payAccNo = payAccNo;
	}
	public void setPayAccNm(String payAccNm) {
		this.payAccNm = payAccNm;
	}
	public void setRecvAccNo(String recvAccNo) {
		this.recvAccNo = recvAccNo;
	}
	public void setRecvAccNm(String recvAccNm) {
		this.recvAccNm = recvAccNm;
	}
	
}
