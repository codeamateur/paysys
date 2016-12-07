package com.zjgt.paySys.common.citic.vo;

import com.zjgt.paySys.common.citic.bean.Stream;

public class BalanceAccountVo extends BaseVo {
	private static final long serialVersionUID = 1L;

	public BalanceAccountVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public BalanceAccountVo(String code,String msg, Stream requestValues) {
		super(code, msg, requestValues);
	}
	
	private String subAccNo;
	private String SUBACCNM;
	private String TZAMT;
	private String XSACVL;
	private String KYAMT;
	private String SJAMT;
	private String DJAMT;

	public String getSubAccNo() {
		return subAccNo;
	}

	public String getSUBACCNM() {
		return SUBACCNM;
	}

	public String getTZAMT() {
		return TZAMT;
	}

	public String getXSACVL() {
		return XSACVL;
	}

	public String getKYAMT() {
		return KYAMT;
	}

	public String getSJAMT() {
		return SJAMT;
	}

	public String getDJAMT() {
		return DJAMT;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public void setSUBACCNM(String sUBACCNM) {
		SUBACCNM = sUBACCNM;
	}

	public void setTZAMT(String tZAMT) {
		TZAMT = tZAMT;
	}

	public void setXSACVL(String xSACVL) {
		XSACVL = xSACVL;
	}

	public void setKYAMT(String kYAMT) {
		KYAMT = kYAMT;
	}

	public void setSJAMT(String sJAMT) {
		SJAMT = sJAMT;
	}

	public void setDJAMT(String dJAMT) {
		DJAMT = dJAMT;
	}

	
}
