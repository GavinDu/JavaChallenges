package demo03;

import java.math.BigInteger;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class BasicDiscountHandler extends Handler {
    protected static BigInteger minimalValue = new BigInteger("10000");

    public Response handleRequest(Request request) {
        if (request.getCustomerSalesAmount()
                .compareTo(ModerateDiscountHandler.minimalValue) < 0) {
            return new Response(DiscountType.BASIC);
        } else {
            return successor.handleRequest(request);
        }
    }
}
