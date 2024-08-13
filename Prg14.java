/*
 * Write a program that reads in a list of words from the user and stores them in a HashSet. 
 * The program should then prompt the user for a prefix and 
output all the words in the set that start with that prefix.
 */
import java.util.*;
class Main14
{
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<String>();
        System.out.println("Enter how many words u wanna add");
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        for(int i=1;i<=length;i++)
        {
            System.out.println("Enter word "+i);
            String word=sc.next();
            hs.add(word);
        }
        System.out.println(hs);
        System.out.println("Enter a prefix");
        String c=sc.next();
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext())
        {
            String w=itr.next();
            if(w.startsWith(c))
            {
                System.out.print(w+" ");
            }
        }
    }
}