import java.util.ArrayList;
import java.util.Scanner;

public class ex02_musicpaylist {

	public static void main(String[] args) {
		// �뷡 ����� ������ִ� ���α׷� �ۼ�
		// �뷡�߰�, ����, ��ȸ, ���α׷� ����
		ArrayList<String> musiclist = new ArrayList<String>();
		musiclist.add("������");
		musiclist.add("�Ѹ�");
		musiclist.add("�̾���");

		Scanner sc = new Scanner(System.in);
		// ===================================�޴�����========================================================
		while (true) {
			System.out.print("[1]�뷡�߰� [2]�뷡���� [3]�뷡��ȸ [4]���� >>");
			int menu = sc.nextInt();
			// ==============================4�� ���α׷� ����
			// �ڵ�==========================================
			if (menu == 4) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			// ==============================�޴�1�� �뷡�߰�
			// �ڵ�======================================
			else if (menu == 1) {
				oldmp3(musiclist);
				System.out.println("==================");

				System.out.print("[1]������ ��ġ�� �߰� [2]���ϴ� ��ġ�� �߰� >>");
				int location = sc.nextInt();
				String song;
				if (location == 1) {
					System.out.print("�߰� �� �뷡 �Է�>>");
					song = sc.next();
					musiclist.add(song);

				} else {
					System.out.print("�߰� �� �뷡 �Է� >>");
					song = sc.next();

					System.out.print("�߰� �� ��ġ �Է� >>");
					int addIndex = sc.nextInt();
					musiclist.add(addIndex, song);

				}
				System.out.println("�뷡�� �߰� �Ǿ����ϴ�.");
			}
//===========================2�� �뷡�����ڵ�=================================================
			if (menu == 2) {
				oldmp3(musiclist);
				System.out.println("=============");
				System.out.print("[1]���û���  [2]��ü���� >>");
				int delete = sc.nextInt();
				if (delete == 1) {
					System.out.print("������ �뷡���� >>");
					int delete_song = sc.nextInt();
					musiclist.remove(delete_song - 1);
					System.out.println("�뷡�� �����Ǿ����ϴ�.");
				} else if (delete == 2) {
					musiclist.clear();
					System.out.println("��ü ����Ʈ�� �����Ǿ����ϴ�.");
				}

			}
//==================================3�� �뷡��ȸ �ڵ� =====================================================================
			else if (menu == 3) {
				oldmp3(musiclist);

			}

		}
	}

	private static void oldmp3(ArrayList<String> musiclist) {
		System.out.println("====���� ��� ���=====");
		if (musiclist.size() == 0) {
			System.out.println("��� ����� �����ϴ�.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(i + 1 + "." + musiclist.get(i));

			}
		}
	}
}
