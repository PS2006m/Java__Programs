/*
 * Write a complete program to accept N integer numbers from the command line. Raise and handle exceptions for following cases : - when a
number is –ve 
- when a number is evenly divisible by 10
- when a number is greater than 1000 and less than 2000
- when a number is greater than 7000 
Skip the number if an exception is raised for it, otherwise add it to find total sum
 */
import java.util.*;
class Main5 
{
    public static void main(String[] args)
    {
        int n=args.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
        try 
        {
            int a=Integer.parseInt(args[i]);
            if(a<0)
            {
                throw new Exception();
            }
            else if(a%10==0)
            {
                throw new Exception();
            }
            else if(a>1000&&a<2000)
            {
                throw new Exception();
            }
            else if(a>7000)
            {
                throw new Exception();
            }
            else 
            {
                sum=sum+a;
            }
        }
        catch(Exception e)
        {
            
        }
    }
    System.out.println(sum);
    }
}