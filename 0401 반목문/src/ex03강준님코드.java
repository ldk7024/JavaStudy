import java.util.Random;
import java.util.Scanner;

public class ex03���ش��ڵ� {

	public static void main(String[] args) {
		  // ���� ��ü ����
	      Random r = new Random();
	      Scanner sc = new Scanner(System.in);
	      
	      // �� ���� ��ģ ���� ������ ������ ����.
	      int num1 = 0, num2 = 0, result = 0;
	      // ���� �Է��� ���� �����͸� ������ ���� ����.
	      int answer = 0;
	      // while������ ���ǽ����� �����(y/n) ���� ����.
	      String yesOrno = "";
	      
	      // �ݺ����� ���� ���� ������ �� 2���� �� �� �Է½��� ���´�.
	      num1 = r.nextInt( 10 )+1;
	      num2 = r.nextInt( 10 )+1;
	      
	      System.out.println( "==Plus Game==" );
	      
	      do {
	         // �츮�� ����� �� ���� �����͸� result�� ����.
	         result = num1 + num2;
	         
	         // result���� ���߱� ���� answer������ ������ ���� �Է�
	         System.out.print( "������ ���纸���� >> " );
	         answer = sc.nextInt();
	         System.out.println( num1 + "+" + num2 + "=" + answer );
	         
	         // ���� ������ �´ٸ�
	         if( answer == result ) {
	            // Success��� �� �������ڸ� �ٲٱ�
	            System.out.println( "Success" );
	            num1 = r.nextInt( 10 )+1;
	            num2 = r.nextInt( 10 )+1;
	            // �׷��� ������ Fail ���
	         } else {
	            System.out.println( "Fail" );
	         }
	         
	         // While���� ��� �ݺ��Ұ��� �����ϱ�.
	         System.out.print( "��� �Ͻðڽ��ϱ�(y/n) >> " );
	         yesOrno = sc.next();
	         
	         // ��ҹ��� ���� ���� y�� �Է¹����� while�� �����
	      } while ( yesOrno.equals("y") || yesOrno.equals("Y") );
	      
	      System.out.println( "Plus Game ����" );
	      
	   }



	}

}
