package com.ravi.taxperson.model;

import com.ravi.taxperson.strategy.Type;

public class Item {

	private int basicRate;
	
	private Type type;
 
	public int getBasicRate() {
		return basicRate;
	}

	public void setBasicRate(int basicRate) {
		this.basicRate = basicRate;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
}
