package Problems;

import java.util.HashMap;

public class TinyUrlCodec {
    String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //String chars = "ABC";
    int charsLength = chars.length();
    HashMap<String, String> map = new HashMap<>();
    int count = 1;

    // The concept here is we take all possible 62 characters, use modular and division to produce unique combination
    // of characters based on counter. For example:
    // 0 = A, 1 = B, 2 = C, 3 = AA, 4 = BA, 5 = CA, 6 = AAA, 7 = AAB, 8 = AAC
    public String getString() {
        int c = count;
        StringBuilder sb = new StringBuilder();

        while (c > 0) {
            c--;
            sb.append(chars.charAt(c % charsLength));
            c /= charsLength;
        }
        return sb.toString();
    }

    public String encode(String longUrl) {
        String key = getString();
        map.put(key, longUrl);
        count++;
        return "http://tinyurl.com/" + key;
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl.replace("http://tinyurl.com/", ""));
    }
}