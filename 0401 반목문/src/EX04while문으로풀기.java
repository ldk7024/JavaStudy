import java.util.Scanner;

public class EX04while문으로풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int all = 0;
		while (true) {
			System.out.println("숫자를 입력하세요 ");
			int num = sc.nextInt();
			if (num <= 100 && num>=0) {
				sum += num;
				all++;
			} else {
				break;
			}
			

		} 
		System.out.println("합계: " + sum);
		System.out.println("평균:" + ((float) sum / all));

	}

}
