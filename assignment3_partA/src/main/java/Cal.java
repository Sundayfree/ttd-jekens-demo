/**
 * Description:
 * Author: Liu
 * Date: 2019-10-02 14:27
 */
public class Cal {

    public  long product(long... ls){
        long result = ls[0];
        for(int i = 1 ; i <ls.length; i++){
            result *= ls[i];
        }
        return result;
    }
}
