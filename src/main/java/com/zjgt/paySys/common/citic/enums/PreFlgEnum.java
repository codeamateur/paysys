package com.zjgt.paySys.common.citic.enums;

public enum PreFlgEnum {
	NO_ORDER("0","非预约交易"),
	ORDER("1","预约交易");
	private String code;
	private String message;
	private PreFlgEnum(String code, String message) {
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
