package ss16_io_text_file.practices;

public class ThrowException {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome");
    }

    public static void main(String args[]) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
