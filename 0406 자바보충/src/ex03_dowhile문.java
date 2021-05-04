import java.util.Random;

public class ex03_dowhile¹® {
	public static void main(String[] args) {
		 Random rd = new Random();
		 int rd_num1 =0;
		 int rd_num2 =0;
		 do {
	    rd_num1 = rd.nextInt(6)+1;
    	rd_num2 = rd.nextInt(6)+1;
    	System.out.printf("(%d,%d)%n",rd_num1,rd_num2); 
			 
		 }while(rd_num1 + rd_num2 !=5);
	
	
	
	
	
	
	
	}

}
