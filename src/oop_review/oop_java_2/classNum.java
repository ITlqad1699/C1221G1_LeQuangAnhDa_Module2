package oop_review.oop_java_2;

import java.sql.SQLOutput;

public class classNum {
    public static void main(String[] args) {
        int[] arg1 = {1, 2, 3, 3};
        System.out.println(test(arg1));
//        int x;
//        int sum1;
//        int sum2;
//        for (int i = 1; i < arg1.length - 1; i++) {
//            x = i;
//            sum1 = 0;
//            sum2 = 0;
//            for (int j = 0; j < x; j++) {
//                sum1 += arg1[j];
//            }
//            for (int k = x + 1; k < arg1.length; k++) {
//                sum2 += arg1[k];
//            }
//            if (sum1 == sum2) {
//                System.out.println(sum1);
//            }
//        }
    }

    public static boolean test(int[] arg1) {
        int x;
        int sum1;
        int sum2;
        for (int i = 1; i < arg1.length - 1; i++) {
            x = i;
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < x; j++) {
                sum1 += arg1[j];
            }
            for (int k = x + 1; k < arg1.length; k++) {
                sum2 += arg1[k];
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }
}
