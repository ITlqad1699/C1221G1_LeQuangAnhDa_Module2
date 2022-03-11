package ss19_regex_and_string.practices.email;


class EmailExample {

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public boolean validate(String regex) {

        return EMAIL_REGEX.matches(regex);
    }
}
