import java.util.Arrays;

public class ex02_�������� {

	public static void main(String[] args) {
		System.out.println("==������ ==");
	      int[] arr = { 7, 98, 13, 70, 24 };
	      // 1step : ���� ū ���� ã�� 0��°�� �̵� (�������İ� �ٸ��� ���ܺ��� ġȯ�� 1���� �̷���)
	      System.out.println(Arrays.toString(arr));

	      System.out.println("==������ ==");
	      for (int k = 0; k < arr.length-1; k++) {
	         int maxIndex = k; // ���� ū ���� �ε���(����) ã��
	         for (int i = k+1; i < arr.length; i++) { // i = 0���� ���� �ʿ� ����
	            if (arr[i] > arr[maxIndex]) {
	               maxIndex = i;
	            }
	         } // �ִ밪�� �ε����� ã�� �˰���
	         int temp = arr[k];
	         arr[k] = arr[maxIndex];
	         arr[maxIndex] = temp;
	         //���� �迭 ������ ġȯ���ִ� �˰���
	      }

	      System.out.println("==������ ==");
	      System.out.println(Arrays.toString(arr)); // ���� ��

	}

}
