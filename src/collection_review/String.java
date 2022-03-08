package collection_review;



class Stringpare {
    public static void main(String args[]) {
        String s1 = "CodegymDaNang";
        String s2 = s1.toLowerCase();
        String newStr = "";
        String newStr1;

            for (int i = 0; i < s1.length(); i++) {
                if (s2.charAt(i) == (s1.charAt(i))) {
                    newStr += s1.charAt(i);
                } else {
                    newStr = newStr + " " + s1.charAt(i);
                }
            }
        newStr1 = newStr.toLowerCase();
        System.out.print(newStr1.trim());
    }
}

