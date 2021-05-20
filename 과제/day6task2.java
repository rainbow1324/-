package kr.java.task;

import java.util.Scanner;

public class day6task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		
		int n = sc.nextInt();
		int c = 0;
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j=i*2; j<(2*n)-1; j++)
				System.out.print("*");
			System.out.println();
		}
				
			for (int i = 0 ; i <n-1; i++) {
				for(int j = i+1; j<n-1; j++)
				System.out.print(" ");
				for(int j=1; j < 4+c; j++)
					System.out.print("*");
				System.out.println();
				c +=2;
			}
		}

	
}
