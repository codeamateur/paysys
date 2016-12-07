package com.zjgt.paySys.common.citic.enums;

public enum AccGenTypeEnum {
	AUTO("0", "自动"), HANDWORK("1", "手动生成");
	private String code;
	private String message;

	private AccGenTypeEnum(String code, String message) {
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
