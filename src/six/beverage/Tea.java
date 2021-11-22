package six.beverage;

public class Tea extends Beverage{
    public Tea() {
        super( "Tea");
    }

    @Override
    public double cost() {
        return 2;
    }

    @Override
    public void drik() {
        System.out.println("Caj pijem jer sam bolestan");


    }
}
