public class StartRunnable {
    public static void main(String [] args) {
        ChildRunnable1 r = new ChildRunnable1();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main thread");
        }
    }
}
