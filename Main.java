package demoTest;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c1 = new Calculator();
		
		 int a, b, option, ex;
		 do
		 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the first number: ");
		 a = sc.nextInt();
		 System.out.println("Enter the second number: ");
		 b =sc.nextInt();
		 
		
		 System.out.println("Select the option from the following menu:");
		 System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
		 option = sc.nextInt();
		 if(option == 5)
			 break;
		
		 
		 switch(option)
		 {
		 case 1:System.out.println("Addition of " + a +" and "+ b +" is "+ c1.add(a, b));
		 break;
		 case 2:System.out.println("Subtraction of "+ a +" and "+ b +" is "+ c1.sub(a, b));
		 break;
		 case 3:System.out.println("Multiplication of "+ a +" and "+ b +" is "+ c1.mul(a, b));
		 break;
		 case 4: if(b == 0)
		 System.out.println("Error!!! In Division denominator cannot be 0!");
		 else{
		 System.out.println("In division of "+ a +" by "+ b +" quotient is "+ c1.div(a, b) +" and remainder is "+ (a%b) );} 
		 break;
		 case 5: break;
		 default: System.out.println("Invalid choice");
		 }
		 System.out.println("Do you want to continue?1.Yes 2.No");
		 ex=sc.nextInt();
		 }while(ex==1);
		 }
}
	
		    
		
		