
public class AddressMain {

	public static void main(String[] args) {
		Address ar = new Address();
		// �Ӽ��� ����
		ar.name = "�̴뱳";
		ar.phonenumber= "010-3369-6611";
        ar.address = "����";     		
		
		
		
		
		
		
		ar.showAddr();
		
		Address ar2 = new Address();
		ar2.name = "�̸���";
		ar2.phonenumber= "010-1111-1111";
        ar2.address = "�ǿ�";  
        ar2.showAddr();
		
        Address ar3 = ar2;
        ar3.name = "����ȯ";
        System.out.println(ar2.name);

	}

}
