package com.zjgt.paySys.common.citic.vo;

import java.util.List;

import com.zjgt.paySys.common.citic.bean.Stream;

public class PrintVo extends BaseVo {
	private static final long serialVersionUID = 1L;

	public PrintVo(String msg, Stream requestValues) {
		super(msg, requestValues);
	}
	
	public PrintVo(String code,String msg, Stream requestValues) {
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

	private List<PrintDetailVo> printList;

	public String getStartRecord() {
		return startRecord;
	}

	public String getPageNumber() {
		return pageNumber;
	}

	public List<PrintDetailVo> getPrintList() {
		return printList;
	}

	public void setStartRecord(String startRecord) {
		this.startRecord = startRecord;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public void setPrintList(List<PrintDetailVo> printList) {
		this.printList = printList;
	}



	
}
