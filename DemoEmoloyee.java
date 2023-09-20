/*3.Write application that declares a class named Employee. It should have instance
variables age, name &amp; salary. These should be of type int, String, float respectively.
Create the object of Employee class and set and display its instance variable.
*/
package labmanual;
import java.util.Scanner;

class Demo{
    public void Get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the ditails of employee:");
    }
    public void Display(){
        Scanner sc = new Scanner(System.in);
        int age ;
        String name ;
        double salary ;
        name =  sc.nextLine();
//        System.out.println();
        age = sc.nextInt();
        salary = sc.nextDouble();
        System.out.println(" my name is : " +name+ " my age is : " +age+ " my salary is : " +salary);
    }
}
public class DemoEmoloyee {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.Get();
        d.Display();
    }
}