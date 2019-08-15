package com.codingdojo.web.models;

public class Player {
	private String fname;
	private String lname;
	private Integer age;
	private int playerid;
	private static int id = 0;
	
	public Player() {
		Player.id +=1;
		this.playerid=Player.id;
	}
	
	
	public Player(String fname, String lname, Integer age) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		Player.id +=1;
		this.playerid=Player.id;
	}
	
	public void setFname(String x) {
		this.fname=x;
	}
	
	public String getFname() {
		return this.fname;
	}
	public void setLname(String x) {
		this.lname=x;
	}
	
	public String getLname() {
		return this.lname;
	}
	public void setAge(Integer x) {
		this.age=x;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public int getId() {
		return this.playerid;
	}
}
