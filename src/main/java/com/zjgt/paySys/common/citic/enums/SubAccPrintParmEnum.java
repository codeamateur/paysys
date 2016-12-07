package com.zjgt.paySys.common.citic.enums;

public enum SubAccPrintParmEnum {
	ALL("0","全部显示"),
	VIRTUAL_ACCOUNT_ID("1","显示附属账户名和账号"),
	ENTITY_ACCOUNT_ID("2","显示实体账户名和账号"),
	VIRTUAL_ACCOUNT_ENTITY_ID("3","显示附属账户名和实体账号"),
	ENTITY_ACCOUNT_VIRTUAL_ID("4","显示实体账户名和附属账号");
	private String code;
	private String message;
	private SubAccPrintParmEnum(String code, String message) {
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
