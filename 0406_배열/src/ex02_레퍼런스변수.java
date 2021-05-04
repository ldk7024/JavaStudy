
public class ex02_레퍼런스변수 {
	public static void main(String[] args) {
   // 레퍼런스 변수는 주소 값을 복사(대입)
	int[] intArray1 = new int[5];
   int[] intArray2 = intArray1;
   
   intArray1[1] = 3;
   System.out.println("intArray1의 1번째 값:" + intArray1[1]);
   System.out.println("intArray2의 1번째 값:" + intArray2[1]);
   intArray2[0] =15;
   System.out.println("intArray2의 0번째 값:" + intArray2[0]);
   System.out.println("intArray1의 0번째 값:" + intArray1[0]);
 
   //같은 주소를 가지고 있는지 확인
   System.out.println(intArray1);
   System.out.println(intArray2);  //같은 주소 값을 가지고 있다. -
   
   
   // 기본 대이터 타입 변수는 값을 복사(대입)
   int num = 3;
   int temp = num;
   
   num =7;
   System.out.println(temp);
   
   temp = 8;
   System.out.println(num);  //값을 복사했기 때문에 값이 바뀌지 않는다.
   
   // 배열의 크기 (길이) 확인
   System.out.println(intArray1.length);

   
 
	
	
	
	
	
	
	
	
	
	
	}

}
