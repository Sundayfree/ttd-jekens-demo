import org.junit.After;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;


/**
 * Description:
 * Author: Liu
 * Date: 2019-09-18 15:30
 */
public class Test1 {

    Cal cal;
    long ans, num, expected,actual;
    @Before
    public void setUp() throws  Exception{
        ans = 15*-5*13*3;
        cal= new Cal();
        expected = ans;
        actual = cal.product(15,-5,13,3);

    }
    @Test
    public  void test(){
        Assert.assertEquals (expected,actual);

    }

    @After
    public void tearDown() throws  Exception{
    }
}
