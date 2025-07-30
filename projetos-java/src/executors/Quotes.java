package executors;

public class Quotes {
    private final String site;
    private final int price;

    public Quotes(String site, int price) {
        this.site = site;
        this.price = price;
    }

    public String getSite() {
        return site;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }
}
