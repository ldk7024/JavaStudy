import java.util.Scanner;

public class ex01 {// ���� �۾��ϰ� �ִ� ������ java����
      // �ڹ����Ͽ��� ������ �߰�ȣ�� ����
	public static void main(String[] args) {
		// �ڹ������� ���ۉ��� �� ���� ���� ����Ǵ� ����
        
		// ��°� �Է�
		// �ڹٴ� �� �ҹ��ڸ� ��Ȯ�� ����
		System.out.print("HELLO world ~!");
		System.out.println("Hello World~!");
		System.out.println("Hello World~!");
	
       System.out.println(1+1);
       System.out.println(1-1);
       System.out.println(1*1);
       System.out.println(1/1);
       
	System.out.println("1+1="+(1+1));
	System.out.println("1-1="+(1-1));
	System.out.println("1*1="+(1*1));
	System.out.println("1/1="+(1/1));
	
	//�Է�
	Scanner sc =  new Scanner(System.in);
	System.out.print("������1 �Է�: ");
    int num1 = sc. nextInt();
    // � ������ Ÿ��(����, ����, �Ǽ���)�� �������� �̸� ���س�����
    System.out.print("������2 �Է�:");
   int num2 = sc.nextInt();
	System.out.println("����ڰ� �Է��� ������:" +num1);
	System.out.println("����ڰ� �Է��� ������:" +num2);
	System.out.println("������1 + ������2 :" + (num1+num2));
	}

}

// ���̽�: ��Ÿ�� ���� (������ �ؾ����� ������ �� �� ����)
// �ڹ�: statament error (�ڵ带 �Է��Ҷ� �ٷ� ������ ���)
// �ڹ������� �������
//.java (�����ڰ� �����ϴ� ����) -> .class (��谡 ���� �� �ִ� ����)



// ���ǻ���
//1. �ڹٴ� ��ҹ��ڸ� ��Ȯ�ϰ� �����������
//2. ���ڸ� �Է��Ҷ� ''�ȵǰ� ""�� �Է�
//3. �ϳ��� �ڵ� ������ ���� �� �� �ھ� ;(�����ݷ�) �ٿ������
//4. java������ ctrl+space�� �ڵ��ϼ� (�� �ڵ��ϼ��� �ͼ��������Ѵ�.)
//5. ���ڿ� ���ڸ� ȥ���ؼ� ����� �� +��ȣ�� ���
//6. ���ڸ� ���ڷ� �ٲ� �� -> ���ڿ� ȥ���ؼ� ���