import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		//int num = 456;
        
		// System.out.println(num/100)*100;
		// System.out.println((num/10)*10+1);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int num = sc. nextInt();
		//1�ð�: 3600��/ 1��: 60��
		System.out.print(num/3600 + "�� ");
		System.out.print(((num%3600)/60) + "��");
		System.out.print((num%600)%60 + "��");

	
	}

}
