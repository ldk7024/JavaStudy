import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		int [] input = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("==ä���ϱ�==");
		System.out.println("������ �Է��ϼ���.");
		for (int i=0; i< input.length; i++) {
		System.out.println(i+1+"���� >>");
		input[i] = sc.nextInt();
		
		


		}
	System.out.println("�Է��� ����:");
	for (int i =0; i<input.length; i++)
	{System.out.println(input[i]+" ");}	
	}
	
	

}
