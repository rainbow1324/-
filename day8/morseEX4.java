package kr.day8;

import java.util.Scanner;

public class morseEX4 { // 손현호씨 모스부호

	public static void main(String[] args) {
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String alphabet2 = "abcdefghijklmnopqrstuvwxyz";
			String sign[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
			
			
			Scanner scan =new Scanner(System.in);
			String input = scan.nextLine();
			int num =0;
			for(int i=0;i<input.length();i++)
			{
				if(alphabet.indexOf(input.charAt(i)) !=-1) {
					num = alphabet.indexOf(input.charAt(i));
				}else if(alphabet2.indexOf(input.charAt(i)) !=-1) {
					num = alphabet2.indexOf(input.charAt(i));
				}else {
					System.out.println("알파벳만 입력하세요");
					break;
				}
				
				System.out.print( alphabet.substring(num,num+1) +"(" + sign[num] +")");
			}
		
		}
	}


