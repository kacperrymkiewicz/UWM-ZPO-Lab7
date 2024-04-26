public class AmericanPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        return switch(type) {
            case "margherita" -> new AmericanMargheritaPizza();
            case "pepperoni" -> new AmericanPepperoniPizza();
            default -> null;
        };
    }
}
