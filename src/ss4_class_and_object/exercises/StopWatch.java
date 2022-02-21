package ss4_class_and_object.exercises;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    // start method:
    public void start() {
        this.startTime = new Date();
    }

    // stop method:
    public void stop() {
        this.endTime = new Date();
    }

    // method return countable time:
    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    // create an array by Math.random:
    public static int[] randomArray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int numberOfElement = in.nextInt();

        int[] arr = new int[numberOfElement];
        for (int i = 0; i < numberOfElement; i++) {
            arr[i] = (int) (Math.random() * 10000);
        }
        return arr;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        // begin:
        stopWatch.start();
        int[] arr = randomArray();
        // end:
        stopWatch.stop();

        System.out.println("The time for process: " + stopWatch.getElapsedTime() + "ms");
    }
}