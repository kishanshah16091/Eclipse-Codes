package com.syntax.class13;

public class MethodDemo4 {

	// create a method that takes a boolean isSaleOn double price double discount
	// if saleOn=true return discounted price otherwise return original price

	double checkDiscount(boolean isSaleOn, double orginalPrice, double discount) {

		if (isSaleOn) {
			return orginalPrice - orginalPrice * discount;
		} else {
			return orginalPrice;
		}
	}

	void methodWithOutParamters() {

	}

	public static void main(String[] args) {

		MethodDemo4 obj = new MethodDemo4();
		System.out.println(obj.checkDiscount(false, 100, .15));
		System.out.println(obj.checkDiscount(true, 100, .15));
	}

}
