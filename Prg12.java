/*
 * Implement a Phone Book. Write a Java program to implement a phone book using an ArrayList 
 * and a LinkedList. The phone book should allow
users to add, delete, and search for contacts by name or phone number to solve this problem,
 you can create a Contact class that stores the name
and phone number of each contact. You can then use an ArrayList to store the contacts and 
a LinkedList to store the indices of the contacts sorted
by name
 */
//---------------------------------------------------------------------------------------//
//I accidentally swapped the purpose of arraylist and linkedlist according to question .
import java.util.*;
class Main12
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add User");
        System.out.println("2.Remove User");
        System.out.println("3.Search User");
        System.out.println("Enter a choice");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter name");
                String name=sc.next();
                System.out.println("Enter number");
                long number=sc.nextLong();
                Contact c=new Contact(name, number);
                c.addUser();
                break;
            case 2:
                System.out.println("Enter 'y' for name or 'n' for number");
                String w=sc.next();
                if(w.equals("y"))
                {
                    System.out.println("Enter name");
                    String name1=sc.next();
                    Contact c1=new Contact();
                    c1.removeUser(name1);
                }
                else 
                {
                    System.out.println("Enter number");
                    long number1=sc.nextLong();
                    Contact c2=new Contact();
                    c2.removeUser(number1);
                }
                break;
            case 3:
            System.out.println("Enter 'y' for name or 'n' for number");
            String w2=sc.next();
            if(w2.equals("y"))
            {
                System.out.println("Enter name");
                String name1=sc.next();
                Contact c1=new Contact();
                c1.searchUser(name1);
            }
            else 
            {
                System.out.println("Enter number");
                long number1=sc.nextLong();
                Contact c2=new Contact();
                c2.searchUser(number1);
            }
            break;
            default:
                break;
        }
    }
}
class Contact
{
    static ArrayList a=new ArrayList<>();
    static LinkedList<Contact> l=new LinkedList<>();
    static int index=0;
    int place=0;
    String name;long number;
    Contact()
    {

    }
    Contact(String name,long number)
    {
        this.index++;
        this.place=index;
        this.name=name;
        this.number=number;
    }
    void addUser()
    {
        a.add(this.index);
        l.add(this);
        System.out.println("Contact added succesfully");
    }
    void removeUser(String name)
    {
        Iterator<Contact> itr=l.iterator();
        while(itr.hasNext())
        {
            Contact c=itr.next();
            if(c.name.equals(name))
            {
                int r=l.indexOf(c);
                l.remove(c);
                a.remove(r);
                System.out.println("Contact removed succesfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    void removeUser(long number)
    {
        Iterator<Contact> itr=l.iterator();
        while(itr.hasNext())
        {
            Contact c=itr.next();
            if(c.number==number)
            {
                int r=l.indexOf(c);
                l.remove(c);
                a.remove(r);
                System.out.println("Contact removed succesfully");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    void searchUser(long number)
    {
        Iterator<Contact> itr=l.iterator();
        while(itr.hasNext())
        {
            Contact c=itr.next();
            if(c.number==number)
            {
                System.out.println("User name is "+c.name);
                return;
            }
        }
        System.out.println("Contact not found");
    }
    void searchUser(String name)
    {
        Iterator<Contact> itr=l.iterator();
        while(itr.hasNext())
        {
            Contact c=itr.next();
            if(c.name.equals(name))
            {
                System.out.println("Contact number is "+c.number);
                return;
            }
        }
        System.out.println("Contact not found");
    }
}