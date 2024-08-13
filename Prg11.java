/*
 * Remove Duplicates from an ArrayList Write a Java program to remove duplicates from an ArrayList.
 *  You need to implement a function that takes
an ArrayList as input and returns an ArrayList with duplicates removed.
 */
import java.util.*;
class Main11
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(4);
        a.add(4);
        a.add(24);
        a.add(12);
        a.add(10);
        a.add(45);
        System.out.println(a);
        Main11 m=new Main11();
        ArrayList<Integer> d=m.removeDuplicate(a);
        System.out.println("Array List after removing duplicate is "+d);
    }
    ArrayList<Integer> removeDuplicate(ArrayList<Integer> al)
    {
        System.out.println("Array list is "+al);
        ArrayList<Integer> newal=new ArrayList<>();
        for(int i=0;i<al.size();i++)
        {
            if(newal.contains(al.get(i)))
            {
                continue;
            }
            newal.add(al.get(i));
        }
        return newal;
    }
}