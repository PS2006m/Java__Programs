/*
 * The Transport interface declares a deliver() method. The abstract class Animal is the superclass
 *  of the Tiger, Camel, Deer and Donkey classes.
The Transport interface is implemented by the Camel and Donkey classes. Write a test program that initialize 
an array of four Animal objects. If
the object implements the Transport interface, the deliver() method is invoked.
 */
interface Transport
{
    void deliver();
}
abstract class Animal
{
    void Type()
    {
        System.out.println("Parent class Type");
    }
}
class Tiger extends Animal 
{
    String type="Tiger";
    void Type()
    {
        System.out.println("Animal is "+this.type);
    }
}
class Camel extends Animal implements Transport
{
    String type="Camel";
    void Type()
    {
        System.out.println("Animal is "+this.type);
    }
    public void deliver()
    {
        System.out.println("Camel Transports ");
    }
}
class Deer extends Animal 
{
    String type="Deer";
    void Type()
    {
        System.out.println("Animal is "+this.type);
    }
}
class Donkey extends Animal implements Transport
{
    String type="Donkey";
    void Type()
    {
        System.out.println("Animal is "+this.type);
    }
    public void deliver()
    {
        System.out.println("Donkey Transports ");
    }
}
class Main2
{
    public static void main(String[] args)
    {
        Animal a[]=new Animal[4];
        a[0]=new Tiger();
        a[1]=new Camel();
        a[2]=new Deer();
        a[3]=new Donkey();
        for(int i=0;i<4;i++)
        {
            a[i].Type();
            if(a[i] instanceof Transport)
            {
                ((Transport)a[i]).deliver();
            }
        }
    }
}