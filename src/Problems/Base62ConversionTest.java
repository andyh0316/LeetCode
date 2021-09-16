package Problems;
import Helpers.PrintHelper;

public class Base62ConversionTest {
    // test
    public static void start() {
        System.out.println("1 => " + Base62Conversion.convert(1));
        System.out.println("2 => " + Base62Conversion.convert(2));
        System.out.println("100 => " + Base62Conversion.convert(100));
        System.out.println("1000 => " + Base62Conversion.convert(1000));
        System.out.println("10000 => " + Base62Conversion.convert(10000));
        System.out.println("100000000 => " + Base62Conversion.convert(100000000));
    }
}