package util;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Practice {

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if (counter > 0){
                    System.out.println(counter +" seconds");
                    counter--;
                }
                else {
                    System.out.println("Timer is over");
                    timer.cancel();
                }
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2022);
        date.set(Calendar.MONTH, Calendar.SEPTEMBER);
        date.set(Calendar.DAY_OF_MONTH, 19);
        date.set(Calendar.HOUR_OF_DAY, 13);
        date.set(Calendar.MINUTE, 43);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
