
public class ex03_레퍼런스변수_실습예제 {
	public static void main(String[] args) {

	   // 정수형 데이터 여러개를 담을 수 있는 레퍼런스 변수 array를 선언
		int[] array; 
	   
		// 정수형 데이터 5개를 담을 수 있는 배열을 생성해서 array에 대입
		array = new int[5];   // 0으로 초기화 되어 있음
		
		// 각각의 인덱스에 1~20사이의 숫자 대입
		array[0] = 15;
	    array[1] = 10;
	    array[2] = 2;
	    array[3] = 7;
	    array[4] = 18;
	
	    // 배열 array에 들어있는 모든 데이터를 출력
	    for (int i = 0; i<array.length ; i++)
	    System.out.println(array[i]);
	    
	    System.out.println();
	    
	    // 1번째 값과 4번째 값 더해서 출력하기
	    System.out.println(array[1] + array[4]);
	    
	    int sum =0;
	    for (int i=0 ; i<array.length ; i++ )
	    {sum+=array[i];}
	    System.out.println("합계:" + sum);
	    
	
	    // 평균 값 출력
       System.out.println("평균:" +(float)sum/array.length);
	
	}
	   

}
