
public class Main {
    public static void main(String[] args) {

        CoffeeMachine c = CoffeeMachine.getInstance();
        CoffeeMachine c1 = CoffeeMachine.getInstance();
        if(c==c1){
            System.out.println("Same");
        }else{
            System.out.println("Not Same");
        }

    }
}