package lesson17.practika;

public class Pevets1 extends Thread {
    private Boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop) {
            for (int i = 0; i < 3; i++) {
                System.out.println("LA --------------");
                try {
                    Thread.sleep (1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MIKROFON) {
                Monitors.MIKROFON.notify();
            }

            synchronized (Monitors.MIKROFON) {
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count > 2)
                needStop = true;
        }
    }
}
