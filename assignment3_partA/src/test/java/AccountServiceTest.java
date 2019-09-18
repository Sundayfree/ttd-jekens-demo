import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

/**
 * Description:
 * Author: Liu
 * Date: 2019-09-18 15:30
 */
public class AccountServiceTest {

    AccountServiceImpl account;
    IAccountService mock;
    double expected;
    double actual;
    double mockData;
    @Before
    public void setUp() throws  Exception{
        account= new AccountServiceImpl ();
        mock = Mockito.mock (IAccountService.class);
        mockData = 10.0;
        Mockito.when (mock.computeTax (mockData)).thenReturn (expected);
        account.setAccountService (mock);
        actual= account.computeTax (mockData);
    }
    @Test
    public void computeTaxTest(){
        Assert.assertEquals (expected,actual,0.1);
    }

    @Test
    public void weeklySalaryTest(){


    }

    @After
    public void tearDown() throws  Exception{
        account=null;
    }
}
