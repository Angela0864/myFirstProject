package lesson17;

public class Main {
    public static void main(String[] args) {
        Thread.currentThread().setName("Главный");

        Thread2 thread2 = new Thread2();
        thread2.setName("Вася");
        thread2.start();
        //thread2.setDaemon(true);

        Thread thread3 = new Thread(new Thread3());
        thread3.setName("Петя");
        thread3.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ----- " + Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
