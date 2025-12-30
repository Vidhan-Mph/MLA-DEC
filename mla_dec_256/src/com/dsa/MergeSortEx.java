package com.dsa;

import java.util.Scanner;

public class MergeSortEx {
	public static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left +1;
		int n2 = right - mid;
		
		int[] leftSide = new int[n1];
		int[] rightSide = new int[n2];
		
		for(int i =0;i<=n1-1;i++) {
			leftSide[i] = arr[left+i];
		}
		for(int j =0;j<=n2-1;j++) {
			rightSide[j] = arr[mid+1+j];
		}
		
		int i =0, j=0;
		int k = left;
		
		while(i<n1 && j<n2) {
			if(leftSide[i] <= rightSide[j]) {
				arr[k] = leftSide[i];
				i++;
			}else {
				arr[k] = rightSide[j];
				j++;
			}
			k++;
			
		}
		while(i<n1) {
			arr[k] = leftSide[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = rightSide[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int[] arr, int left , int right) {
		if(left<right) {
			int mid = left + (right-left)/2;
			
			mergeSort(arr, left ,mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left ,mid, right);
		}
		
		 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i =0;i<=size-1;i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(arr, 0 ,size-1);
		System.out.println("===========");
		for(int x: arr) {
			System.out.print(x+ " " );
		}
		
	}

}
