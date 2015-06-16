package com.ravi.taxperson;

import com.ravi.taxperson.model.Item;
import com.ravi.taxperson.strategy.Type;

public class Calculator {

	public double calculate(Item item) {
		final double taxAmount = item.getType().calculateTax(item.getBasicRate());
		return taxAmount + item.getBasicRate();
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Item necessity = new Item();
		necessity.setBasicRate(100);
		necessity.setType(Type.NECESSITY);
		System.out.println(c.calculate(necessity));
		
		
		Item luxury = new Item();
		luxury.setBasicRate(100);
		luxury.setType(Type.LUXURY);
		System.out.println(c.calculate(luxury));
	}

}
