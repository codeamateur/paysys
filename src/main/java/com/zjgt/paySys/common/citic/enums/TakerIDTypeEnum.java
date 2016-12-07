/**
 * 
 */
package com.zjgt.paySys.common.citic.enums;


/**
 * @author zjgt316
 *
 */
public enum TakerIDTypeEnum {
	ID("0","居民身份证"),
	POLICEMAN_ID("1","武装警察身份证"),
	PASSPORT("2","护照"),
	SOLDIER_ID("3","军人身份证"),
	GANGAO("4","港澳居民往来身份证"),
	TAIWAN("7","台湾居民大陆往来通行证"),
	OTHER("8","其他");
	private String code;
	private String message;
	private TakerIDTypeEnum(String code, String message) {
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
		for (TakerIDTypeEnum stt : TakerIDTypeEnum.values()) {
			if(stt.getCode().equals(code)){
				return stt.getMessage();
			}
		};
		return null;
	}
	
}
