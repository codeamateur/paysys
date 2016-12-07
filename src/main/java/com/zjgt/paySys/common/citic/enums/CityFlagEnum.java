package com.zjgt.paySys.common.citic.enums;

public enum CityFlagEnum {
	ONESELF("0","中信"),
	OTHER("1","他行");
	private String code;
	private String message;
	private CityFlagEnum(String code, String message) {
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
