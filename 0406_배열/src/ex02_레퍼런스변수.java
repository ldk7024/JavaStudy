
public class ex02_���۷������� {
	public static void main(String[] args) {
   // ���۷��� ������ �ּ� ���� ����(����)
	int[] intArray1 = new int[5];
   int[] intArray2 = intArray1;
   
   intArray1[1] = 3;
   System.out.println("intArray1�� 1��° ��:" + intArray1[1]);
   System.out.println("intArray2�� 1��° ��:" + intArray2[1]);
   intArray2[0] =15;
   System.out.println("intArray2�� 0��° ��:" + intArray2[0]);
   System.out.println("intArray1�� 0��° ��:" + intArray1[0]);
 
   //���� �ּҸ� ������ �ִ��� Ȯ��
   System.out.println(intArray1);
   System.out.println(intArray2);  //���� �ּ� ���� ������ �ִ�. -
   
   
   // �⺻ ������ Ÿ�� ������ ���� ����(����)
   int num = 3;
   int temp = num;
   
   num =7;
   System.out.println(temp);
   
   temp = 8;
   System.out.println(num);  //���� �����߱� ������ ���� �ٲ��� �ʴ´�.
   
   // �迭�� ũ�� (����) Ȯ��
   System.out.println(intArray1.length);

   
 
	
	
	
	
	
	
	
	
	
	
	}

}
