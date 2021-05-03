import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int totalscore = sc.nextInt();
		//IF문: 순차적으로 조건을 비교하면서 코드가 진행
		//IF문을 각각 따로 구현했을 때는 개별적으로 코드가 진행됨
		if (totalscore>=90) {System.out.println("A학점입니다.");}
		else if (totalscore>=80 && totalscore<=89) {System.out.println("B학점입니다.");}
		else if (totalscore>=70 && totalscore<=79) {System.out.println("C학점입니다.");}
		else {System.out.println("D학점입니다.");}
		
	}

}
