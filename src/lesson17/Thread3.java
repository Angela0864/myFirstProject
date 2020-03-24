package lesson17;

public class Thread3 implements Runnable {

    @Override
    public void run() {
        for (int i = 1000000; i < 1000030; i++) {
            System.out.println(i + " ----- " + Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
