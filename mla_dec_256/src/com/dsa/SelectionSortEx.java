package com.dsa;

import java.util.Scanner;

public class SelectionSortEx {
	
	public static void sortElements(int[] arr) {
		int n = arr.length;
		
		for(int i =0;i<=n-1;i++) {
			int min = i;
			for(int j =i+1;j<=n-1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min !=i) {
				swap(arr, i, min);
			}
		}
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void swap(int[] arr , int i, int min){
		int temp = arr[i];
		arr[i]= arr[min];
		arr[min]= temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size]; 
		for(int i =0;i<=size-1;i++) {
			 arr[i] = sc.nextInt();
		 }
		
		sortElements(arr);
		sc.close();

	}

}
