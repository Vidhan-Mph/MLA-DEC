package com.dsa;

import java.util.Scanner;

public class BubbleSortEx {
	
	public static void bubbleSort(int[] arr){
		int n = arr.length;
		boolean swapped;
		
		for(int i =0;i<n-1;i++) {
			swapped = false;
			for(int j =0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swapElements(arr,j);
					swapped = true;
				}
			}
			if(swapped ==false)
				break;
		}
		System.out.println("============");
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}
	
	public static void swapElements(int[] arr, int j) {
		int temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length: ");
		int size= sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0;i<=size-1;i++) {
			arr[i] = sc.nextInt();
		}
		bubbleSort(arr);

	}

}
