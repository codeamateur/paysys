/**
 * 
 */
package com.zjgt.paySys.common.citic.enums;


/**
 * @author zjgt316
 *
 */
public enum TradeEnum {
	PUTONG_ZHUANZHANG("11","普通转账"),
	ZIJIN_CHUSHIHUA("12","资金初始化"),
	LIXI_FENPEI("13","利息分配"),
	SHOUXUFEI_FENPEI("14","手续费分配"),
	QIANGZHIZHUANZHANG("15","强制转账"),
	TIAOZHANG("16","调账"),
	GONGGONG_LIXI_SHOUFEI_ZHANGHU_ZHUANZHUANG("21","公共利息收费账户转账"),
	GONGGONG_TIAOZHANG_ZHANGHU_WAIBU_ZHUANZHUANG("22","公共调账账户外部转账"),
	PUTONG_WAIBU_ZHUANZHANG("23","普通外部转账");

	
	private String code;
	private String message;
	private TradeEnum(String code, String message) {
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
