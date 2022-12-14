
package assignment;

public class question3 {
	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1; i<100; i++) {
			if (i%5==0 || i%7==0) {
				System.out.print(i +", ");
				sum=sum+i;		
			}
		}
			
	System.out.println(" ");
	System.out.println("THE SUM OF NUMBERS DIVISIBLE BY 5 OR 7 IS: " + sum);	
	}

}
