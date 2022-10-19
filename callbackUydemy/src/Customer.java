public class Customer implements Member{
    String name;
    public Customer(String name){
        this.name=name;
    }
    @Override
    public void callBack() {
        System.out.println("Calling the Customer: "+name);
    }
}
