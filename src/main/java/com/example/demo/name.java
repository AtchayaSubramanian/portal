package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class name {
	@JsonProperty("rollno")
	private int id;
	@JsonIgnore
	private String name;
	private int rank;
	public name(int id, String name, int rank) {
		super();
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	

}
