import java.util.ArrayList;
import java.util.Scanner;

public class addressmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<address> list = new ArrayList<address>();
		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료  >>");
			int input = sc.nextInt();
			if (input == 5) {
				System.out.println("프로그램 종료");
				break;
			} else if (input == 1) {
				System.out.print("이름: ");
				String input1 = sc.next();
				System.out.print("나이: ");
				int input2 = sc.nextInt();
				System.out.print("전화번호: ");
				String input3 = sc.next();
				address a = new address(input1, input2, input3);
				list.add(a);
			} else if (input == 2) {
				int i = 1;
				for (address a : list) {
					System.out.println(i+"."+ a.getName() + "(" + a.getAge() + ")" +":" +" "+ "" + a.getPhonenumber());
					i++;

				}
				if (list.size() == 0) {
					System.out.println("등록된 연락처가 없습니다.");

				}
			} else if (input == 3) {
				System.out.print("삭제 할 번호 입력: ");
				int re = sc.nextInt();
				list.remove(re - 1);
			} else if (list.size() == 0) {
				System.out.println("등록된 연락처가 없습니다.");

			}
			else if (input == 4) {
	            System.out.print("검색할 이름 입력 : ");
	            String name = sc.next();
	            if (list.size() > 0) {
	               for (int i = 0; i < list.size(); i++) {
	                  if (list.get(i).getName().equals(name)) {
	                     System.out.println(i + 1 + ". " + list.get(i).getName() + "(" + list.get(i).getAge() + ")세 : "
	                           + list.get(i).getPhonenumber());
	                  } else {
	                     System.out.println("검색할 이름의 정보가 없습니다.");
	                  }
	               }
	            }
	            else {
	               System.out.println("검색할 이름의 정보가 없습니다.");
	            }

	         }
			
		       
				}
			}
		

	}




