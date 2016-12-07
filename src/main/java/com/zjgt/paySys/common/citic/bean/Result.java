package com.zjgt.paySys.common.citic.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("stream")
public class Result {
	/**
	 * 浜ゆ槗鐘舵��
	 */
	private String status;
	/**
	 * 浜ゆ槗鐘舵�佷俊鎭�
	 */
	private String statusText;
	
	private UserDataList list;
	/**
	 * 鍟嗘埛缁撶畻璐﹀彿char(19)
	 */
	private String accountNo;
	/**
	 * 娓呯畻鏃ユ湡char(8) 
	 */
	private String date;
	/**
	 * 瀵硅处鏂囦欢鍐呭锛岄』鐢˙ASE64鏂瑰紡杩涜瑙ｇ爜
	 */
	private String fileContent;
	/**
	 * 鍟嗘埛娴佹按鍙穠archar(20)
	 */
	private String mctJnlNo;
	/**
	 * 瀹㈡埛鍙� char(12)
	 */
	private String hostNo;
	/**
	 * 闄勫睘璐﹀彿 char(19)-
	 */
	private String subAccNo;	
	/**
	 * 闄勫睘璐︽埛鍚嶇О varchar(122)
	 */
	private String subAccNm;
	/**
	 * 杩斿洖璁板綍鏉℃暟
	 */
	private String returnRecords;	
	/**
	 * 浜ゆ槗鏃ユ湡
	 */
	private String tranDate;
	/**
	 * 浜ゆ槗鏃堕棿 
	 */
	private String tranTime;
	/**
	 * 鏌滃憳浜ゆ槗鍙� 
	 */
	private String tranNo;	
	/**
	 * 浠樻璐﹀彿
	 */
	private String payAccountNo;	
	/**
	 * 浠樻璐︽埛鍚嶇О
	 */
	private String payAccountName;		
	/**
	 * 浠樻璐﹀彿寮�鎴疯 varchar(122)
	 */
	private String payOpenBankName;	
	/**
	 * 鏀舵璐﹀彿
	 */
	private String recAccountNo;
	/**
	 * 鏀舵璐︽埛鍚嶇О
	 */
	private String recAccountName;
	/**
	 * 鏀舵璐﹀彿寮�鎴疯
	 */
	private String recOpenBankName;	
	/**
	 * 閲戦 decimal(15,2)
	 */
	private String tranAmount;	
	/**
	 * 鎽樿
	 */
	@XStreamAlias("abstract")
	private String resume;	
	/**
	 * 鎽樿varchar(102) 鍙┖
	 */
	private String memo;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusText() {
		return statusText;
	}

	public void setStatusText(String statusText) {
		this.statusText = statusText;
	}

	public UserDataList getList() {
		return list;
	}

	public void setList(UserDataList list) {
		this.list = list;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getMctJnlNo() {
		return mctJnlNo;
	}

	public void setMctJnlNo(String mctJnlNo) {
		this.mctJnlNo = mctJnlNo;
	}

	public String getHostNo() {
		return hostNo;
	}

	public void setHostNo(String hostNo) {
		this.hostNo = hostNo;
	}

	public String getSubAccNo() {
		return subAccNo;
	}

	public String getSubAccNm() {
		return subAccNm;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
	}

	public String getReturnRecords() {
		return returnRecords;
	}

	public void setReturnRecords(String returnRecords) {
		this.returnRecords = returnRecords;
	}

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
