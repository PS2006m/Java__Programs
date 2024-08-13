/*
 * Create an interface named Polygon. It has a default method getSides() 
 * and an abstract method getArea().create two classes Rectangle and Square
that implement Polygon. The Rectangle class provides the implementation
 of the getArea() method and overrides the getSides() method. the
Square class only provides the implementation of the getArea() method. 
while calling the getSides() method using the Rectangle object, the
overridden method is called. However, in the case of the Square object, the default method is called.
 */
interface Polygon
{
    double height=0,widht=0;
    default double getSides()
    {
        return height+widht;
    }
    double getArea();
}
class Rectangle implements Polygon
{
    double height,width,area;
    public double getArea()
    {
        area=height*widht;
        return area;
    }
    public double getSides()
    {
        return height+width;
    }
}