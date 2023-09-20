package labmanual;
/*7.Write a JAVA program that creates threads by extending Thread class .First thread
Display “Good Morning “every 1 sec, the second thread displays “Hello “every 2
Seconds and the third display “Welcome” every 3 seconds, (implementing using Runnable).
*/
class MyThread1 implements Runnable{
    public void run(){
        while (true){

        try {
            Thread.sleep(1000);
            System.out.println("good morning");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        while (true){

        try {
            Thread.sleep(2000);
            System.out.println("hello");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      }
    }
}
 class MyThread3 implements Runnable{
    public void run(){
        while (true){

        try {
            Thread.sleep(3000);
            System.out.println("Welcome");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }
}
public class Problem7 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1();
        Thread t1 = new Thread(mt1);
        MyThread2 mt2 = new MyThread2();
        Thread t2 = new Thread(mt2);
        MyThread3 mt3 = new MyThread3();
        Thread t3 = new Thread(mt3);

        t1.start();
        t2.start();
        t3.start();
    }
}