import java.util.Scanner;

public class ex02_�����ձ���� {

	public static void main(String[] args) {
		// �����ձ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���þ� >> ");
		String game = sc.next();
		while (true) {
			System.out.print("�ܾ �Է����ּ���  >>");
			String word = sc.next();
			char game1 = (game.charAt(game.length() - 1));
			char word1 = (word.charAt(0));

			if (game1 == word1) {
				game = word;

			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				System.out.print("����Ͻðڽ��ϱ�? (Y/N) >>");
				String con = sc.next();
				if (con.equals("y") || con.equals("Y")) {
					System.out.print("���þ� >> ");
					game = sc.next();
					continue;
				} else {
					System.out.println("����Ǿ����ϴ�!!");
					break;
					
				}

			}

		}
	}

}
