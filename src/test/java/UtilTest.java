import java.util.Properties;

import static org.testng.Assert.*;

public class UtilTest {

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        System.out.println(System.getProperty("myProperty"));
    }

    @org.testng.annotations.AfterMethod
    public void tearDown() {
    }

    @org.testng.annotations.Test
    public void testGetDiff() {
        System.out.println(System.getProperty("myProperty"));
    }

}