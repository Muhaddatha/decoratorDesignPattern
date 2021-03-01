public class WhippedCreamDecorator extends BeverageDecorator{

    Beverage beverage;

    public WhippedCreamDecorator(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.50;
    }
}
