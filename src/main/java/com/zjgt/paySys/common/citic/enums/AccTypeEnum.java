/**
 * 
 */
package com.zjgt.paySys.common.citic.enums;

/**
 * @author zjgt316
 *
 */
public enum AccTypeEnum {
	TRADE_ACCOUNT("03","一般交易账号"),
	CASH_DEPOSIT_ACCOUNT("04","保证金账号"),
	BID_ACCOUNT("11","招投标保证金");
	private String code;
	private String message;
	private AccTypeEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
