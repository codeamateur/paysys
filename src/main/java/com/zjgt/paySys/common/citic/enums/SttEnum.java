/**
 * 
 */
package com.zjgt.paySys.common.citic.enums;


/**
 * @author zjgt316
 *
 */
public enum SttEnum {
	SUCCESS("0","成功"),
	FAIL("1","失败"),
	UNKNOWN("2","处理中"),
	REJECT("3","审核拒绝"),
	REVOCATION("4","用户撤销");
	private String code;
	private String message;
	private SttEnum(String code, String message) {
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
		for (SttEnum stt : SttEnum.values()) {
			if(stt.getCode().equals(code)){
				return stt.getMessage();
			}
		};
		return null;
	}
	
}
