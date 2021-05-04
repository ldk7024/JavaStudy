import java.util.Scanner;

public class ex02_끝말잇기게임 {

	public static void main(String[] args) {
		// 끝말잇기 게임
		Scanner sc = new Scanner(System.in);
		System.out.print("제시어 >> ");
		String game = sc.next();
		while (true) {
			System.out.print("단어를 입력해주세요  >>");
			String word = sc.next();
			char game1 = (game.charAt(game.length() - 1));
			char word1 = (word.charAt(0));

			if (game1 == word1) {
				game = word;

			} else {
				System.out.println("틀렸습니다.");
				System.out.print("계속하시겠습니까? (Y/N) >>");
				String con = sc.next();
				if (con.equals("y") || con.equals("Y")) {
					System.out.print("제시어 >> ");
					game = sc.next();
					continue;
				} else {
					System.out.println("종료되었습니다!!");
					break;
					
				}

			}

		}
	}

}
