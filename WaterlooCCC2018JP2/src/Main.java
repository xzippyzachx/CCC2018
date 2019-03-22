import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{
		
		int spaces = 0;
		int same = 0;
		
		String yesterday = "";
		String today = "";
		
		Scanner scr = new Scanner(System.in);
		spaces = scr.nextInt();	
		
		scr.nextLine();
		
		yesterday = scr.nextLine();			
		today = scr.nextLine();
				
		for(int space = 1; space <= spaces; space++)
		{
			if(yesterday.substring(space-1,space).equals(today.substring(space-1,space)) && yesterday.substring(space-1,space).equals("C"))		
			{
				same++;
			}
		}
		
		System.out.println(same);
	}
	
}
