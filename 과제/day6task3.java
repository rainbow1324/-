package kr.java.task;

import java.util.Scanner;

public class day6task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요.");
		
		int n = sc.nextInt();
		int [] [] arr = new int [n] [n];
		int num =1;
		
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            	System.out.print(num+" ");
            	num= num+2;
            	
            	//10이하 홀수만 출력하는 방법을 모르겠습니다.
            	
		
		

            }
            System.out.println("");
		}

	}
	}
	
