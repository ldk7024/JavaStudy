import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ex06 {

	public static void main(String[] args) {
		// ���׿�����  
		// ���� true, false������ ���� ������ ����ó���� ������ ��
        
		Scanner sc = new Scanner(System.in);
	    System.out.print("ù ��° �����Է�: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° �����Է�: ");
		int num2 = sc.nextInt();
		
		int minus = num1>num2? (num1-num2) : (num2 - num1);  // ? ���ٸ�, : �ƴ϶��
		
		System.out.print("�� ���� ��: " + minus);
	
	
	
	}
	
	
	

}
