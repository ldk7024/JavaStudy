import java.util.Scanner;

public class ex01_레퍼런스변수 {

	public static void main(String[] args) {
		int num ;
        // 레퍼런스 변수 선언 -> 레퍼런스 변수는 주소를 저장하는 변수
		int[] intArray;  //크기는 선언할때 정하는 게 아니라 배열 생성할때 정하는 것이다.
   
		// 배열 생성
		intArray=new int [5];   //파이썬의 리스트와 다른 점은 배열을 생성하기전에 배열의 크기를 명시해놓음으로써 배열을 늘릴 수 없다. (불변적)
		System.out.println(intArray);
	  
	
	    System.out.println(intArray[0]);
	    intArray[0] = 15;
	    System.out.println(intArray[0]);   //변수에 데이터를 담는 방법은 변수에 대입하듯이 담으면 된다.
	    
	    // 배열 선언과 동시에 초기화
	    int[ ] array = {4,3,2,1,0};
	    System.out.println(array[2]);    //배열 생성과 동시에 초기화 해줘야함, 따로 초기화해주면 오타남.
	    int[ ] array2;
	    //   array2 = {3,4,5}; 실행오류
	    int[ ] array3 = new int [3];
	    //   array3 = {3,7,8}; 실행오류
	    
	    
	    
	    
	    
	    
	
	
	
	
	}

}
