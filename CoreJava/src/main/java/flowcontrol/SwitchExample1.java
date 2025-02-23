package flowcontrol;

public class SwitchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 10;
		final int y=20;
		switch(x) {
		
		case 10 : System.out.println("case 10 is printed");
		case y : System.out.println("case 20 is printed");
		}
	}
	
	//output
	//case 10 is printed
	//case 20 is printed

}
