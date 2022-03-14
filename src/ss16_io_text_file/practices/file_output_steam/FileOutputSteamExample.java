package ss16_io_text_file.practices.file_output_steam;

import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamExample {
//    public static void main(String args[]) throws IOException {
//        FileOutputStream fout = null;
//        try {
//            fout = new FileOutputStream("D:\\codegym\\module2_codegym\\src\\ss16_io_text_file\\practices\\file_output_steam\\file.txt");
//            fout.write(65);
//            fout.close();
//            System.out.println("success...");
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            // close file output stream
//            fout.close();
//        }
//    }
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("D:\\codegym\\module2_codegym\\src\\ss16_io_text_file\\practices\\file_output_steam\\file.txt");
            String s = "Welcome to java.";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fout.close();
        }
    }
}
