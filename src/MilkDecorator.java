public class MilkDecorator extends BeverageDecorator{

    Beverage beverage;
    double howMany;
    public MilkDecorator(Beverage beverage, double howMany){
        this.beverage = beverage;
        this.howMany = howMany;
    }

    public MilkDecorator(Beverage beverage){
        this.beverage = beverage;
        this.howMany = 1;
    }

    @Override
    public double cost() {
        return beverage.cost() + howMany * 0.30;
    }
}
