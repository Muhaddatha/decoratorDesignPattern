public class MochaDecorator extends BeverageDecorator{

    Beverage beverage;
    public MochaDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.75;
    }
}
