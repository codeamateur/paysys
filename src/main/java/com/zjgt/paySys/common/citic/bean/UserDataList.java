package com.zjgt.paySys.common.citic.bean;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("list")
public class UserDataList {
	@XStreamAsAttribute
	private String name = "userDataList";
	@XStreamImplicit(itemFieldName="row")
	private List<Row> row;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Row> getRow() {
		return row;
	}

	public void setRow(List<Row> row) {
		this.row = row;
	}
}
