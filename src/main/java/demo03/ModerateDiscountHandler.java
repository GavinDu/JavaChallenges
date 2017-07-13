package demo03;

import java.math.BigInteger;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class ModerateDiscountHandler extends Handler {
    protected static BigInteger minimalValue = new BigInteger("50000");
    public Response handleRequest(Request request) {
        if (request.getCustomerSalesAmount()
                .compareTo(VIPDiscountHandler.minimalValue) < 0) {
            return new Response(DiscountType.MODERATE);
        } else {
            return successor.handleRequest(request);
        }
    }
}
