package demo03;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class Response {
    DiscountType type;
    public Response(DiscountType discountType) {
        this.type = discountType;
    }

    public DiscountType getDiscountType() {
        return this.type;
    }
}
