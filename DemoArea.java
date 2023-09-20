package labmanual;
/*5.Create a Shape class as the abstract class with abstract method draw( ), its
Implementation is provided by the Rectangle &amp; Circle classes. Create a reference of
Shape class and if you create the instance of Rectangle class, draw() method of
Rectangle class will be invoked. And same for Circle class. (Dynamic Method
Dispatch)
*/

abstract class Shape{
    double w = 3,l=4,r= 4 ,b,d ;
    void drow(double w , double l){}
    void drow(double r){}
}
class Rectangle extends Shape{
    public void drow(double w, double l){
        d = w*l;
        System.out.println("this is ans" + d);
    }
}

class Crcle extends Shape{
    void drow(double r){
        b= 3.14*r*r ;
        System.out.println("this is ans :" + b);
    }
}
public class DemoArea {
    public static void main(String[] args) {
        Shape c = new  Crcle();
        Shape a = new Rectangle();
        a.drow(3,4);
        c.drow(3);
    }
}