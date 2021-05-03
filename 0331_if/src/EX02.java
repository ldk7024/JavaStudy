import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력하세요: ");
		String opr = sc.next();
		System.out.println("A값을 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.println("B값을 입력하세요: ");
		int num2 = sc.nextInt();
		if (opr.equals("+")) {System.out.print(num1+"과"+num2+"의 합은"+ (num1+num2)+ "입니다.");}
		else if (opr.equals("-")) {System.out.print(num1+"과"+num2+"의 차는"+ (num1-num2)+ "입니다.");}
		else if (opr.equals("*")) {System.out.print(num1+"과"+num2+"의 곱은 "+ (num1*num2)+ "입니다.");}
		else {System.out.print(num1+"과"+num2+"의 나누기는"+ (num1/num2)+"입니다.");}
	}

}