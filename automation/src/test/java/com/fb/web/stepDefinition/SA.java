package com.fb.web.stepDefinition;

public class SA {

	public static void main(String[] args) {
		int sum = 0;
		int[] add = {10, 20, 30, 40, 50, 60};
		
		for (int i = 0; i < add.length; i++) {
			sum = sum + add[i];
		}
		System.out.println(sum);
	}
}