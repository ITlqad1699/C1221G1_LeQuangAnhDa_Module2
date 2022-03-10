package ss16_io_text_file.exercises.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, List<Integer> numbers) {
        try {
            /* nếu là true thì ghi liên tiếp nhau, mặc định là false sẽ ghi đè*/
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < numbers.size(); i++) {
                bufferedWriter.write(numbers.get(i));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> copyElenments(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != null) {
                newNums.add(nums.get(i));
            }
        }
        return newNums;
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        List<Integer> numbers = copyFile.readFile("D:\\codegym\\module2_codegym\\src\\ss16_io_text_file\\exercises\\FileNextToCopy.txt");
        copyFile.writeFile("D:\\codegym\\module2_codegym\\src\\ss16_io_text_file\\exercises\\NewFileCopy.txt", numbers);
    }
}
