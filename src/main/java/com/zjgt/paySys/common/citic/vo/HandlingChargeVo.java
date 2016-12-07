package com.zjgt.paySys.common.citic.vo;

import java.util.List;

import com.zjgt.paySys.common.citic.bean.Stream;

public class HandlingChargeVo extends BaseVo {
	private static final long serialVersionUID = 1L;

	public HandlingChargeVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public HandlingChargeVo(String code,String msg, Stream requestValues) {
		super(code, msg, requestValues);
	}

	private List<HandlingChargeDetailVo> HandlingChargeList;

	public List<HandlingChargeDetailVo> getHandlingChargeList() {
		return HandlingChargeList;
	}

	public void setHandlingChargeList(List<HandlingChargeDetailVo> handlingChargeList) {
		HandlingChargeList = handlingChargeList;
	}

	
}
