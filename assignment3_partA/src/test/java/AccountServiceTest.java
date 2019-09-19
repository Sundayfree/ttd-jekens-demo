import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;


/**
 * Description:
 * Author: Liu
 * Date: 2019-09-18 15:30
 */
public class AccountServiceTest {

    AccountServiceImpl impl;
    IAccountService inter;
    Employee employee;
    double expected;
    double actual;
    double mockData;

    @Before
    public void setUp() throws  Exception{
        impl= new AccountServiceImpl ();
        inter = Mockito.mock (IAccountService.class);
        employee= new Employee ();
        employee.setSalary (100.0);

    }
    @Test
    public void computeTaxTest(){
        mockData = 10.0;
       expected =mockData;
        Mockito.when (inter.computeTax (mockData)).thenReturn (expected);
        impl.setAccountService (this.inter);
        actual= impl.computeTax (mockData);
        Assert.assertEquals (expected,actual,0.1);
    }

    @Test
    public void weeklySalaryTest(){

        expected=employee.getSalary ();
        Mockito.when (inter.weeklySalary (employee)).thenReturn (expected);
        impl.setAccountService (this.inter);
        actual= impl.weeklySalary (employee);
        Assert.assertEquals (expected,actual,0.1);
    }
    @Test
    public void fortnightSalaryTest(){
        expected= employee.getSalary ();
        Mockito.when (inter.fortnightSalary (employee)).thenReturn (expected);
        impl.setAccountService (this.inter);
        actual= impl.fortnightSalary (employee);
        Assert.assertEquals (expected,actual,0.1);


    }

    @Test
    public void computeKiwiSaverTest(){
        expected= employee.getSalary ();
        Mockito.when (inter.computeKiwiSaver (employee)).thenReturn (expected);
        impl.setAccountService (this.inter);
        actual= impl.computeKiwiSaver (employee);
        Assert.assertEquals (expected,actual,0.1);

    }

    @After
    public void tearDown() throws  Exception{
        impl=null;
        employee=null;
    }
}
