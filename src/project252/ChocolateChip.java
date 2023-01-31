package project252;

public class ChocolateChip extends Cookies {
    public ChocolateChip() {
        super("Chocolate Chip", 3.99);
    }
    public ChocolateChip(Extra extra) {
        super("Chocolate Chip with "+ extra.getextra(), 3.99 + extra.getprice() , extra);
    }
    @Override
    void getInfo() {
        String s = getType() + " : " + getPrice() + extra.extra();
    }
}
