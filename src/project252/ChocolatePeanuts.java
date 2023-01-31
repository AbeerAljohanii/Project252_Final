package project252;

public class ChocolatePeanuts extends Cookies {
    public ChocolatePeanuts() {
        super("Chocolate Peanuts", 6.99);
    }
    public ChocolatePeanuts(Extra extra) {
        super("Chocolate Peanuts with "+ extra.getextra(), 6.99 + extra.getprice(), extra);
    }
    @Override
    void getInfo() {
        String s = getType() + " : " + getPrice() + extra.extra();
    }
}
