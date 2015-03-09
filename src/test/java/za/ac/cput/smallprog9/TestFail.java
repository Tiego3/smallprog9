package za.ac.cput.smallprog9;

import junit.framework.TestCase;

/**
 * Created by student on 2015/02/13.
 */
public class TestFail extends TestCase {

    FailProg fl = new FailProg();

    public void testTheFail(){
        if(fl.mainFailProg() == null) {
            fail("Obj is null");
        }
    }
}
