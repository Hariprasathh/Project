package com.learn.HariLearn;

import java.util.Iterator;
import java.util.Scanner;

public class PracticeEx {
	
	private static void descendingOrder() {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of an array");
		
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("enter the elements");
		
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		
		int temp;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		
		System.out.println("after the sorted order");
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.println(a[i]);
				
			}
		}
		

	}
	
	
	public static void main(String[] args) {
		
		descendingOrder();
		
		
		
	}

}
