public class Main {

    public static void main(String[] args){

        DatePrinter dp1 = new DatePrinter(2000000);
        Thread th1 = new Thread(dp1);

        CounterPrinter cp1 = new CounterPrinter(2000000);
        Thread th2 = new Thread(cp1);

        th1.start();
        th2.start();
    }
}
