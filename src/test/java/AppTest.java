import demo.security.util.Utils;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppTest {
//TODO: something
//TODO: something
    public int foo(int a) {
        int b = 12;
        if (a == 1) {
            return b;
        }
        return b;  // Noncompliant
     }
    @Test
    public void testGenerateKey() {
        assertNotNull(Utils.generateKey());
    }
}
