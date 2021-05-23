package task521;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("자연수를 입력해 주세요.");
		int n = sc.nextInt();
		
		
		for(int i=0;i<n;i++){
			int num =1;
            for(int k=n-1-i;k>0;k--){
            	System.out.print("  ");

            }
            for (int j=0; j<i+1; j++) {
            	System.out.print(num+ " " );
            	num++;
            }
            System.out.println();
            }
            		
            	

	}
	
}
