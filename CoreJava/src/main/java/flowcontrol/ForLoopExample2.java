package flowcontrol;

public class ForLoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=0;
		for(System.out.println("initilization");i<3;System.out.println("increment section"),i++,i=1)
		{
			if(i==0)
				System.out.println("value  of i is 0");
			if(i==1)
				System.out.println("value  of i is 1");
             j++;
			if(j==100)
				break;
		}
	}

}
