package com.mtz.po;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.mtz.dao.MTZDao;

public class MTZ {
	private int id;
	private String time;
	private String grade;
	private  String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public MTZ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MTZ(String time, String grade, String state) {
		super();
		this.time = time;
		this.grade = grade;
		this.state = state;
	}
	public MTZ(int id, String time, String grade, String state) {
		super();
		this.id = id;
		this.time = time;
		this.grade = grade;
		this.state = state;
	}

	public static void main(String[] args) {
		MTZDao dao  =new MTZDao();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		String time=sdf.format(new Date());
		String grade="1000";
		String state="0";
		MTZ mtz = new MTZ(time, grade, state);
		dao.addMtz(mtz);
	}
}
