package task521;

public class Task5 {

	public static void main(String[] args) {
 {
	       
        int[] arr = { 95, 100, 88, 65, 76,89,58,93,77,99 };
        
        	System.out.println("95, 100, 88, 65, 76,89,58,93,77,99");

        	
        for(int i= 0; i<arr.length-1; i++) {
        	
        	
        for (int j =i+1; j <arr.length; j++) {
        	if(arr[i]<arr[j]) {
        		int temp1 =arr[i];
        		arr[i]= arr[j];
        		arr[j]=temp1;
        	
        }
        }
        }
        for(int i= 0 ; i<arr.length; i++)
        System.out.print(arr[i]+ " ");

 
 }
	}
}