public class MyThread extends Thread {


     public MyThread (String name) {
         super(name);
     }

    @Override
    public void run() {
        System.out.println("Hi, im thread " +  getName());
    }
}
