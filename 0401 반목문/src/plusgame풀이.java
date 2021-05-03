import java.util.Random;
import java.util.Scanner;

public class plusgame풀이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      Random r = new Random();
	      boolean state = true;
	      while(true) {         
	         int num1 = r.nextInt(10)+1;
	         int num2 = r.nextInt(10)+1;
	         System.out.print(num1+"+"+num2+"=");
	         int result = sc.nextInt();
	         if(num1+num2 == result) {
	            System.out.println("Success");
	         }else {
	            System.out.println("Fail");
	         }
	         System.out.println("계속하실?(Y/N) >> ");
	         String choice = sc.next();
	         if(choice.equals("n")) {
	            break;
	         }
	      }
	      System.out.println("프로그램 종료");

		
	
	
	
	
	  
	
	 
	  }
		
	

}
