import java.util.Scanner;

public class Main {

	public static void main (String[] args)
	{										
		Scanner scr = new Scanner(System.in);
		int flowers = scr.nextInt();
		
		scr.nextLine();
		
		int[][] heights = new int[flowers][flowers];
		
		for(int f = 1; f <= flowers; f++)
		{
			String Input = scr.nextLine();	
			String[] heightString = Input.split(" ");
			
			for(int h = 0; h < heightString.length; h++)
			{
				heights[f-1][h] = Integer.parseInt(heightString[h]);
			}
		}
		
		while(true)
		{
			int[][] newHeights = new int[flowers][flowers];
			
			if(checkArray(heights,flowers))
			{
				PrintArray(heights,flowers);
				return;
			}
			
			newHeights = RotateArray(heights,flowers,1);		
			if (checkArray(newHeights,flowers))
			{
				PrintArray(newHeights,flowers);
				return;
			}
			newHeights = RotateArray(newHeights,flowers,1);			
			if (checkArray(newHeights,flowers))
			{
				PrintArray(newHeights,flowers);
				return;
			}
			newHeights = RotateArray(newHeights,flowers,1);			
			if (checkArray(newHeights,flowers))
			{
				PrintArray(newHeights,flowers);
				return;
			}
			
		}		
	}
	
	public static boolean checkArray(int[][] _heights, int _flowers)
	{
		for(int f = 0; f < _flowers-1; f++)
		{
			if(_heights[0][f] > _heights[0][f+1])
				return false;
			if(_heights[f][0] > _heights[f+1][0])
				return false;
		}
		
		return true;
	}
	
	public static int[][] RotateArray(int[][] _heights, int _flowers, int _rotates)
	{
		int[][] newHeights = new int[_flowers][_flowers];
		
		for(int r = 1; r <= _rotates; r++)
		{
			for(int f = 0; f < _flowers; f++)
			{			
				for(int h = 0; h < _flowers; h++)
				{
					newHeights[f][h] = _heights[_flowers - h - 1][f];
				}
			}			
		}		
		
		return newHeights;
	}
	
	public static void PrintArray(int[][] _heights, int _flowers)
	{
		
		for(int f = 0; f < _flowers; f++)
		{			
			for(int h = 0; h < _flowers; h++)
			{
				System.out.print(_heights[f][h]);
				if(h < _flowers-1)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.println("");
				}
			}
			
		}
		
	}
	
	
	
}
