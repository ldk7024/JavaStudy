import java.util.Scanner;

public class bookdatamain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bookdata[] bb = new bookdata[5];
		bb[0] = new bookdata("Java", 21000, "ȫ�浿");
		bb[1] = new bookdata("C++", 29000, "�ڹ���");
		bb[2] = new bookdata("DataBase", 31000, "���嵶");
		bb[3] = new bookdata("Android", 18000, "�̼���");
		bb[4] = new bookdata("Web", 26000, "��ö��");
		System.out.print("�ݾ��� �Է��ϼ���: ");
		int money = sc.nextInt();
		System.out.println("���� ������ å ���");
		for (int i = 0; i < bb.length; i++) {
			if (bb[i].getPrice() < money) {
				System.out.println("[" + bb[i].getTitle() + "," + bb[i].getPrice() + "," + bb[i].getWriter() + "]");

			}

		}
	}
}