import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String opr = sc.next();
		System.out.println("A���� �Է��ϼ���: ");
		int num1 = sc.nextInt();
		System.out.println("B���� �Է��ϼ���: ");
		int num2 = sc.nextInt();
		if (opr.equals("+")) {System.out.print(num1+"��"+num2+"�� ����"+ (num1+num2)+ "�Դϴ�.");}
		else if (opr.equals("-")) {System.out.print(num1+"��"+num2+"�� ����"+ (num1-num2)+ "�Դϴ�.");}
		else if (opr.equals("*")) {System.out.print(num1+"��"+num2+"�� ���� "+ (num1*num2)+ "�Դϴ�.");}
		else {System.out.print(num1+"��"+num2+"�� �������"+ (num1/num2)+"�Դϴ�.");}
	}

}