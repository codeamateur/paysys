/**
 * 
 */
package com.zjgt.paySys.common.citic.enums;


/**
 * @author zjgt316
 *
 */
public enum TranTypeEnum {
	TRANSFER("BF","转账"),
	UNFREEZE("BG","解冻"),
	UNFREEZE_PAY("BH","解冻支付"),
	FREEZE_PAY("BR","冻结"),
	FREEZE("BS","支付冻结");
	private String code;
	private String message;
	private TranTypeEnum(String code, String message) {
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
	public static String getMessage(String code){
		for (TranTypeEnum stt : TranTypeEnum.values()) {
			if(stt.getCode().equals(code)){
				return stt.getMessage();
			}
		};
		return null;
	}
	
}
