package Project;
import static org.junit.Assert.assertTrue;
import org.junit.*;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * 216233550
 */

public class AppTest
{
    private App formulas;

    @Before
    public void setUp() throws Exception {
        formulas = new App();
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test

    public void volumeEquality() {

        int result = formulas.volume(1, 1, 1);

        Assert.assertEquals(1, result);
    }



    @Test
    public void volumeIdentity() {

        int result = formulas.volume(1, 1, 1);

        Assert.assertSame(1, result);
    }

    @Test
    public void volumeFail() {

        Assert.fail("Failing test");
    }

    @Test (timeout = 200)

    public void volumeTimeout() {

        int result = formulas.volume(1, 1, 1);

        Assert.assertSame(1, result);
    }

    @Ignore
    @Test

    public void volumeDisable() {
        int result = formulas.volume(1, 1, 1);
        Assert.assertEquals(1, result);
    }
}

