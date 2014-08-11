package com.epam.egor_balanovich.java.lecture1.task5;

public class Massiv {
	
	public static byte[][] generateMassiv(final int n){
		byte[][] mas=new byte[n][n];
		for(int i=0; i<n;i++){
			for(int j=0; j<n; j++){
				if(i==j){
					mas[i][j]=1;
				}
				mas[i][n-(i+1)]=1;
			}
		}
		
		return mas;
	}
}
