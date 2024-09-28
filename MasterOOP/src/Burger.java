public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super(name, "burger", price);
    }

    @Override
    public String getName() {
        return super.getName() + "BURGER";
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item(extra1,"topping", getExtraPrice(extra1));
        this.extra2 = new Item(extra2,"topping", getExtraPrice(extra2));
        this.extra3 = new Item(extra3,"topping", getExtraPrice(extra3));
    }

    private double getExtraPrice(String name) {
        return switch (name.toUpperCase()) {
            case "AVOCADO", "SALAD", "TOMATOES" ->  00.60;
            case "BACON", "SALAMI" -> 2.00;
            default -> 1.00;
        };
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                (extra1 == null ? 0 : extra1.getAdjustedPrice()) +
                (extra2 == null ? 0 : extra2.getAdjustedPrice()) +
                (extra3 == null ? 0 : extra3.getAdjustedPrice());
    }

    public void printItemizedList() {
        printItem("BURGER", getBasePrice());
        if(extra1 != null) {
            extra1.printItem();
        }

        if(extra2 != null) {
            extra2.printItem();
        }

        if(extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
