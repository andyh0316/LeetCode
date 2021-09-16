package Problems;
import Helpers.PrintHelper;

public class TinyUrlCodecTest {
    // test
    public static void start() {
        String url = "https://leetcode.com/problems/design-tinyurl";

        TinyUrlCodec codec = new TinyUrlCodec();
        String encodedUrl = codec.encode(url); // returns the encoded tiny url.
        String decodedUrl = codec.decode(encodedUrl); // returns the original url after

        System.out.println(encodedUrl);
        System.out.println(decodedUrl);

        for (int i = 0; i < 50; i++) {
            encodedUrl = codec.encode(url);
            System.out.println(encodedUrl);
        }
    }
}