 
import java.math.BigInteger;


public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger bigNum = new BigInteger("1");
        for (int i = 2; i <= value; i++){
            bigNum = bigNum.multiply(BigInteger.valueOf(i));
        }
        
        return bigNum;
    }

}
