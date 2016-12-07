package com.zjgt.paySys.common.citic.enums;

public enum RealNameParmEnum {
	NO("0","账户名和账号全不换"),
	YES("1","账户名和账号全换"),
	ACCOUNT("2","换账户名"),
	ID("2","换账户名");
	private String code;
	private String message;
	private RealNameParmEnum(String code, String message) {
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
