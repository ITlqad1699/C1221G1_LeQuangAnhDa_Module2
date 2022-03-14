package ss16_io_text_file.practices.file_input_steam;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
//    public static void main(String args[]) throws IOException {
//        FileInputStream fin = null;
//        try {
//            fin = new FileInputStream("D:\\testout.txt");
//            int i = fin.read();
//            System.out.print((char) i);
//            fin.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            fin.close();
//        }
//    }

    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:\\testout.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fin.close();
        }
    }
}
