import java.util.Scanner;

public class ex01pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("�� ���ΰ���?");
        int num1 = sc. nextInt();
        System.out.println("�� �ݾ��� ���ΰ���?");
        int num2 = sc. nextInt();
        System.out.println("�� �� �����ؾ��� �ݾ��� :" + (num2/num1));
		
		
	}

}
