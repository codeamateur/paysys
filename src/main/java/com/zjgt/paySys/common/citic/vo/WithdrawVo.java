package com.zjgt.paySys.common.citic.vo;

import com.zjgt.paySys.common.citic.bean.Stream;

public class WithdrawVo extends BaseVo {
	private static final long serialVersionUID = 1L;
	
	
	public WithdrawVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public WithdrawVo(String code,String msg, Stream requestValues) {
		super(code, msg, requestValues);
	}
	
	/**
	 * 交易日期
	 */
	private String tranDate;
	/**
	 * 交易时间 
	 */
	private String tranTime;
	/**
	 * 柜员交易号 
	 */
	private String tranNo;	
	/**
	 * 付款账号
	 */
	private String payAccountNo;	
	/**
	 * 付款账户名称
	 */
	private String payAccountName;		
	/**
	 * 付款账号开户行 varchar(122)
	 */
	private String payOpenBankName;	
	/**
	 * 收款账号
	 */
	private String recAccountNo;
	/**
	 * 收款账户名称
	 */
	private String recAccountName;
	/**
	 * 收款账号开户行
	 */
	private String recOpenBankName;	
	/**
	 * 金额 decimal(15,2)
	 */
	private String tranAmount;	
	/**
	 * 摘要
	 */
	private String resume;
	/**
	 * 摘要varchar(102) 可空
	 */
	private String memo;


	public String getTranDate() {
		return tranDate;
	}

	public String getTranTime() {
		return tranTime;
	}

	public String getTranNo() {
		return tranNo;
	}

	public String getPayAccountNo() {
		return payAccountNo;
	}

	public String getPayAccountName() {
		return payAccountName;
	}

	public String getPayOpenBankName() {
		return payOpenBankName;
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

	public String getTranAmount() {
		return tranAmount;
	}

	public String getResume() {
		return resume;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public void setTranTime(String tranTime) {
		this.tranTime = tranTime;
	}

	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}

	public void setPayAccountNo(String payAccountNo) {
		this.payAccountNo = payAccountNo;
	}

	public void setPayAccountName(String payAccountName) {
		this.payAccountName = payAccountName;
	}

	public void setPayOpenBankName(String payOpenBankName) {
		this.payOpenBankName = payOpenBankName;
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

	public void setTranAmount(String tranAmount) {
		this.tranAmount = tranAmount;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}	
	
	
}
