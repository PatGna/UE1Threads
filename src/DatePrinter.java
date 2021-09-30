import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {

    public int n;

    public DatePrinter(int n) {
        this.n = n;
    }

    @Override
    public void run() {
             for (int i = 0; i < n; i++) {
                 SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                 Date date = new Date();
                 System.out.println(dtf.format(date));
             }

        }

}
