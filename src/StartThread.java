public class StartThread {
    public static void main(String [] args){

        ChildThread1 t1 = new ChildThread1();

        System.out.println(t1.getName());

        ChildThread2 t2 = new ChildThread2();

        t2.start();

        System.out.println(t2.getName());

        System.out.println("Main method, Thread-"+Thread.currentThread().getName());

        System.out.println(10/0);
    }
}
