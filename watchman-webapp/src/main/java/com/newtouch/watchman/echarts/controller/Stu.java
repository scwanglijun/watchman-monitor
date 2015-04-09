package com.newtouch.watchman.echarts.controller;

public class Stu {
	private String name;
	private Integer value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Stu(String name, Integer value) {
		super();
		this.name = name;
		this.value = value;
	}
	
}
