import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


@RunWith(Parameterized.class)
public class PraktikumTest {


    private String invalidName;

    public PraktikumTest(String invalidName) {
        this.invalidName = invalidName;
    }
    @Test
    public void testAccountValid() {
        String name = "Kate Lops";
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {""},
                {" "},
                {"Jane"},
                {"This is a long name with multiple spaces"}
        });
    }
 @Test
    public void testAccountInValid() {
        Account account = new Account(invalidName);
        assertFalse(account.checkNameToEmboss());
    }

}


