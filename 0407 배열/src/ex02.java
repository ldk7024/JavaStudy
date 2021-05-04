import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		int [] input = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		System.out.println("정답을 입력하세요.");
		for (int i=0; i< input.length; i++) {
		System.out.println(i+1+"번답 >>");
		input[i] = sc.nextInt();
		
		


		}
	System.out.println("입력한 답은:");
	for (int i =0; i<input.length; i++)
	{System.out.println(input[i]+" ");}	
	}
	
	

}
