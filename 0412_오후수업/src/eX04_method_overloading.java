
public class eX04_method_overloading {

	public static void main(String[] args) {
		// �� ���� ������ �Է¹޾� �� ���� ���� �����ϴ� addinteger()�޼ҵ� �����
        System.out.println(add(10,20));
        // �� ���� �Ǽ��� �Է¹޾� �� ���� ���� �����ϴ� adddouble()�޼ҵ� �����
	    System.out.println();
	    System.out.println(add(10.3,20.9));
	    // �� ���� ����, �Ѱ��� �Ǽ��� �Է¹޾� �� ���� ���� �����ϴ� addintanddouble()�޼ҵ� �����
	    System.out.println(add(10.3, 10));
	    // �� ���� ������ �Է¹޾� ���� ����ϴ� add3integers()�޼ҵ� �����
	    System.out.println(add(1,2,3));
	    
	    // �޼ҵ� �����ε��̶� �޼ҵ��� �̸��� �ϳ��� �ְ� �Ű������� �ٸ��� �����ν� �޼ҵ带 ���� �� ����� ���
	    // �޼ҵ� �����ε��� ����: �޼ҵ� �̸��� ���ƾ���, �Ű����� ���� �Ǵ� Ÿ���� �޶����, �Ű������� ���� ����Ÿ���� �ٸ� ���� �����ε��� �ƴ�
	    
	    
	} 
	public static int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
   public static int add(int n1, int n2) {
	   return n1+n2;
   }
   public static double add (double n1, double n2) {
	   return n1+n2;
   }
   public static double add(double n1, int n2) {
	   return n1+n2;
   }
}
