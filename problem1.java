
package assignment;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Select Operation: \n"
				+ "1: Addition \n"
				+ "2: Subtraction\n"
				+ "3: Multiplication\n"
				+ "4: Division\n"
				+ "5: Remainder \n"
				+ "6: Power \n"
				+ "6: Exit \n"
				+ "Enter a choice: \n");
		
		//while (input.nextLine() != null )
		if (input.nextLine() != null)
        {
			String x= input.next();
			String a="a";
			String s="s";
			String m="m";
			String d="d";
			String r="r";
			String p="p";
            if(x == a ) {
            	Scanner first = new Scanner(System.in);
            	System.out.print("Please, enter the first number: \n");
            	Scanner second = new Scanner(System.in);
            	System.out.print("Please, enter the second number: \n");
            	System.out.print("Result of"+ first.nextInt() +"+"+ second.nextInt()+ "is"+ first.nextInt()+second.nextInt());
            }
            
            if(x == s ) {
            	Scanner first = new Scanner(System.in);
            	System.out.print("Please, enter the first number: \n");
            	Scanner second = new Scanner(System.in);
            	System.out.print("Please, enter the second number: \n");
            	System.out.print("Result of"+ first.nextInt() +"-"+ second.nextInt()+ "is"+ first.nextInt()-second.nextInt());
            }
            if(x == m ) {
            	Scanner first = new Scanner(System.in);
            	System.out.print("Please, enter the first number: \n");
            	Scanner second = new Scanner(System.in);
            	System.out.print("Please, enter the second number: \n");
            	System.out.print("Result of"+ first.nextInt() +"*"+ second.nextInt()+ "is"+ first.nextInt()*second.nextInt());
            }
            if(x == d ) {
            	Scanner first = new Scanner(System.in);
            	System.out.print("Please, enter the first number: \n");
            	Scanner second = new Scanner(System.in);
            	System.out.print("Please, enter the second number: \n");
            	if(second.nextInt()!=0) {
            		System.out.print("Result of"+ first.nextInt() +"/"+ second.nextInt()+ "is"+ first.nextInt()/second.nextInt());
            	}
            }
            if(x == r ) {
            	Scanner first = new Scanner(System.in);
            	System.out.print("Please, enter the first number: \n");
            	Scanner second = new Scanner(System.in);
            	System.out.print("Please, enter the second number: \n");
            	System.out.print("Result of"+ first.nextInt() +"%"+ second.nextInt()+ "is"+ first.nextInt()%second.nextInt());
            }
            if(x == p ) {
            	Scanner first = new Scanner(System.in);
            	System.out.print("Please, enter the first number: \n");
            	Scanner second = new Scanner(System.in);
            	System.out.print("Please, enter the second number: \n");
            	System.out.print("Result of"+ first.nextInt() +"**"+ second.nextInt()+ "is"+Math.pow(first.nextInt(), second.nextInt()));
            }
        }
	}
}

