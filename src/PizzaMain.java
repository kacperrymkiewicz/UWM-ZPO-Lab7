public class PizzaMain {
    public static void main(String[] args) {
        PizzaStore napoliPizzaStore = new NapoliPizzaStore();
        Pizza pizza = napoliPizzaStore.orderPizza("margherita");
        Pizza pizza2 = napoliPizzaStore.orderPizza("pepperoni");
        System.out.println(pizza);
        System.out.println(pizza2);

        PizzaStore americanPizzaStore = new AmericanPizzaStore();
        Pizza pizza3 = americanPizzaStore.orderPizza("margherita");
        Pizza pizza4 = americanPizzaStore.orderPizza("pepperoni");
        System.out.println(pizza3);
        System.out.println(pizza4);
    }
}
