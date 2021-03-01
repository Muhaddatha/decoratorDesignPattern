public class MochaDecorator extends BeverageDecorator{

    Beverage beverage;
    double howMany;
    public MochaDecorator(Beverage beverage, double howMany){
        this.beverage = beverage;
        this.howMany = howMany;
    }

    public MochaDecorator(Beverage beverage){
        this.beverage = beverage;
        this.howMany = 1;
    }


    @Override
    public double cost() {
        return beverage.cost() + 0.75 * howMany;
    }
}
