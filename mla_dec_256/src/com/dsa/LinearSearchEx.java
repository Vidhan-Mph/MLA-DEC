package com.dsa;

import java.util.Scanner;

public class LinearSearchEx {
	public static int linearSearch(int[] arr , int target) {
		for(int i =0;i<=arr.length-1;i++) {
			if(arr[i] == target) {
				return i;
			}
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
		int index = linearSearch(arr, target);
		System.out.print(index);
		sc.close();

	}

}
