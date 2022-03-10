package ss16_io_text_file.practices;

public class ThrowExceptionWithTryCatch {
    static void validate(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        }
        /* exception handling */
        catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
