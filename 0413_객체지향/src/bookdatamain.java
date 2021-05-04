import java.util.Scanner;

public class bookdatamain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bookdata[] bb = new bookdata[5];
		bb[0] = new bookdata("Java", 21000, "홍길동");
		bb[1] = new bookdata("C++", 29000, "박문숙");
		bb[2] = new bookdata("DataBase", 31000, "김장독");
		bb[3] = new bookdata("Android", 18000, "이순신");
		bb[4] = new bookdata("Web", 26000, "김철수");
		System.out.print("금액을 입력하세요: ");
		int money = sc.nextInt();
		System.out.println("구매 가능한 책 목록");
		for (int i = 0; i < bb.length; i++) {
			if (bb[i].getPrice() < money) {
				System.out.println("[" + bb[i].getTitle() + "," + bb[i].getPrice() + "," + bb[i].getWriter() + "]");

			}

		}
	}
}