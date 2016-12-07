package com.zjgt.paySys.common.citic.enums;

public enum AppFlagEnum {
	B2B("2","电子商务"),
	CASH_DEPOSIT("3","投标保证金");
	private String code;
	private String message;
	private AppFlagEnum(String code, String message) {
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
