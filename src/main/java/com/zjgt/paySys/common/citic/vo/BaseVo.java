package com.zjgt.paySys.common.citic.vo;

import java.io.Serializable;

import com.zjgt.paySys.common.citic.CiticConfig;
import com.zjgt.paySys.common.citic.bean.Stream;

public class BaseVo implements Serializable{
	protected static final long serialVersionUID = -1373760761780840081L;
	
	private String code ;
	private String msg ;
	private Stream requestValues;
	
	public BaseVo(String msg,Stream requestValues){
		this.code=CiticConfig.OK;
		this.msg = msg;
		this.requestValues = requestValues;
	}
	
	
	public BaseVo(String code,String msg,Stream requestValues){
		this.code=code;
		this.msg = msg;
		this.requestValues = requestValues;
	}


	public String getCode() {
		return code;
	}


	public String getMsg() {
		return msg;
	}


	public Stream getRequestValues() {
		return requestValues;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public void setRequestValues(Stream requestValues) {
		this.requestValues = requestValues;
	}
	
}
