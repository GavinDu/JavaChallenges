package demo03;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class NoDiscountHandler extends Handler {
    public Response handleRequest(Request request) {
        if (request.getCustomerSalesAmount()
                .compareTo(BasicDiscountHandler.minimalValue) < 0) {
            return new Response(DiscountType.NO_DISCOUNT);
        } else {
            return  successor.handleRequest(request);
        }
    }
}
