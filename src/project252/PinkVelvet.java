package project252;

public class PinkVelvet extends Cookies {
    public PinkVelvet() {
        super("Chocolate Peanuts", 6.99);
    }
    public PinkVelvet(Extra extra) {
        super("Chocolate Peanuts with "+ extra.getextra(), 6.99 + extra.getprice(), extra);
    }
    @Override
    void getInfo() {
        String s = getType() + " : " + getPrice() + extra.extra();
    }
}
