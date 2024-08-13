/*
 * The abstract Vegetable class has three subclasses named Potato, Brinjal and Tomato. Write an application that demonstrates how to establish this
class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Create and display instances of these objects.
Override the toString() method of Object to return a string with the name of the vegetable and its color
 */
import java.util.*;
abstract class Vegetable
{
    String color;
}
class Potato extends Vegetable
{
    String color="Yellow";
    public String toString()
    {
        return "Color of Potato is "+this.color;
    }
}
class Brinjal extends Vegetable
{
    String color="Purple";
    public String toString()
    {
        return "Color of Brinjal is "+this.color;
    }
}
class Tomato extends Vegetable
{
    String color="Red";
    public String toString()
    {
        return "Color of Tomato is "+this.color;
    }
}
class Main1
{
    public static void main(String[] args) {
        Potato p=new Potato();
        System.out.println(p);
        Brinjal b=new Brinjal();
        System.out.println(b);
        Tomato t=new Tomato();
        System.out.println(t);
    }
}