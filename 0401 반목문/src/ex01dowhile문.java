import java.util.Scanner;

public class ex01dowhile문 {

	public static void main(String[] args) {
		//do while문 -> do{실행문장1} while();
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("현재몸무게: ");
	    int now = sc.nextInt();
	    System.out.print("목표몸무게: ");
	    int target = sc.nextInt();
	    int week = 1;
		do { 
			System.out.print(week+"주차 감량 몸무게:" );
		    int w = sc.nextInt();
		    now -=w;  //now = now - w
		    week++;
		    
		    
		    
		   
		}while(now>target); System.out.print(now + "kg 달성!! 축하합니다!"); 
		

	
	
	
	
	}

}
