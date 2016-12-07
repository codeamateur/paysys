package com.zjgt.paySys.common.citic.vo;

import java.util.List;

import com.zjgt.paySys.common.citic.bean.Stream;

public class FreezeVo extends BaseVo {
	private static final long serialVersionUID = 1L;

	public FreezeVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public FreezeVo(String code,String msg, Stream requestValues) {
		super(code, msg, requestValues);
	}

	private List<FreezeDetailVo> freezeList;

	public List<FreezeDetailVo> getFreezeList() {
		return freezeList;
	}

	public void setFreezeList(List<FreezeDetailVo> freezeList) {
		this.freezeList = freezeList;
	}
}
