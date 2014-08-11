package com.epam.egor_balanovich.java.lecture1.task2;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class ArithmeticOperation {

	public static ArrayList<String> lessEpselent(double e){
		ArrayList<String> seq=new ArrayList<String>();
		double a;
		for(int i=1;;i++){
			a=Math.pow((i+1), -2);
			if(a<e){
				seq.add(String.format("%.4f", a));
				break;
			}
			seq.add(String.format("%.4f", a));
		}
		return seq;
	}
	
	
	public static TreeMap<String, String> functionValue(double a, double b, double h){
		TreeMap<String, String> table=new TreeMap<String, String>();
		double f;
		for(double i=a; i<=b; i+=h){
			f=Math.tan((2*i)-3);
			table.put(String.format("%.3f",i), String.format("%.3f",f));
		}
		
		return table;
	}
	
	
	public static double maxSum(int n){
		Random rand=new Random();
		double[] mas=new double[n];
		for(int i=0; i<n; i++){
			mas[i]=rand.nextDouble();
		}
		double max=0;
		for(int i=0,j=n-1;i<n/2;i++,j--){
			if((mas[i]+mas[j])>max){
				max=mas[i]+mas[j];
			}
		}
		return max;
	}
}
