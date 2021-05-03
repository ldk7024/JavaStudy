import java.util.Scanner;

public class ex04dowhile문으로풀기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num ;
		int sum = 0;
		int all = 0;
	    do {System.out.println("숫자를 입력하세요 ");
		    num = sc.nextInt();
	        sum += num; //sum = sum=num
			all++;}  //all+=1
		
		while(num>=0 && num<=100);
	    System.out.println("합계: " + sum);
		System.out.println("평균:" + (float) sum / all);

	
	
	
	
	
	
	
	}

}
