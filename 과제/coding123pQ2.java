package kr.java.task;

public class coding123pQ2 {

	public static void main(String[] args) {
		
		int dan;
		int i;
		

		for(dan =2; dan <10; dan++) {
			if (dan %2 != 0) continue;
			for(i = 1; i <10; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i );
			}

	}	
	}
}
