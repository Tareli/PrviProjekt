package six.beverage;

public abstract class Beverage{
    private String name;

    public  Beverage(String name){
        this.name = name;
    }
    public abstract double cost();

    public  abstract void drik();

    public  String getName(){
        return name;

    }
}
