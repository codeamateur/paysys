package com.zjgt.paySys.common.citic.vo;

import com.zjgt.paySys.common.citic.bean.Stream;

public class AccountCancellationVo extends BaseVo {
	private static final long serialVersionUID = 1L;
	private String subAccNo;
	private String subAccNm;
	
	
	public AccountCancellationVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public AccountCancellationVo(String code,String msg, Stream requestValues) {
		super(code, msg, requestValues);
	}

	public String getSubAccNo() {
		return subAccNo;
	}

	public String getSubAccNm() {
		return subAccNm;
	}

	public void setSubAccNo(String subAccNo) {
		this.subAccNo = subAccNo;
	}

	public void setSubAccNm(String subAccNm) {
		this.subAccNm = subAccNm;
	}

}
