public class TestBeverage {

    public static void main(String[] args){

        Beverage darkRoast = new DarkRoast();
        System.out.println("Dark roast cost: " + darkRoast.cost());

        Beverage darkRoastMilk = new MilkDecorator(darkRoast);
        System.out.println("Dark roast with milk cost: " + darkRoastMilk.cost());

        Beverage espresso = new Espresso();
        espresso = new WhippedCreamDecorator(new MochaDecorator(espresso, 2), 0.5);

        System.out.println("Espresso with half whipped cream and double Mocha cost: " + espresso.cost() );
    }
}
