package Employee;

public class EmpolyeeMain {

	public static void main(String[] args) {
		// �߻�Ŭ������ ��ü ���� �Ұ��� -> ����� ���ؼ� ����Ŭ������ ��ü �����ؾ���
		// new Employee();
		
		//regular, parttime, temp ��ü����
		//�迭�� �־��ֱ� (���� 3�� �迭)
		//print() �޼ҵ� ȣ��
		
		RegularEmployee r = new RegularEmployee("1", "�̴뱳", 7000, 500); 
		PartTimeEmployee p = new PartTimeEmployee("2", "��¿�", 10000, 20);
		TempEmployee t = new TempEmployee("3", "��ȣ��", 6000);
		
		Employee[]arr = new Employee[3]; //�����մϴ�
		arr[0] = r;
		arr[1] = p;
		arr[2] = t;
		
		for(Employee e: arr) {
			e.print();
		}
		
	}

}
