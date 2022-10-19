public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Smith");
        store.register(customer2);
        store.register(customer1);
        store.inviteSale();

    }
}