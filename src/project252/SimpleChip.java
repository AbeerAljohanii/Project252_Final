package project252;

public class SimpleChip extends Cookies {
    public SimpleChip() {
        super("Simple Chip", 4.99);
    }
    public SimpleChip(Extra extra) {
        super("Simple Chip with "+ extra.getextra(), 4.99 + extra.getprice(), extra);
    }
    @Override
    void getInfo() {
        String s = getType() + " : " + getPrice() + extra.extra();
    }
}
