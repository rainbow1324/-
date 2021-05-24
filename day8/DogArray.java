package kr.day8;

import java.util.Scanner;

public class DogArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String[] dog = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
		
		String[] Nname = { "bear","Gift","White","Sesami","Black"};
		System.out.println("강아지 이름을 입력해주세요");
		String str=sc.nextLine();
		
		int pos = -1;
		
		for(int i=0;i<5;i++) {
			if(str.equals(dog[i])) {
				pos = i;
			}
			else {
				System.out.println("없습니다.");

			}

		
		}
		System.out.println(Nname[pos]);
	}
}

