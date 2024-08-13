/*
 * write a program to enter the five subject marks out of 100 of student. 
 * If any subject marks is less than 35 then program will generate exception
 */
import java.util.*;
class Main6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        int count=1;
        try
        {
            for(int i=0;i<a.length;i++)
            {
                System.out.println("Enter mark of subject "+count);
                a[i]=sc.nextInt();
                while(true)
                {
                    if(a[i]<=100)
                    {
                        break;
                    }
                    else 
                    {
                        System.out.println("Enter marks less than 100");
                        a[i]=sc.nextInt();
                    }
                }
                if(a[i]<35)
                {
                    throw new Exception("Marks of Subject "+count+" are less than 35");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}