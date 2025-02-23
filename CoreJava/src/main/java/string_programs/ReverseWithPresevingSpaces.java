package string_programs;

import java.util.Scanner;

public class ReverseWithPresevingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		String s1 = new String() ;
		String s3 = str.replaceAll(" ", "");
		
		
		
		for(int i=s3.length()-1,j=0;i>=0 && j<str.length();i--,j++)
		{
			Character c = str.charAt(j);
			if(c.equals(' '))
				s1=s1+" "+s3.charAt(i);
			else
				s1 = s1+s3.charAt(i);
            
				
			
		}
		System.out.println("Reversed string with preserving blank spaces: "+s1);
		

	}

}
