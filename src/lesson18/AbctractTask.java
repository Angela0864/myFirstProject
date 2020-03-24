package lesson18;

public abstract class AbctractTask implements Task {
    private int count = 0;


    @Override
    public int getTryCount() {
        return count;
    }

    @Override
    public void incTryCount() {
        count++;

    }
}
