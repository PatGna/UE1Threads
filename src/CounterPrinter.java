public class CounterPrinter implements Runnable{

    public int n;

    public CounterPrinter(int n) {
        this.n = n;
    }


    @Override
    public void run() {

        for (int i = 0; i < n; i++) {
            System.out.println(i);

        }

    }
}
