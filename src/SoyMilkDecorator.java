public class SoyMilkDecorator extends BeverageDecorator{

    Beverage beverage;
    double howMany;
    public SoyMilkDecorator(Beverage beverage, double howMany){
        this.beverage = beverage;
        this.howMany = howMany;
    }

    public SoyMilkDecorator(Beverage beverage){
        this.beverage = beverage;
        this.howMany = 1;
    }

    @Override
    public double cost() {
        return beverage.cost() + howMany * 0.20;
    }
}
