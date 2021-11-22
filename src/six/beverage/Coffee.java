package six.beverage;

public class Coffee extends Beverage{

    public Coffee() {
        super( " Coffee");
    }

    @Override
    public double cost() {
        return 1;
    }

    @Override
    public void drik() {
        System.out.println("Kafu pijem jer volim");

    }
}
