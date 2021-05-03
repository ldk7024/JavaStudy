import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("db: ");
		int num1 = sc.nextInt();
		System.out.print("전자계산기 구조: ");
		int num2 = sc.nextInt();
		System.out.print("os: ");
		int num3 = sc.nextInt();
		System.out.print("데이터통신: ");
		int num4 = sc.nextInt();
		System.out.print("소프트웨어공학: ");
		int num5 = sc.nextInt();
		int sum= num1+num2+num3+num4+num5;
		if (num1 <8 || num2<8 || num3<8 || num4<8 || num5<8 ){
			System.out.println("불합격입니다. ");
		}else if (sum<=60){
			System.out.println("불합격입니다. ");
		}else{
			System.out.println("합격입니다. ");
			}
		
		
		
}

}
