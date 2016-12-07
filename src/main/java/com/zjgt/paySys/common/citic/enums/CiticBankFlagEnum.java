package com.zjgt.paySys.common.citic.enums;

public enum CiticBankFlagEnum {
	COMMON_CITY("0","同城"),
	OTHER_CITY("1","异地");
	private String code;
	private String message;
	private CiticBankFlagEnum(String code, String message) {
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
