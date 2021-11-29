import com.sun.source.tree.BreakTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testSomething() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
    }

    private class FakeBinary {
        public String fakeBin(String numberString) {
            String[] split = numberString.split("");
            for (int i = 0; i < split.length; i++) {
                split[i] = Integer.parseInt(split[i]) < 5 ? "0" : "1";
            }
            return String.join("", split);
        }
    }
}
//или такое решение: return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
