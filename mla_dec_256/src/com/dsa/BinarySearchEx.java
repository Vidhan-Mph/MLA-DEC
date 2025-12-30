package com.dsa;

import java.util.Scanner;

public class BinarySearchEx {
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			
			if(arr[mid] == target)
				return mid;
			if(arr[mid]<target)
				low = mid+1;
			else
				high = mid-1;
		}
		
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0;i<=size-1;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int index = binarySearch(arr, target);
		System.out.println(index);
		sc.close();
		

	}

}
