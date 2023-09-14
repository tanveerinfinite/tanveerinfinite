import java.util.*;
class NumberGame
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        double a=Math.random();
        int n=(int)Math.round(a*100);
        int in;
        int cnt=0;
        System.out.println("WELCOME TO NUMBER GUESSING GAME!");
        for(int i=1;i<=5;i++)
        {
            System.out.print("Guess A Number=");
            in=sc.nextInt();
            if(in==n)
            {
                System.out.println("YOU WON !");
                cnt=1;
                break;
            }
            else if(in>n)
            {
                System.out.println("NUMBER IS LESSER");
            }
            else
            {
                System.out.println("NUMBER IS GREATER");
            }

        }
        if (cnt != 1)
        {
            System.out.println("YOU LOSE !");
            System.out.println("THE NUMBER IS " + n);
        }



    }
}
