package six.beverage;

public class CocaCola extends Beverage{
    public CocaCola() {
        super( "CocaCola");
    }

    @Override
    public double cost() {
        return 3;
    }

    @Override
    public void drik() {
        System.out.println("Pijem jer sam mamuran");


    }
}
