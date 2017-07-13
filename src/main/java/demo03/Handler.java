package demo03;

import java.math.BigInteger;

/**
 * Created by Gavin Du on 7/12/2017.
 */
public abstract class Handler {
    protected Handler successor;
    public Handler setHandler(Handler successor) {
        this.successor = successor;
        return this.successor;
    }

    public abstract Response handleRequest(Request request);
}


