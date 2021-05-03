import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		//int num = 456;
        
		// System.out.println(num/100)*100;
		// System.out.println((num/10)*10+1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		int num = sc. nextInt();
		//1시간: 3600초/ 1분: 60초
		System.out.print(num/3600 + "시 ");
		System.out.print(((num%3600)/60) + "분");
		System.out.print((num%600)%60 + "초");

	
	}

}
