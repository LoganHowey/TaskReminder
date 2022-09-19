package util;

import com.sun.source.util.TaskEvent;

import java.util.Timer;
import java.util.TimerTask;

public class TaskReminder {

    public void Reminder(int seconds) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int interval = 0;

            @Override
            public void run() {
                if (interval == 0) {
                    System.out.println("Timer Starting");
                    interval++;
                } else if (interval == seconds) {
                    System.out.println("Timer Ending");
                    timer.cancel();
                } else {
                    interval++;
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }

    public static void main(String[] args) {
        TaskReminder taskReminder = new TaskReminder();
        taskReminder.Reminder(10);
        // I hope this is fine. I didn't quite understand how to implement the UML in this case.
    }
}
