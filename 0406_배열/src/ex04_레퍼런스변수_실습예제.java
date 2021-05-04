
public class ex04_레퍼런스변수_실습예제 {

	public static void main(String[] args) {
		// 정수형 데이터 10개를 담을 수 있는 배열을 생성
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("array에 들어있는 짝수는");
		// 짝수 데이터만 출력
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println("입니다.");
	// array index out of bounds 에러는 범위를 벗어나서 생기는 오류다.
	
	System.out.println();
	// 홀수 데이터만 출력하기
	int sum1=0;
	System.out.print("array에 들어있는 홀수는");
	for (int i =0 ; i < array.length ; i++) {
		if (array[i]%3==0) {
			System.out.print(array[i] + " " );
			sum1++;
		}
	 }
	System.out.println("이며," + sum1 + "개 입니다.");
	
	
	
	
	
	
	
	}

}
