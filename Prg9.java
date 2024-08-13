/*
 * I have an Induction machine manufacturing company. My Manager wants to analyse some data of the induction machines of our manufacturing
unit. What I have: List of machine's price.
 Note: each price is in Double. Write a java program that contains list of various machine's price. & do the following tasks. 
Task 1 - Create a list of 5 machine's price. [10000.0,55000.0,80000.0,25000.0,55000.0]
Task 2 - Find the maximum price from the list. Task 3 - sort the list.
 */
import java.util.*;
class Main9 
{
    public static void main(String[] args)
    {
        ArrayList<Double> a=new ArrayList<Double>();
        a.add(10000.0);
        a.add(55000.0);
        a.add(80000.0);
        a.add(25000.0);
        a.add(55000.0);
        Collections.sort(a);
        Collections.reverse(a);
        System.out.println("Max is "+a.get(0));
        Collections.sort(a);
        System.out.println("Sorted List is "+a);
    }
}