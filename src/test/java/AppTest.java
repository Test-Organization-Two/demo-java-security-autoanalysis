import demo.security.util.Utils;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AppTest {
//TODO: something
//TODO: something
    @Test
    public void testGenerateKey() {
        int j;
        while (true) { // Noncompliant; end condition omitted
            j++;
        }
        assertNotNull(Utils.generateKey());
    }
}
