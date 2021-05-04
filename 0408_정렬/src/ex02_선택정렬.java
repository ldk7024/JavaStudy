import java.util.Arrays;

public class ex02_선택정렬 {

	public static void main(String[] args) {
		System.out.println("==정렬전 ==");
	      int[] arr = { 7, 98, 13, 70, 24 };
	      // 1step : 가장 큰 수를 찾아 0번째로 이동 (버블정렬과 다르게 스텝별로 치환이 1번만 이뤄짐)
	      System.out.println(Arrays.toString(arr));

	      System.out.println("==정렬중 ==");
	      for (int k = 0; k < arr.length-1; k++) {
	         int maxIndex = k; // 가장 큰 수의 인덱스(기준) 찾기
	         for (int i = k+1; i < arr.length; i++) { // i = 0번은 비교할 필요 없음
	            if (arr[i] > arr[maxIndex]) {
	               maxIndex = i;
	            }
	         } // 최대값의 인덱스를 찾는 알고리즘
	         int temp = arr[k];
	         arr[k] = arr[maxIndex];
	         arr[maxIndex] = temp;
	         //실제 배열 내용을 치환해주는 알고리즘
	      }

	      System.out.println("==정렬후 ==");
	      System.out.println(Arrays.toString(arr)); // 정렬 후

	}

}
