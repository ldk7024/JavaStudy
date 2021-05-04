import java.util.Scanner;

public class ex06_레퍼런스변수_실습예제 {

	public static void main(String[] args) {
		// 5개의 정수형 데이터를 담을 수 있는 배열 생성
		int[] scoreArr = new int[5];
		Scanner SC = new Scanner(System.in);
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(i + 1 + "번째 입력 >>");
			scoreArr[i] = SC.nextInt();
		}
		System.out.print("입력된 점수: ");
		for (int j = 0; j < scoreArr.length; j++) {
			System.out.print(scoreArr[j] + " ");
		}
	}

}
