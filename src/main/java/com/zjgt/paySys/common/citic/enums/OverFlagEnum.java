/**
 * 
 */
package com.zjgt.paySys.common.citic.enums;

/**
 * @author zjgt316
 *
 */
public enum OverFlagEnum {
	NO("0","不允许"),
	LIMIT("1","限额透支"),
	YES("2","全额透支");
	private String code;
	private String message;
	private OverFlagEnum(String code, String message) {
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
