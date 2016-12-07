package com.zjgt.paySys.common.citic.vo;

public class FreezeDetailVo {
	
	/**
	 * 附属账号varchar(19)
	 */
	private String subAccNo;
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
	public String getSubAccNo() {
		return subAccNo;
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
	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
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
	
	
}
