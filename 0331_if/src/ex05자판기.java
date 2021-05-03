import java.util.Scanner;

public class ex05자판기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 컨트롤 a 전체선택
		// 컨트롤 쉬프트 f 전체 들여쓰기
		// 스위칭 변수
		boolean sw = true;
		while(sw) {
		System.out.println("금액을 입력하세요");
		int price = sc.nextInt();
		System.out.println("메뉴를 고르세요: 1번 > 콜라 (800원) 2번 > 생수 (500원) 3번> 비타민워터 (1500원) 4번 > 종료");
		int menu = sc.nextInt();
		int price_after= 0;
		switch (menu) { case 1: System.out.println("콜라 선택");
		                price_after = price - 800; 
	                   	break;
		                case 2: System.out.println("생수 선택");
		                price_after = price - 500; 
       	                break;
		                case 3: System.out.println("비타민 워터 선택");
		                
		                price_after = price - 1500; 
		                break; 
		                default: System.out.println("다시 선택해주세요 ");
		                break; 
		                case 4: System.out.println("프로그램 종료 ");
		                sw= false;
		                }
		               if(price_after<0) {System.out.println("돈이 부족합니다.");}
		               else {
		               System.out.println("잔돈: "+(price_after));
		               System.out.println("천원: "+(price_after/1000));
		               System.out.println("오백원: "+(price_after%1000/500));
		               System.out.println("백원: "+(price_after%1000%500/100));}
	
		              }
	
	
	
	}

}
