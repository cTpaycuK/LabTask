package com.epam.egor_balanovich.java.lecture1.task2;

public class Runner {

	private final static double E=0.00001;
	
	
	private final static double START_VALUE=1;
	private final static double FINISH_VALUE=1.2;
	private final static double STEP=0.01;
	
	
	private final static int COUNT_OF_NUMBER=10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ArithmeticOperation.lessEpselent(E));
		System.out.println(ArithmeticOperation.functionValue(START_VALUE, FINISH_VALUE, STEP));
		System.out.println(ArithmeticOperation.maxSum(COUNT_OF_NUMBER));
	}

}
