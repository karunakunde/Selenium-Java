package oops_concept;

public class ChildClass extends ParentClass {
	
	int a =0;
	   {System.out.println("value of var"+parentVariable);}

   public void print()
   {System.out.println("value of parent var"+parentVariable);}
	
 public static void main(String[] args) {
	
	 ChildClass c = new ChildClass();
	 c.print();
}
}
