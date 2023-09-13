import java.util.*;
public class StudentGradeCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        int sum=0;
        System.out.println("Enter 6 Subjects marks obtained out of 100=");
        for(int i=0;i<6;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<6;i++)
        {
            sum=sum+a[i];
        }
        int avg=sum/6;
        System.out.println("SUM = " + sum + "\nAVARAGE = " +avg);
        if(avg <= 40)
        {
            System.out.println("FAIL");
        }
        else if( avg <61 && avg >=41 )
        {
            System.out.println("C GRADE");

        }
        else if( avg >= 61 && avg <= 80)
        {
            System.out.println("B GRADE");
        } else if (avg >=81 && avg <=100)
        {
            System.out.println("A GRADE");

        }

    }
}
