import java.util.Random;

public class MonitorMain {

	public static void main(String[] args) {
	  Math.pow(2, 3); //
	  
		
	  monitor.lightup(); // static -> �ϳ��� �ּ� ���� �Ҵ���� -> ��ü�������ص� ȣ���� ����
	  //monitor.on();  ->  static x -> ��ü������ �ؾ����� ȣ�� ����
		
		
		// Monitor ��ü ����
      monitor m =new monitor();
     
      m.on();
      m.lightup();
	}

}
