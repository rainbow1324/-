package kr.java.task;

import java.util.Scanner;

public class day6task1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");
		int n = sc.nextInt();
		int c = 0;
		int sum = 0;
		for (int i=1; sum<n; i++) {
			if(i%2 ==1) {
				sum+=i;
				c++;
			}
			
		}
		System.out.println("개수"+c);
		System.out.println("합계"+sum);
		
		
		


	}

}
