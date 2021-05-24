package kr.day8;

import java.util.Scanner;

public class morseEX2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("");  // 이동희씨 코드 . split를 사용하면 HELLO >>>	H E L L O
		
		String[] moss = {
				".-","-...","-.-.","-..",".","..-.","--.",
				"....","..",".---","-.-",".-..","--","-.","---",".--.",
				"--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String[] ap = {
			"A","B","C","D","E","F","G",
			"H","I","J","K","L","M","N",
			"O","P","Q","R","S","T","U",
			"V","W","X","Y","Z"	
		};
		
		String result = "";
		
		for(int i=0; i<str.length; i++) {
			for(int j=0; j<ap.length; j++) {
			
				if(str[i].equalsIgnoreCase(ap[j])) {  //이그노어케이스 method 확인해보기 스트링의 indexOf의 method확인해보기
					result += moss[j]+ " ";
					continue;
				}
			}
		}
		System.out.println(result);
		
		
	}	
	}

