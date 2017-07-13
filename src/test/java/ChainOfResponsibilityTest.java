import java.math.BigInteger;


import demo03.DiscountHandler;
import demo03.DiscountType;
import demo03.Request;
import demo03.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class ChainOfResponsibilityTest {


    @Test
    public void verifyNoDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("100")));
        Assertions.assertEquals(DiscountType.NO_DISCOUNT, response.getDiscountType());

    }

    @Test
    public void verifyBasicDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("10005")));
        Assertions.assertEquals(DiscountType.BASIC, response.getDiscountType());
    }


    @Test
    public void verifyModerateDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("50005")));
        Assertions.assertEquals(DiscountType.MODERATE, response.getDiscountType());
    }


    @Test
    public  void  verifyVIPDiscount() {
        Response response = new DiscountHandler()
                .applyDiscount(new Request(new BigInteger("100005")));
        Assertions.assertEquals(DiscountType.VIP, response.getDiscountType());
    }
    @Test
    public  void  verifyVIPDiscountException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new DiscountHandler().applyDiscount(new Request(new BigInteger("100000005")));
        });
    }
}
