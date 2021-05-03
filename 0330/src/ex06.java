import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ex06 {

	public static void main(String[] args) {
		// 삼항연산자  
		// 식이 true, false인지에 따라서 간단한 제어처리가 가능한 식
        
		Scanner sc = new Scanner(System.in);
	    System.out.print("첫 번째 정수입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수입력: ");
		int num2 = sc.nextInt();
		
		int minus = num1>num2? (num1-num2) : (num2 - num1);  // ? 같다면, : 아니라면
		
		System.out.print("두 수의 차: " + minus);
	
	
	
	}
	
	
	

}
