package testcases;

import org.testng.annotations.Test;
import pages.Signout;

public class SignoutTest extends Signout {

    @Test
    public void testSignout(){
        validateSignout();
        sleepFor(4);
    }
}
