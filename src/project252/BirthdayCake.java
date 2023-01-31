package project252;

public class BirthdayCake extends Cookies {
    public BirthdayCake() {
        super("Birthday Cake", 4.99);
    }
    public BirthdayCake(Extra extra) {
        super("Birthday Cake with "+ extra.getextra(), 4.99 + extra.getprice(), extra);
    }
    @Override
    void getInfo() {
        String s = getType() + " : " + getPrice() + extra.extra();
    }
}
