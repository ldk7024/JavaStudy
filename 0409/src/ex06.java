import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요: ");
		int base = sc.nextInt();
		System.out.print("제곱근을 입력하세요: ");
		int n = sc.nextInt();
		int result = powerN(base, n);
		System.out.println("결과확인: " +result);

	
	
	
	
	}
 public static int powerN(int base, int n) {
	 int result =1;
	 for (int i=0;i<n; i++) {
		 result=result*base;
	 }
	 return result;
 }
     
  
 }

