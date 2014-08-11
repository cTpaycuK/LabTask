package com.epam.egor_balanovich.java.lecture1.task5;

public class Runner {

	private static final int SIZE=20;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[][] mas=Massiv.generateMassiv(SIZE);
		for(int i=0; i<SIZE;i++){
			for(int j=0;j<SIZE;j++){
				System.out.print(mas[i][j]);
			}
			System.out.println();
		}
	}

}
