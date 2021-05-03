import java.util.Scanner;

public class ex07시급계산기 {

	public static void main(String[] args) {
		//시급계산기
		Scanner sc = new Scanner(System.in);
		System.out.print("노동시간을 입력하세요: ");
		int workhour = sc.nextInt();
		int basicpay = 5000;
		int pay = workhour > 8 ? 40000 + (basicpay / 2 * 3*(workhour - 8)) : basicpay*workhour;
		System.out.print("총 임금은" + pay +"원 입니다."); 
	}

}
