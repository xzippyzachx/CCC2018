import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{										
		Scanner scr = new Scanner(System.in);
		String disInput = scr.nextLine();		
		
		String[] disString = disInput.split(" ");
		
		int dis1 = Integer.parseInt(disString[0]);
		int dis2 = Integer.parseInt(disString[1]);
		int dis3 = Integer.parseInt(disString[2]);
		int dis4 = Integer.parseInt(disString[3]);
		
		System.out.println("0 " + dis1 + " " + (dis1 + dis2) + " " + (dis1 + dis2 + dis3) + " " + (dis1 + dis2 + dis3 + dis4));		
		System.out.println(dis1 + " 0 " + dis2 + " " + (dis2 + dis3) + " " + (dis2 + dis3 + dis4));	
		System.out.println((dis1 + dis2) + " " + dis2 + " 0 " + dis3 + " " + (dis3 + dis4));	
		System.out.println((dis1 + dis2 + dis3) + " " + (dis2 + dis3) + " " + dis3 + " 0 " + (dis4));
		System.out.println((dis1 + dis2 + dis3 + dis4) + " " + (dis2 + dis3 + dis4) + " " +  (dis3 + dis4)  + " " + dis4 + " 0");	
	}
	
}
