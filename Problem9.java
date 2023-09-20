package labmanual;
class T extends Thread {
    String s1 = "vv";
    String s2 = "pp";
    Thread t1 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s1) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                synchronized (s2) {
                    System.out.println(s1 + s2);
                }
            }
        }
    };
    Thread t2 = new Thread() {
        public void run() {
            while (true) {
                synchronized (s2) {
                    synchronized (s1) {
                        System.out.println(s1 + s2);
                    }
                }
            }
        }
    };
}
public class Problem9 {
    public static void main(String[] args) {
        T obj = new T();
        obj.t1.start();
        obj.t2.start();
    }
}