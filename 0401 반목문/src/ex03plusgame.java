import java.util.Random;
import java.util.Scanner;

public class ex03plusgame {

	public static void main(String[] args) {
		// 1. 사용자가 원할때까지 y를 입력 반복
       //  2. 랜덤 수 2개 뽑기
		// 3. 사용자가 직접 정답 맞추기
		// 4. 정답 결과 보여주기 (s/f)
		// 5. 계속 할건지 물어보고 입력받기
		// 6. 단, 계속할 시 틀렸을 경우에는 같은 식을, 맞췄을 경우에는 새로운 식을 출력
		
		String choice;
		Scanner sc = new Scanner(System.in);
		Random r = new Random ();
		int num1 = 0, num2 = 0, result =0;
		int answer = 0 ;
		num1 = r.nextInt(10)+1;
		num2 = r.nextInt(10)+1;
		System.out.println(" == plus game == ");
	
		
		
		do {result = num1 +num2;
		System.out.print(num1+"+"+num2 + "=");  
		answer = sc.nextInt();
		   if (answer == result)
			   {System.out.println("Success");
		       num1 = r.nextInt(10)+1;
			   num2 = r.nextInt(10)+1;}
			   else {System.out.println(" fail ");}
				
		
		
		System.out.println("계속 하시겠습니까 >> (Y/N) ");
		choice = sc.next();}
        while (choice.equals("Y")|| choice.equals("y"));
        System.out.println("plus game 종료");
    	
	
	
	
	
		
	
	}
}