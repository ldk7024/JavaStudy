import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		String data ="여러분 잘 쉬셨나요?";
		// 문자열. indexOf("문자") -> 매개변수로 넣은 문자의 위치 리턴   // 특정 문자의 위치를 알고 싶을때
		System.out.println("==indexOf");
		System.out.println(data.indexOf('?'));
		System.out.println(data.indexOf("쉬"));
		System.out.println(data.indexOf("잘",5));
		System.out.println();
		// 문자열.contains("문자") -> 매개변수로 넣은 문자열이 포함되어있는지 판별
/*		  System.out.println("==contains==");
          System.out.println(data.contains("?")); 
          System.out.println(data.contains("!"));
          System.out.println();
          System.out.println("==실슴예제==");
          String phone = "010-3369-6611";
          Scanner sc = new Scanner(System.in);
          System.out.print("검색할 문자 입력: ");
          String search = sc.next();
          if (phone.contains(search)) {
        	  System.out.println(search +"은 포함되어있습니다.");}
          else { System.out.println(search + "은 문자열에 포함되어있지 않습니다.");
        	  
          }	  */
		// 문자열. subsring(strart 인덱스, end 인덱스)
		// 매개 변수로 넣은 위치부터 문자열을 잘라서 리턴하는 메소드, 파이썬의 슬라이싱과 비슷하다.
        System.out.println("==substring==");
	    System.out.println(data.substring(4));
	    System.out.println(data.substring(1, 7));
	    System.out.println();
	    //문자열. charAt(인덱스) -> 문자열에서 매개변수로 넣은 인덱스번째 문자를 반환
	    System.out.println("==charAt==");
	    char s = data.charAt(0);
	    System.out.println(s);
	    System.out.println(data.charAt(data.length()-1));

	
	
	
	
	
	}
          
	

}
