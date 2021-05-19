package kr.java.task;

public class coding123pQ3 {

	public static void main(String[] args) {

		int dan;
		int i;
		

		for(dan =1; dan <10; dan++) {
			for(i = 1; i <10; i++) {
				if (i > dan) break;
				System.out.println(dan + "*" + i + "=" + dan*i );
			}

	}	
	}
}
