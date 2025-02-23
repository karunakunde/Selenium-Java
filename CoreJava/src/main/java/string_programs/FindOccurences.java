package string_programs;

import java.util.Scanner;

public class FindOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any sentences..");
		String statement = s.nextLine();
		System.out.println("Enter word to search...");
		String wrd = s.nextLine();
		int index = statement.indexOf(wrd);
		int cnt = 0;
		while(!(index ==-1))
		{
			cnt++;
			statement = statement.substring(index+1);
			index =statement.indexOf(wrd);
			
		}
		
		System.out.println("count:"+cnt);


	}

}
