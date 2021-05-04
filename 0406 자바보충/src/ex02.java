import java.util.Random;

public class ex02 {
	public static void main(String[] args) {
     Random rd = new Random();
     while (true) {
    	 int rd_num1 = rd.nextInt(6)+1;
    	 int rd_num2 = rd.nextInt(6)+1;
    	System.out.printf("(%d,%d)%n",rd_num1,rd_num2);   // %n 개행문자가능
    	
    	 if (rd_num1 + rd_num2 ==5) {
    		 break;
    	 }
    	 
    	 
    	 
    	 
     }
	
	
	
	
	
	
	
	}

}
