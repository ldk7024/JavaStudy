
public class ex03_���۷�������_�ǽ����� {
	public static void main(String[] args) {

	   // ������ ������ �������� ���� �� �ִ� ���۷��� ���� array�� ����
		int[] array; 
	   
		// ������ ������ 5���� ���� �� �ִ� �迭�� �����ؼ� array�� ����
		array = new int[5];   // 0���� �ʱ�ȭ �Ǿ� ����
		
		// ������ �ε����� 1~20������ ���� ����
		array[0] = 15;
	    array[1] = 10;
	    array[2] = 2;
	    array[3] = 7;
	    array[4] = 18;
	
	    // �迭 array�� ����ִ� ��� �����͸� ���
	    for (int i = 0; i<array.length ; i++)
	    System.out.println(array[i]);
	    
	    System.out.println();
	    
	    // 1��° ���� 4��° �� ���ؼ� ����ϱ�
	    System.out.println(array[1] + array[4]);
	    
	    int sum =0;
	    for (int i=0 ; i<array.length ; i++ )
	    {sum+=array[i];}
	    System.out.println("�հ�:" + sum);
	    
	
	    // ��� �� ���
       System.out.println("���:" +(float)sum/array.length);
	
	}
	   

}
