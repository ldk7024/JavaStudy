import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		calculate cal = new calculate();
		Boolean test = true;
		String op = "";
		int num1 = 0;
		int num2 = 0;
		char ju = 'y';
		/*
		 * int result1 = cal.add(num1, num2); int result2 = cal.min(num1, num2); int
		 * result3 = cal.mul(num1, num2); int result4 = cal.div(num1, num2);
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("========= ���������� �Բ��ϴ� ���� ������Ʈ =========");
		System.out.println();
		/*
		 * do {System.out.print("ù ��° ������ �Է����ּ��� ����:"); num1 = sc.nextInt();
		 * System.out.print("�� ��° ������ �Է����ּ��� ����:"); num2 = sc.nextInt();
		 * System.out.print("+,-,*,/ ��Ģ������ �Է����ּ��� ����"); op = sc.next(); switch (op) {
		 * case "+": System.out.println("���� : "+num1+" + "+num2+" = "+cal.add(num1,
		 * num2)); break; case "-":
		 * System.out.println("���� : "+num1+" - "+num2+" = "+cal.min(num1, num2)); break;
		 * case "*": System.out.println("���� : "+num1+" * "+num2+" = "+cal. mul (num1,
		 * num2)); break; case "/":
		 * System.out.println("���� : "+num1+" / "+num2+" = "+cal.div(num1, num2)); break;
		 * case "0": System.out.println("===============���������� ���� ����===============");
		 * break;
		 * 
		 * default: System.out.println("�ٽ� �Է����ּ��� ����"); break; }
		 * 
		 * } while (num1 !=0 || num2 != 0);
		 * System.out.println("===============���������� ���� ����===============");
		 */

		/*
		 * while (test) { System.out.print("ù ��° ������ �Է����ּ��� ����:"); num1 = sc.nextInt();
		 * System.out.print("+,-,*,/ ��Ģ������ �Է����ּ��� ����"); op = sc.next();
		 * System.out.print("�� ��° ������ �Է����ּ��� ����:"); num2 = sc.nextInt();
		 * 
		 * switch (op) { case "+": System.out.println("���� : " + num1 + " + " + num2 +
		 * " = " + cal.add(num1, num2)); break; case "-": System.out.println("���� : " +
		 * num1 + " - " + num2 + " = " + cal.min(num1, num2)); break; case "*":
		 * System.out.println("���� : " + num1 + " * " + num2 + " = " + cal.mul(num1,
		 * num2)); break; case "/": System.out.println("���� : " + num1 + " / " + num2 +
		 * " = " + cal.div(num1, num2)); break; case "0":
		 * 
		 * System.out.println("===============���������� ���� ����==============="); test =
		 * false; break; default: System.out.println("�ٽ� �Է����ּ��� ����"); break; }
		 * 
		 * }
		 */

		while (test) {
			System.out.println();
			System.out.print("ù ��° ������ �Է����ּ��� ����: ");
			num1 = sc.nextInt();
			System.out.print("�� ��° ������ �Է����ּ��� ����: ");
			num2 = sc.nextInt();
			System.out.print("+,-,*,/ ��Ģ������ �Է����ּ��� ����");
			System.out.println();
			System.out.print(" 0�� �Է��Ͻø� ���α׷��� ����˴ϴ� :");
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
			case "0":
				test = false;
				System.out.println("===============���������� ���� ����===============");
				break;
			default:
				System.out.print("�����ڸ� �߸� �Է��ϼ̽��ϴ� ����");
				break;
			}
	

		}

	}

}
