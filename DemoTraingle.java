package labmanual;
/*4.Write a Java program which creates the Triangle class with two attributes base and
height of type float or double. Takes the two constructors of the Triangle class.
First constructor takes the default value for base and height and Second Constructor
takes base and height as a parameter. Create a method calcArea() to calculate the
area of the Triangle. Define a main method and create objects to the class and print
the area of the Triangle.
*/
class traingle {
    traingle() {
        double b;
        double h;
        System.out.println("this is ans of area of traingle: ");
    }
    double calArea(double b, double h) {
//        System.out.println("b and h");
        return (b * h) / 2;
    }
}
public class DemoTraingle {
    public static void main(String[] args) {
        traingle t = new traingle();
        double d =  t.calArea(3,3);
        System.out.println(d);
//        System.out.println("Area of the triangle: " + area(h, b));
    }
}