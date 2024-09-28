public class MealOrder {

    private Item side;
    private Item drink;
    private Burger burger;

    public MealOrder() {
        this("fries", "coke", "regular");
    }

    public MealOrder(String sideType, String drinkType, String burgerType) {
        this.side = new Item("side", sideType,4.00);
        this.drink = new Item("drink", drinkType, 1.00);
        this.burger = new Burger(burgerType, 7.00);
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public void printItemizedList() {
        side.printItem();
        drink.printItem();
        burger.printItem();
        System.out.println("-".repeat(30));
        printTotal();
    }

    public void printTotal() {
        System.out.println(side.getAdjustedPrice()+ drink.getAdjustedPrice()+ burger.getAdjustedPrice());
    }

}

