public class SoyMilkDecorator extends BeverageDecorator{

    Beverage beverage;

    public SoyMilkDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
