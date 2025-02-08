package com.jsp.app;

import com.jsp.logic.Calculator;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
	}
}
