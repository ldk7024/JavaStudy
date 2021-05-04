import java.util.Scanner;

public class for僥_蕨薯 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;
		for (int i = 0; i < 11; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) {
				sum++;
			} else {
				cnt++;
			}

		}
System.out.println("礎熱 偃熱:"+ sum);
System.out.println("�汝� 偃熱:"+ cnt);
	}

}
