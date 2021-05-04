import java.util.ArrayList;
import java.util.Scanner;

public class ex02_musicpaylist {

	public static void main(String[] args) {
		// 노래 목록을 만들어주는 프로그램 작성
		// 노래추가, 삭제, 조회, 프로그램 종료
		ArrayList<String> musiclist = new ArrayList<String>();
		musiclist.add("좋은날");
		musiclist.add("롤린");
		musiclist.add("미안해");

		Scanner sc = new Scanner(System.in);
		// ===================================메뉴삽입========================================================
		while (true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료 >>");
			int menu = sc.nextInt();
			// ==============================4번 프로그램 종료
			// 코드==========================================
			if (menu == 4) {
				System.out.println("종료되었습니다.");
				break;
			}
			// ==============================메뉴1번 노래추가
			// 코드======================================
			else if (menu == 1) {
				oldmp3(musiclist);
				System.out.println("==================");

				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가 >>");
				int location = sc.nextInt();
				String song;
				if (location == 1) {
					System.out.print("추가 할 노래 입력>>");
					song = sc.next();
					musiclist.add(song);

				} else {
					System.out.print("추가 할 노래 입력 >>");
					song = sc.next();

					System.out.print("추가 할 위치 입력 >>");
					int addIndex = sc.nextInt();
					musiclist.add(addIndex, song);

				}
				System.out.println("노래가 추가 되었습니다.");
			}
//===========================2번 노래삭제코드=================================================
			if (menu == 2) {
				oldmp3(musiclist);
				System.out.println("=============");
				System.out.print("[1]선택삭제  [2]전체삭제 >>");
				int delete = sc.nextInt();
				if (delete == 1) {
					System.out.print("삭제할 노래선택 >>");
					int delete_song = sc.nextInt();
					musiclist.remove(delete_song - 1);
					System.out.println("노래가 삭제되었습니다.");
				} else if (delete == 2) {
					musiclist.clear();
					System.out.println("전체 리스트가 삭제되었습니다.");
				}

			}
//==================================3번 노래조회 코드 =====================================================================
			else if (menu == 3) {
				oldmp3(musiclist);

			}

		}
	}

	private static void oldmp3(ArrayList<String> musiclist) {
		System.out.println("====현재 재생 목록=====");
		if (musiclist.size() == 0) {
			System.out.println("재생 목록이 없습니다.");
		} else {
			for (int i = 0; i < musiclist.size(); i++) {
				System.out.println(i + 1 + "." + musiclist.get(i));

			}
		}
	}
}
