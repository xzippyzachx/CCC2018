import java.util.Scanner;

public class Main{

    public static void main (String[] args)
    {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        String action = "answer";

        Scanner scr = new Scanner(System.in);
        num1 = scr.nextInt();
        num2 = scr.nextInt();
        num3 = scr.nextInt();
        num4 = scr.nextInt();

        scr.close();

        if((num1 == 8 || num1 == 9)&&(num4 ==8 || num4 == 9))
        {
            if(num2 == num3)
                action = "ignore";
        }

        System.out.println(action);
    }

}