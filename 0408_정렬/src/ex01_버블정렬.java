import java.util.Arrays;

public class ex01_버블정렬 {

	public static void main(String[] args) {
	// 정렬 알고리즘: 원소들을 일정한 순서대로 열거하는 알고리즘
	// 버블 정렬: 두 인접한 원소를 비교하여 정렬하는 방법, 상대적으로 속도는 느리지만, 코드가 단순하다.
	// 1 step -> 가장 큰 수를 맨 오른쪽으로 보낸다.
	// 2 step -> 서로 비교해서  그 다음으로 큰 수를 끝에서 두번째 오른쪽으로 보낸다.
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
