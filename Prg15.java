/*
 * Write a program that simulates a queue of customers at a coffee shop using an ArrayDeque. The program should allow the user to perform the
following actions: Add a new customer to the back of the queue: Serve the next customer in the queue (i.e. remove the customer from the front of
the queue) View the current queue of customers. The program should continue to prompt the user for actions until they choose to quit.
 */
import java.util.*;
class Main15
{
    public static void main(String[] args)
    {
        ArrayDeque<String> ad=new ArrayDeque<>();
        int count=0;
        int choice=0;
        Scanner sc=new Scanner(System.in);
        do 
        {
            System.out.println("1.Add customer");
            System.out.println("2.Server next customer");
            System.out.println("3.View Queue");
            System.out.println("4.Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    count++;
                    ad.add("Customer "+count);
                    System.out.println("Customer "+count+" added");
                    break;
                case 2:
                    String e=ad.remove();
                    System.out.println(e+" removed");
                    break;
                case 3: 
                    System.out.println(ad);
                    break;
                case 4: 
                    System.out.println("You have exited");
                    break;
                default:
                    System.out.println("Enter between 1 and 4");
                    break;
            }
        }while(choice!=4);
    }
}