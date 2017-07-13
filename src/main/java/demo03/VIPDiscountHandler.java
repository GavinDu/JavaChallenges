package demo03;

import java.math.BigInteger;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class VIPDiscountHandler extends Handler {
    protected static BigInteger minimalValue = new BigInteger("100000");
    protected static BigInteger maximalValue = new BigInteger("1000000");
    public Response handleRequest(Request request) {
        if (request.getCustomerSalesAmount().compareTo(minimalValue) >= 0
                && request.getCustomerSalesAmount().compareTo(maximalValue) <= 0) {
            return new Response(DiscountType.VIP);
        }
        throw new IllegalArgumentException("Invalid Argument.");
    }
}
