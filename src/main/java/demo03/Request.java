package demo03;

import java.math.BigInteger;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public class Request {
    private BigInteger salesAmount;

    public Request(BigInteger salesAmount) {
        this.salesAmount = salesAmount;
    }

    public BigInteger getCustomerSalesAmount() {
        return salesAmount;
    };
}
