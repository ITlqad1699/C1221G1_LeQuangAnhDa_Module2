package ss19_regex_and_string.excercise;
import java.util.Scanner;

public class ClassName {
    private static final String CLASS_NAME = "^[ACP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class name: ");
        String className = scanner.nextLine();
        boolean test =className.matches(CLASS_NAME);
        if(test){
            System.out.println("Class Name Is Correct");
        } else {
            System.out.println("Class Name Isn't Correct");
        }
    }
}
