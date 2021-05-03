import java.util.Scanner;

public class ex03변수종류문자정수실수논리 {

	public static void main(String[] args) {
	// 변수
		
    // 논리형(true/false)
	boolean strBool = true; //*많이 사용함
		
    // 문자형
	char strChar = 'H';
	
	String strString= "Hello"; //* 많이 사용함
	
    // 정수형
	byte intByte = 1; //1byte // - 127 ~ 128
	short intShort = 1; // 2byte 
	int intInt = 1; // 4byte //*많이 사용함
	long intLong = 1; // 8byte
    
	// 실수형
	float floatFloat = 1.0f;//4byte //* 많이 사용함 //float를 사용할 때는 실수뒤에 f를 꼭 붙여야함!
	double floatDouble = 1.0; //8byte

	//boolean, string, int, float를 주로 사용하기 때문에 이 4개를 기억!!!
	
	// 변수명을 만들때 주의해야할 사항
	// 1. 키워드 사용 불가(int, float, public, class등)
	// 2. 대소문자를 꼭 구별해야함 ( int True, int true는 다른값) //카멜
	// 3. 변수명은 숫자로 시작 불가 (int 1num =0; -> 안됨)
	// 4. 특수문자는 _와 $만 사용가능
	
	
	}

}
