
public class Personmain {

	public static void main(String[] args) {
		person p1 = new person("�̴뱳",26);
        person p2 = new person("�̸���",26);
	    person p3 = new person ("��ȣ��", 26);
	    person p4 = new person ("����ȯ", 30);
	    person p5 = new person ("��¿�", 25);
	    
	    person[]personArr = new person[5];
	    personArr[0] = p1;
	    personArr[1] = p2;
	    personArr[2] = p3;
	    personArr[3] = p4;
	    personArr[4] = p5;
	    	
	    for(int i=0; i<personArr.length ; i++ ) {
	    	System.out.println(personArr[i].getName());
	    }
	    
	    
	    
	    int []arr = new int[3];
	    arr[0] = 10;
	    arr[1] = 20;
	    arr[2] = 30;
	        
	
	
	}
      
}
