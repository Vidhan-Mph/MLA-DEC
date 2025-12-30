package com.dsa;

import java.util.Scanner;

public class QuickSortEx {
	
	public static int splitArray(int[] arr, int low, int high) {
		int pivot = arr[high];
		
		int i = low-1;
		
		for (int  j= low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr, i ,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void quickSort(int[] arr , int low, int high) {
		if(low<high) {
			int pivot = splitArray(arr, low, high);
			
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1, high);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0;i<=size-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr, 0 , size-1);
		System.out.println("=============");
		for(int x:arr) {
			System.out.print(x+ " ");
		}
		sc.close();

	}

}
