import java.util.Arrays;

public class ex01_�������� {

	public static void main(String[] args) {
	// ���� �˰���: ���ҵ��� ������ ������� �����ϴ� �˰���
	// ���� ����: �� ������ ���Ҹ� ���Ͽ� �����ϴ� ���, ��������� �ӵ��� ��������, �ڵ尡 �ܼ��ϴ�.
	// 1 step -> ���� ū ���� �� ���������� ������.
	// 2 step -> ���� ���ؼ�  �� �������� ū ���� ������ �ι�° ���������� ������.
    int [] arr = {5,4,3,2,1};
    
    System.out.println(Arrays.toString(arr));
    // 1 step    0>1 1>2 2>3 3>4 
    // 2 step    0>1 1>2 2>3 3>4 

		for (int k = 0; k < 4; k++) {
			for (int i=0; i < arr.length - 1-k; i++) {

				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
