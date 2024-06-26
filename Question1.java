package nazansonal_211805027_lab1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a number 1-50 (or q to quit):");
			String number=scan.nextLine();
			
			 if (number.equals("q")) {
				 System.out.println("Exit the program.");
				 break;
			}
			
		        Integer number2 =Integer.valueOf(number);
			 if (number2 >= 1 && number2 <= 50) {
			 for (int i = 1; i <= number2; i++) {
		           
		            for (int j = 1; j <= number2 - i; j++) {
		                System.out.print("   ");
		            }
		            for (int j = i; j > 1; j--) {
		                System.out.print(j+"  ");
		                }
		           for (int a = 1; a<=i ; a++) {
		   				 System.out.print(a+"  ");	
		   			} 
		                if ( number2 >= 10 ) {
		                    System.out.print("  "); 
		                } else {
		                    System.out.print("   "); 
		                }
		                   System.out.println();
		                   
		                 
		       			}
			 }
			 else {
	                System.out.println("Wrong! enter a number between 1 - 50.");
	            }
	        
			 }      
		 scan.close();  
	}
	
}


