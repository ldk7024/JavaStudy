
public class ex04_�˻��˰���_binary_search {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };
		int search = 32;
		int lowIndex = 0;
		int highIndex = arr.length - 1;
		// ó���� low index = 0, high index = 9, middle index = 4
		//search >30
		// l =5, h = 9, m=7
		//search >66
		// l = 8, h =9, m =8
		// search < 78
		// l =8, h =7
		while (true) {
			int middleIndex = (lowIndex + highIndex) / 2;
			if (search == arr[middleIndex]) {
				System.out.println(search + "��" + middleIndex + "��° ���� �Դϴ�.");
				break;
			} else if (search > arr[middleIndex]) {
				lowIndex = middleIndex + 1;
			} else if (search < arr[middleIndex]) {
				highIndex = middleIndex - 1;
			}
			if (lowIndex >highIndex) {
				System.out.println("���ڸ� ã�� ���Ͽ����ϴ�.");
				break;
			}

		}

	}

}
