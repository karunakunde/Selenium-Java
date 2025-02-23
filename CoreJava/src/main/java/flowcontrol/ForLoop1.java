package flowcontrol;

public class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++)
		{
			System.out.println("For loop executed. value of i is "+ i);
		}
		
		////infinite loop
		for(int i=0;;)
		{
			System.out.println("For loop executed. value of i is "+ i);
			if(i==100)
				break;
		}
		
	
	}

}
