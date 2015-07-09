package com.atschx.finance;

import java.util.List;

public class StockModel {

	private Integer code;

	private String day;

	private Integer count;
	private List<String> fields;
	
	private List<List<String>> items;
	

	// private String[] items;

	public List<List<String>> getItems() {
		return items;
	}

	public void setItems(List<List<String>> items) {
		this.items = items;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	// public String[] getItems() {
	// return items;
	// }
	//
	// public void setItems(String[] items) {
	// this.items = items;
	// }

}
