public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Ella", "Costello", "ella.costello@yahoo.com", 53314621, 1);
        System.out.println(customer);



        BookStore.createCustomer();
        System.out.println(BookStore.customers.toString().replace('[', ' ').replace(']', ' '));
    }
}