public class Item {

    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        if (type.equals("side") || type.equals("drink")) {
            return size + " " + name;
        }

        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.50;
            case "BIG" -> getBasePrice() + 1.00;
            default -> getBasePrice();
        };
    }

    public void printItem(String name, double price) {
        System.out.printf("%20s: %6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
