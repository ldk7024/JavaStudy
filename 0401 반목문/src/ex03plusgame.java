import java.util.Random;
import java.util.Scanner;

public class ex03plusgame {

	public static void main(String[] args) {
		// 1. ����ڰ� ���Ҷ����� y�� �Է� �ݺ�
       //  2. ���� �� 2�� �̱�
		// 3. ����ڰ� ���� ���� ���߱�
		// 4. ���� ��� �����ֱ� (s/f)
		// 5. ��� �Ұ��� ����� �Է¹ޱ�
		// 6. ��, ����� �� Ʋ���� ��쿡�� ���� ����, ������ ��쿡�� ���ο� ���� ���
		
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
				
		
		
		System.out.println("��� �Ͻðڽ��ϱ� >> (Y/N) ");
		choice = sc.next();}
        while (choice.equals("Y")|| choice.equals("y"));
        System.out.println("plus game ����");
    	
	
	
	
	
		
	
	}
}