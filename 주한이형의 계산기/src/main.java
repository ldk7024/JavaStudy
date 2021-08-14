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

		System.out.println("========= 주한이형과 함께하는 계산기 프로젝트 =========");
		System.out.println();
		/*
		 * do {System.out.print("첫 번째 정수를 입력해주세요 형님:"); num1 = sc.nextInt();
		 * System.out.print("두 번째 정수를 입력해주세요 형님:"); num2 = sc.nextInt();
		 * System.out.print("+,-,*,/ 사칙연산을 입력해주세요 형님"); op = sc.next(); switch (op) {
		 * case "+": System.out.println("정답 : "+num1+" + "+num2+" = "+cal.add(num1,
		 * num2)); break; case "-":
		 * System.out.println("정답 : "+num1+" - "+num2+" = "+cal.min(num1, num2)); break;
		 * case "*": System.out.println("정답 : "+num1+" * "+num2+" = "+cal. mul (num1,
		 * num2)); break; case "/":
		 * System.out.println("정답 : "+num1+" / "+num2+" = "+cal.div(num1, num2)); break;
		 * case "0": System.out.println("===============주한이형의 계산기 종료===============");
		 * break;
		 * 
		 * default: System.out.println("다시 입력해주세요 형님"); break; }
		 * 
		 * } while (num1 !=0 || num2 != 0);
		 * System.out.println("===============주한이형의 계산기 종료===============");
		 */

		/*
		 * while (test) { System.out.print("첫 번째 정수를 입력해주세요 형님:"); num1 = sc.nextInt();
		 * System.out.print("+,-,*,/ 사칙연산을 입력해주세요 형님"); op = sc.next();
		 * System.out.print("두 번째 정수를 입력해주세요 형님:"); num2 = sc.nextInt();
		 * 
		 * switch (op) { case "+": System.out.println("정답 : " + num1 + " + " + num2 +
		 * " = " + cal.add(num1, num2)); break; case "-": System.out.println("정답 : " +
		 * num1 + " - " + num2 + " = " + cal.min(num1, num2)); break; case "*":
		 * System.out.println("정답 : " + num1 + " * " + num2 + " = " + cal.mul(num1,
		 * num2)); break; case "/": System.out.println("정답 : " + num1 + " / " + num2 +
		 * " = " + cal.div(num1, num2)); break; case "0":
		 * 
		 * System.out.println("===============주한이형의 계산기 종료==============="); test =
		 * false; break; default: System.out.println("다시 입력해주세요 형님"); break; }
		 * 
		 * }
		 */

		while (test) {
			System.out.println();
			System.out.print("첫 번째 정수를 입력해주세요 형님: ");
			num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력해주세요 형님: ");
			num2 = sc.nextInt();
			System.out.print("+,-,*,/ 사칙연산을 입력해주세요 형님");
			System.out.println();
			System.out.print(" 0을 입력하시면 프로그램이 종료됩니다 :");
			op = sc.next();
		

			switch (op) {
			case "+":
				System.out.print("정답 : " + num1 + " + " + num2 + " = " + cal.add(num1, num2));
				break;
			case "-":
				System.out.print("정답 : " + num1 + " - " + num2 + " = " + cal.min(num1, num2));
				break;
			case "*":
				System.out.print("정답 : " + num1 + " * " + num2 + " = " + cal.mul(num1, num2));
				break;
			case "/":
				System.out.print("정답 : " + num1 + " / " + num2 + " = " + cal.div(num1, num2));
				break;
			case "0":
				test = false;
				System.out.println("===============주한이형의 계산기 종료===============");
				break;
			default:
				System.out.print("연산자를 잘못 입력하셨습니다 형님");
				break;
			}
	

		}

	}

}
