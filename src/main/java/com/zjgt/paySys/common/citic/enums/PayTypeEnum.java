package com.zjgt.paySys.common.citic.enums;

public enum PayTypeEnum {
	HUIPIAO("00","汇票"),
	INNER_TRANSFER("01","中信内部转账"),
	HUGE_PAY("02","大额支付"),
	LITTLE_PAY("03","小额支付"),
	TONGCHENG("04","同城票交"),
	WANGYIN("05","网银跨行支付");
	private String code;
	private String message;
	private PayTypeEnum(String code, String message) {
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
