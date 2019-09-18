/**
 * Description:
 * Author: Liu
 * Date: 2019-09-18 15:27
 */
public class AccountServiceImpl implements IAccountService
{
    IAccountService accountService;

    public double computeTax(double income) {
        return accountService.computeTax (income);
    }

    public double weeklySalary(Employee income) {
        return accountService.weeklySalary (income);
    }

    public double fortnightSalary(Employee income) {
        return accountService.fortnightSalary (income);
    }

    public double computeKiwiSaver(Employee income) {
        return accountService.computeKiwiSaver (income);
    }

    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
}
