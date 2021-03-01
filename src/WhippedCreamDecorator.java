public class WhippedCreamDecorator extends BeverageDecorator{

    Beverage beverage;
    double howMany;
    public WhippedCreamDecorator(Beverage beverage, double howMany){
        this.beverage = beverage;
        this.howMany = howMany;
    }

    public WhippedCreamDecorator(Beverage beverage){
        this.beverage = beverage;
        this.howMany = 1;
    }


    @Override
    public double cost() {
        return beverage.cost() + howMany * 0.50;
    }
}
