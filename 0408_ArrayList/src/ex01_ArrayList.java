import java.util.ArrayList;

public class ex01_ArrayList {

	public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    //�߰�
    list.add("Hello");
    list.add("Hi");
    list.add("Java");
    
    // ������ ��������
    System.out.println(list.get(1));
	
    // �߰��� ����Ʈ ����
	list.add(1,"python");
	
	System.out.println(list.get(1));
	System.out.println(list.get(2));
	
	// ������ ����
	System.out.println(list.size());
	
	//������ ����
	list.remove(0);
	System.out.println(list.get(0));
	
	// ��� ��� ����
	list.clear();
	System.out.println(list.size());
	
	
	}

}
