package task521;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		char ch='A';
		
		while(true) {
			System.out.println("숫자를 입력해주세요.(3이상 10이하)");
			n=sc.nextInt();
			
			if(n>=3 && n<=10) {
				break;
			}
		}
				
				for(int i=n;i>0;i--) {
					for(int j=i;j>0;j--) {
						System.out.print(ch);
						ch++;
					}
					System.out.println();
				}
			
			
		}
		}
		
		
		
	