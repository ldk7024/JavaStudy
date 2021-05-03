import java.util.Scanner;

public class ex01 {// 현재 작업하고 있는 파일이 java파일
      // 자바파일에서 단위를 중괄호로 구분
	public static void main(String[] args) {
		// 자바파일이 시작됬을 때 가장 먼저 실행되는 영역
        
		// 출력과 입력
		// 자바는 대 소문자를 정확히 구분
		System.out.print("HELLO world ~!");
		System.out.println("Hello World~!");
		System.out.println("Hello World~!");
	
       System.out.println(1+1);
       System.out.println(1-1);
       System.out.println(1*1);
       System.out.println(1/1);
       
	System.out.println("1+1="+(1+1));
	System.out.println("1-1="+(1-1));
	System.out.println("1*1="+(1*1));
	System.out.println("1/1="+(1/1));
	
	//입력
	Scanner sc =  new Scanner(System.in);
	System.out.print("정수값1 입력: ");
    int num1 = sc. nextInt();
    // 어떤 데이터 타입(정수, 문자, 실수등)의 변수인지 미리 정해놔야함
    System.out.print("정수값2 입력:");
   int num2 = sc.nextInt();
	System.out.println("사용자가 입력한 정수값:" +num1);
	System.out.println("사용자가 입력한 정수값:" +num2);
	System.out.println("정수값1 + 정수값2 :" + (num1+num2));
	}

}

// 파이썬: 런타임 오류 (실행을 해야지만 오류를 알 수 있음)
// 자바: statament error (코드를 입력할때 바로 에러를 출력)
// 자바파일의 실행과정
//.java (개발자가 개발하는 파일) -> .class (기계가 읽을 수 있는 파일)



// 주의사항
//1. 자바는 대소문자를 정확하게 구분해줘야함
//2. 문자를 입력할때 ''안되고 ""로 입력
//3. 하나의 코드 문장이 끝날 때 꼭 뒤어 ;(세미콜론) 붙여줘야함
//4. java에서는 ctrl+space가 자동완성 (꼭 자동완성에 익숙해져야한다.)
//5. 문자와 숫자를 혼합해서 출력할 때 +기호를 사용
//6. 숫자를 문자로 바꿀 때 -> 문자와 혼합해서 사용