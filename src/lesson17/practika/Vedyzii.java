package lesson17.practika;

public class Vedyzii {
    public static void main(String[] args) {
        System.out.println("Концерт начат!!!");
        Pevets1 pevets1 = new Pevets1();
        Pevets2 pevets2 = new Pevets2();
        pevets2.setDaemon(true);

        pevets1.start();
        pevets2.start();

        while(pevets1.isAlive()) {

        }

        System.out.println("Концерт окончен!!!");
    }
}
