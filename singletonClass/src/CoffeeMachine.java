public class CoffeeMachine {

    private float coffeeQty;
    private float waterQty;
    static private CoffeeMachine machine = null;

    private CoffeeMachine(){
        coffeeQty=2;
        waterQty=2;
    }


    static public CoffeeMachine getInstance(){
        if(machine==null){
            machine = new CoffeeMachine();
        }
        return machine;
    }
}
