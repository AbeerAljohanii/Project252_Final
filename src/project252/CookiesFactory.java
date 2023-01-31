
package project252;
public class CookiesFactory {
    public Cookies getCookies(String cookies) {
        if (cookies == null) {
            return null;
        } else if (cookies.equalsIgnoreCase("Simple Chip")) {
            return new SimpleChip();
        } else if (cookies.equalsIgnoreCase("Chocolate Peanuts")) {
            return new ChocolatePeanuts();
        } else if (cookies.equalsIgnoreCase("Chocolate Chip")) {
            return new ChocolateChip();
        } else if (cookies.equalsIgnoreCase("Birthday Cake")) {
            return new BirthdayCake();
        }
        return null;
    }
}
