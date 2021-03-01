public class MilkDecorator extends BeverageDecorator{

    Beverage beverage;
    public MilkDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.30;
    }
}
