public class NapoliPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        return switch(type) {
            case "margherita" -> new NapoliMargheritaPizza();
            case "pepperoni" -> new NapoliPepperoniPizza();
            default -> null;
        };
    }
}
