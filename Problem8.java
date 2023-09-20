package labmanual;
public class Problem8 {
    public static void main(String[] args) {
        Marvel marvel = new Marvel();
        Producer p = new Producer(marvel);
        Consumer c = new Consumer(marvel);
        p.start();
        c.start();
    }
    static class Marvel extends Thread {
        boolean flag = true;
        int count = 0;
        public synchronized void produce() {
            try {
                while (true) {
                    if (flag) {
                        count++;
                        System.out.println("Producer count: " + count);
                        notify();
                        wait();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public synchronized void consume() {
            try {
                while (true) {
                    if (flag) {
                        System.out.println("Consumer count: " + count);
                        notify();
                        wait();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    static class Producer extends Thread {
        Marvel marvel;
        Producer(Marvel marvel) {
            this.marvel = marvel;
        }
        @Override
        public void run() {
            marvel.produce();
        }
    }
    static class Consumer extends Thread {
        Marvel marvel;
        Consumer(Marvel marvel) {
            this.marvel = marvel;
        }
        @Override
        public void run() {
            marvel.consume();
        }
    }
}