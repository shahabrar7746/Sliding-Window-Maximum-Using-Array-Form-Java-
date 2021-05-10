package SlidingWindowMaximum;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		System.out.println("how much numbers will u give");
		
		Scanner sc = new Scanner(System.in);
	//Link :- https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/
		int array[] = new int[6];
		System.out.println("give values");
		//This loop will take inputs for array
		for(int i = 0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		//This will do our job 
		for(int i = 0;i+2<array.length;i++) {
			if(array[i] < array[i+1]) {
				if(array[i+1] < array[i+2]) {
					System.out.print(array[i+2] + " ");
				}else {
					System.out.print(array[i+1]+ " ");
				}
			}else {
				if(array[i] < array[i+2]) {
					System.out.print(array[i+2]+ " ");
				}else {
					System.out.print(array[i]+ " ");
				}
			}
		}
		

	}

}
