package six.beverage;

public class Main {
    public static void main(String[] args) {
        Coffee coffe = new Coffee();
        BeverageConsumer beverageConsumer = new BeverageConsumer(coffe);
        beverageConsumer.consume();

        Tea tea = new Tea();
        BeverageConsumer beverageConsumer1 = new BeverageConsumer(tea);
        beverageConsumer1.consume();

        CocaCola cocaCola = new CocaCola();
        BeverageConsumer beverageConsumer2 = new BeverageConsumer(cocaCola);
        beverageConsumer2.consume();

    }
}
