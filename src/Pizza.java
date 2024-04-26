import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name + " with " + dough + " dough" + " and " + sauce + " sauce");
        System.out.println("Putting on the toppings: ");
        for(String topping : toppings) {
            System.out.println(topping + " ");
        }
    }

    @Override
    public String toString() {
        return name + dough + sauce;
    }
}
