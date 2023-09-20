package labmanual;
/*1.Write a Java program to do arithmetic operation on two numbers. Input numbers as
Command line argument.
*/
public class DemoCommmandLine {
    public static void main(String[] args) {
        int x =Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;
        System.out.println("ans of the sum is :"+ sum);
    }
}
