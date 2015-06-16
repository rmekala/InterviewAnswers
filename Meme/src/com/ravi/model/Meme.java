package com.ravi.model;

public class Meme implements Comparable<Meme> {
	private String name;
	private int lulz;
	
	public Meme() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLulz() {
		return lulz;
	}
	public void setLulz(int lulz) {
		this.lulz = lulz;
	}
	@Override
	public int compareTo(Meme o) {
		return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meme [name=").append(name).append(", lulz=")
				.append(lulz).append("]");
		return builder.toString();
	}
	
}
