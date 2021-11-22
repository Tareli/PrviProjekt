package six.beverage;

public class BeverageConsumer {
    private Beverage beverage;

    public BeverageConsumer(Beverage beverage){
        this.beverage = beverage;

    }
    public void  consume(){
        System.out.println("konzumiram: " + beverage.getName() + " i to me kosta: "+ beverage.cost());

    }
}
