import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >> ");
			int num2 = sc.nextInt();
			System.out.print("[1]더하기 [2]빼기 >> ");
			int num3 = sc.nextInt();
			if (num3 == 1) {
				System.out.print("더하기 연산 결과는" + (num1 + num2) + "입니다.");
			} else if (num3 == 2) {
				System.out.print("빼기 연산 결과는" + (num1 - num2) + "입니다.");
			}
			System.out.println("다시 실행하시겠습니까? (Y/N) ");
			choice = sc.next();

		} while (choice.equals("Y"));
		System.out.println("종료되었습니다.");

	}

}
