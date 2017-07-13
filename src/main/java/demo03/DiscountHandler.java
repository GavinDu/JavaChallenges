package demo03;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class DiscountHandler {
    public Response applyDiscount(Request request) {
        Handler noDiscount = new NoDiscountHandler();
        Handler basicDiscount = new BasicDiscountHandler();
        Handler moderateDiscount = new ModerateDiscountHandler();
        Handler vipDiscount = new VIPDiscountHandler();

        noDiscount.setHandler(basicDiscount)
            .setHandler(moderateDiscount)
            .setHandler(vipDiscount);

        return noDiscount.handleRequest(request);
    }
}
