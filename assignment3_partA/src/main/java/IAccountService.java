/**
 * Description:
 * Author: Liu
 * Date: 2019-09-18 15:24
 */
public interface IAccountService {
  double computeTax(double income);
  double weeklySalary(Employee income);
  double fortnightSalary(Employee income);
  double computeKiwiSaver(Employee income);

}
