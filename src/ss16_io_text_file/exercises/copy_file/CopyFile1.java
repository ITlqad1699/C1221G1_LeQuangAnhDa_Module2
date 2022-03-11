package ss16_io_text_file.exercises.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile1 {
    static final String COUNTRY_FILE = "D:\\codegym\\module2_codegym\\src\\ss16_io_text_file\\exercises\\copy_file\\countries.csv";

    private static void writeCountry(List<Country> stringList, String pathFile, Boolean append) {

        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append); // true ghi tiếp; false (mặc đinh): nghi đè
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Country s : stringList) {
                bufferedWriter.write(String.valueOf(s));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Country> readCountry(String pathFile) {
        List<Country> countries = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arr = null;
            while ((line = bufferedReader.readLine()) != null) {
                arr = line.split(",");
                Country country = new Country(Integer.parseInt(arr[0]), arr[1], arr[2]);
                countries.add(country);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return countries;
    }

    public static void main(String[] args) {
        CopyFile1 copyFile1 = new CopyFile1();
        List<Country> newCountries = readCountry(COUNTRY_FILE);
        writeCountry(newCountries,"D:\\codegym\\module2_codegym\\src\\ss16_io_text_file\\exercises\\copy_file\\NewContries.csv",true);

    }
}
