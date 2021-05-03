import java.util.Scanner;

public class ex04무한반복문으로풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int all = 0;
		
		while(true) {
			System.out.println("정수 입력: ");
			Scanner sc = new Scanner(System.in);
			if(num<0 || num>100) {
				break;
				} 
			      sum+=num;
				  all++;

	


			}
		System.out.println("합계: " + sum);
		System.out.println("평균:" + (float) sum / all);

	}

}
