import java.util.Random;

public class MonitorMain {

	public static void main(String[] args) {
	  Math.pow(2, 3); //
	  
		
	  monitor.lightup(); // static -> 하나의 주소 값만 할당받음 -> 객체생성안해도 호출이 가능
	  //monitor.on();  ->  static x -> 객체생성을 해야지만 호출 가능
		
		
		// Monitor 객체 생성
      monitor m =new monitor();
     
      m.on();
      m.lightup();
	}

}
