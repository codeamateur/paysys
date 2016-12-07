package com.zjgt.paySys.common.citic.enums;

public enum TranFlagEnum {
	ASYNCHRONIZATION("0","异步交易"),
	SYNCHRONIZATION("1","同步交易");
	private String code;
	private String message;
	private TranFlagEnum(String code, String message) {
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
