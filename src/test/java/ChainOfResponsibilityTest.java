import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import demo03.DiscountHandler;
import demo03.DiscountType;
import demo03.Request;
import demo03.Response;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class ChainOfResponsibilityTest {


    @Test
    public void verifyNoDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("100")));
        Assert.assertEquals(DiscountType.NO_DISCOUNT, response.getDiscountType());

    }

    @Test
    public void verifyBasicDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("10005")));
        Assert.assertEquals(DiscountType.BASIC, response.getDiscountType());
    }


    @Test
    public void verifyModerateDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("50005")));
        Assert.assertEquals(DiscountType.MODERATE, response.getDiscountType());
    }


    @Test
    public  void  verifyVIPDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("100005")));
        Assert.assertEquals(DiscountType.VIP, response.getDiscountType());
    }
    @Test(expected = IllegalArgumentException.class)
    public  void  verifyVIPDiscountException() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("100000005")));
    }
}
