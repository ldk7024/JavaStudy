import java.util.Scanner;

public class calinterface {

	public static void main(String[] args) {
	    calculater cal = new calculater();
	    int num1 = 0;
		int num2 = 0;
		String op = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========= ���������� �Բ��ϴ� ���� ������Ʈ =========");
		System.out.println();
		while (true) {
		    System.out.println();
            System.out.print("ù ��° ���� �Է����ּ��� ����: ");
            num1 = sc.nextInt();
 
            if (num1 == 0) {
                System.out.print("=============���������� �Բ��ϴ� ���� ������Ʈ ����!!=================");
                return;
            } else {
 
                System.out.print("�� ��° ���� �Է����ּ��� ����: ");
                num2 = sc.nextInt();
 
                System.out.print("����� �����ڸ� �Է����ּ��� ����(+ - * /):");
                op = sc.next();
 
                switch (op) {
                case "+":
    				System.out.print("���� : " + num1 + " + " + num2 + " = " + cal.add(num1, num2));
    				break;
    			case "-":
    				System.out.print("���� : " + num1 + " - " + num2 + " = " + cal.min(num1, num2));
    				break;
    			case "*":
    				System.out.print("���� : " + num1 + " * " + num2 + " = " + cal.mul(num1, num2));
    				break;
    			case "/":
    				System.out.print("���� : " + num1 + " / " + num2 + " = " + cal.div(num1, num2));
    				break;
                default:
                    System.out.println("�߸��� �������Դϴ�. �ٽ� �Է����ּ��� ����");
                }
            }

		}
		
		
		
		

	}

}
