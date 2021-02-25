package SlidingWindowMaximum;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		System.out.println("how much numbers will u give");
		
		Scanner sc = new Scanner(System.in);
	// ArrayList<Integer> a = new ArrayList();
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("give values");
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i+2<a.length;i++) {
			if(a[i] < a[i+1]) {
				if(a[i+1] < a[i+2]) {
					System.out.print(a[i+2] + " ");
				}else {
					System.out.print(a[i+1]+ " ");
				}
			}else {
				if(a[i] < a[i+2]) {
					System.out.print(a[i+2]+ " ");
				}else {
					System.out.print(a[i]+ " ");
				}
			}
		}
		

	}

}
