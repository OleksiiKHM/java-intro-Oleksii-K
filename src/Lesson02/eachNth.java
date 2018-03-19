package Lesson02;

public class eachNth {

    public static void main(String[] args) {
        System.out.println(eachNth("Miracle", 2));
        System.out.println(eachNth("Miracle", 3));
        System.out.println(eachNth("", 2));
        System.out.println(eachNth("Miracle", 0));
    }

    public static String eachNth(String str, int n) {
        if (str.length() == 0) {
            return "String must not be empty!";
        } else if (n < 1) {
            return "Each Nth number should be at least 1";
        } else {
            String resultString = "";
            for (int i = 0; i <= str.length(); i = i + n) {
                String newstr = Character.toString(str.charAt(i));
                resultString = resultString.concat(newstr);
            }
            return resultString;
        }

    }
}

