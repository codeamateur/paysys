package com.zjgt.paySys.common.citic.vo;

import java.util.List;

import com.zjgt.paySys.common.citic.bean.Stream;

public class DealVo extends BaseVo {
	private static final long serialVersionUID = 1L;

	public DealVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public DealVo(String code,String msg, Stream requestValues) {
		super(code, msg, requestValues);
	}
	
	/**
	 * 起始记录号
	 */
	private String startRecord;
	/**
	 * 请求记录条数
	 */
	private String pageNumber;
	/**
	 * 返回记录条数
	 */
	private String returnRecords;
	private List<DealDetailVo> dealList;

	public String getStartRecord() {
		return startRecord;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public String getReturnRecords() {
		return returnRecords;
	}

	public List<DealDetailVo> getDealList() {
		return dealList;
	}

	public void setStartRecord(String startRecord) {
		this.startRecord = startRecord;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void setReturnRecords(String returnRecords) {
		this.returnRecords = returnRecords;
	}

	public void setDealList(List<DealDetailVo> dealList) {
		this.dealList = dealList;
	}
	
}
