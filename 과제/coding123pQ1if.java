package kr.java.task;

public class coding123pQ1if {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		}
		else if(operator == '-') {
			result = num1 - num2;
			
		}
		else if(operator == '*') {
			result = num1 * num2;
			
		}
		else if(operator == '/') {
			result = num1 / num2;
			
		}
		else {
			System.out.println(" 연산자를 입력해 주세요."); 
		}
		System.out.println("결과 값은 "+ result + "입니다.");
		
		
	}

}
