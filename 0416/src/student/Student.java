package student ;

public class Student extends Person {
	
// �Ӽ�����
	
/*private String name;
private String job ="�л�";
private int age;*/
	public Student(String name,  int age) {
		// super(); // ����Ŭ������ �⺻������ ȣ��
		super(name, "�л�", age);
		}
  public void study() {
	System.out.println("�����ϱ�");
}





}
