import java.util.ArrayList;
import java.util.Scanner;

public class addressmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<address> list = new ArrayList<address>();
		while (true) {
			System.out.print("[1]�߰� [2]��ü��ȸ [3]���� [4]�˻� [5]����  >>");
			int input = sc.nextInt();
			if (input == 5) {
				System.out.println("���α׷� ����");
				break;
			} else if (input == 1) {
				System.out.print("�̸�: ");
				String input1 = sc.next();
				System.out.print("����: ");
				int input2 = sc.nextInt();
				System.out.print("��ȭ��ȣ: ");
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
					System.out.println("��ϵ� ����ó�� �����ϴ�.");

				}
			} else if (input == 3) {
				System.out.print("���� �� ��ȣ �Է�: ");
				int re = sc.nextInt();
				list.remove(re - 1);
			} else if (list.size() == 0) {
				System.out.println("��ϵ� ����ó�� �����ϴ�.");

			}
			else if (input == 4) {
	            System.out.print("�˻��� �̸� �Է� : ");
	            String name = sc.next();
	            if (list.size() > 0) {
	               for (int i = 0; i < list.size(); i++) {
	                  if (list.get(i).getName().equals(name)) {
	                     System.out.println(i + 1 + ". " + list.get(i).getName() + "(" + list.get(i).getAge() + ")�� : "
	                           + list.get(i).getPhonenumber());
	                  } else {
	                     System.out.println("�˻��� �̸��� ������ �����ϴ�.");
	                  }
	               }
	            }
	            else {
	               System.out.println("�˻��� �̸��� ������ �����ϴ�.");
	            }

	         }
			
		       
				}
			}
		

	}




