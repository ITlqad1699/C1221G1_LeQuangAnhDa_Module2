package ss1_introdution_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vietNamDong = 23000;
        System.out.print("ti gia hien tai  " + vietNamDong + "\n");
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so tien can doi:  ");
        usd = scanner.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("sau khi quy doi la: " + quyDoi);
    }
}
