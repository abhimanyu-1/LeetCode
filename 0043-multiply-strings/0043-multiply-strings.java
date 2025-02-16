import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger z = new BigInteger(num1);
        BigInteger y = new BigInteger(num2);
        return z.multiply(y).toString();
    }
}
