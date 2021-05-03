import java.util.Scanner;

public class ex02review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("java 점수 입력:");
		int javascore = sc.nextInt();
		System.out.print("web 점수 입력:");
		int webscore = sc.nextInt();
		System.out.print("Android 점수 입력:");
		int androidscore = sc.nextInt();
		
	    System.out.println("합계: " + (javascore + webscore + androidscore) );
		System.out.println("평균: " +((javascore+webscore+androidscore)/3));

	}

}
