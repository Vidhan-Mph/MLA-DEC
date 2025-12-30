package com.dsa;

import java.util.Scanner;

public class InsertionSortEx {
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for(int i =1;i<=n-1;i++) {
			
			int k = arr[i];
			int j =i-1;
			while(j>=0 && arr[j]>k) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = k;
		}
		System.out.println("==============");
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i =0;i<=size-1;i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		sc.close();

	}

}
