package student;

public class PersonMain {

	public static void main(String[] args) {
	// Student ��ü ����
	Student student = new Student("�̴뱳", 26);
	// Teacher ��ü ����
     Teacher teacher = new Teacher("�輺��", 27,1000000000);
	
	//�迭���� (���� 2)
	Person [] arr =new Person[2];
	// student ��ü�� teacher ��ü �ڵ�����ȯ -> person(��ĳ����)
	arr[0] =  student;
	arr[1] = teacher;
	
	for(Person p:arr) {
		System.out.println("�̸�: "+p.getName());
		System.out.println("����: "+p.getJob());
		System.out.println("����: "+p.getAge());
	}
	// �ٿ�ĳ����: ���� ��ü�� �޼ҵ�, �ʵ忡 �����ϱ� ���� ���� ����ȯ
	// student�� study() ȣ��
	Student student2 = (Student)arr[0];
	student2.study();
	
	// teacher�� �������
	       Teacher teacher2  = (Teacher)arr[1];
	       teacher2.getPay();
	       teacher2.teach();
	
	
	
	}

}
