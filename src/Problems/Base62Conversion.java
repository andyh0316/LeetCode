package Problems;

// Takes input of a number (ID, counter, etc), turns it into unique base62 output
public class Base62Conversion {
    public static String convert(long input) {
        String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String hashString = "";

        while (input > 0) {
            long remainder = input % 62;
            long quotient = input / 62;

            hashString = s.charAt((int)remainder) + hashString;
            input = quotient;
        }

        return hashString;
    }
}