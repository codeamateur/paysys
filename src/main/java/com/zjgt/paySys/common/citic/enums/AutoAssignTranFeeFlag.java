package com.zjgt.paySys.common.citic.enums;

public enum AutoAssignTranFeeFlag {
	NO("0","否"),
	YES("1","是");
	private String code;
	private String message;
	private AutoAssignTranFeeFlag(String code, String message) {
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
