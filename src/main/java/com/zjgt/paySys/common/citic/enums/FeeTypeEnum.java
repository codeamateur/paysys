package com.zjgt.paySys.common.citic.enums;

public enum FeeTypeEnum {
	NO("0","不收取"),
	REAL_TIME("1","实时收取"),
	END_MONTH("2","月末累计");
	private String code;
	private String message;
	private FeeTypeEnum(String code, String message) {
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
