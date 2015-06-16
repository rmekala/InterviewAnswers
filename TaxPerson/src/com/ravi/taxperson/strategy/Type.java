package com.ravi.taxperson.strategy;

public enum Type implements TypeOperation{

	/*basic necessities is 1%*/
	NECESSITY{
		@Override
		public double calculateTax(int price) {
			return 0.01*price; 
		}
	},

	/*luxury items is 9%*/
	LUXURY {
		@Override
		public double calculateTax(int price) {
			return 0.09*price; 
		}
	};


}