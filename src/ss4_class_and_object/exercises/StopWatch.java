package ss4_class_and_object.exercises;
import java.util.Scanner;
public class StopWatch {
    public static void main(String[] args) {

    }
    //Datas Field:
    String starTime;
    String endTime;
    //Constructor:
    StopWatch( String starTime, String endTime){
        this.starTime = starTime;
        this.endTime = endTime;
    }
    //Getter:
    String getStarTime(){
        return this.starTime;
    }
    String getEndTime(){
        return this.endTime;
    }
}
