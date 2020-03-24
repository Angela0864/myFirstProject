package lesson17;

public class Thread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1000; i < 1020; i++) {
            System.out.println(i + " ----- " + Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
