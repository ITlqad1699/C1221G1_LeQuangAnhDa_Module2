package ss19_regex_and_string.practices.account;

public class ValidateAccount {
    public static boolean validdateAccount(String Account) {
        String validate = "^[_a-z0-9]{6,}$";
        return validate.matches(Account);
    }
}
