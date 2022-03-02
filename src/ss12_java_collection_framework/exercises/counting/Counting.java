package ss12_java_collection_framework.exercises.counting;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter String: ");
        String newStr = scanner.nextLine();
        Map<Character, Integer> stringMap = new TreeMap<>();
        for(int i= 0;i<newStr.length();i++){
            if(!stringMap.containsKey(newStr.charAt(i))){
                stringMap.put(newStr.charAt(i),1);
            }else {
                int count = stringMap.get(newStr.charAt(i));
                stringMap.put(newStr.charAt(i),count+1);
            }
        }
        System.out.println(stringMap);
    }
}
