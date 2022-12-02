public class Product {
    private String name;
    private int price;
    private String countryMaker;

    public Product (String name, int price, String countryMaker) {
        this.name = name;
        this.price = price;
        this.countryMaker = countryMaker;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Товар: %s ценой %d рублей, произведенный в %s.", name, price, countryMaker);
    }
}
