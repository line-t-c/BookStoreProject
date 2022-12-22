import java.util.*;

public class BookStore {
    static List<Book> books = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static List<Cart> carts = new ArrayList<>();


    public static void createCustomer() {
        Scanner sc = new Scanner(System.in);
        int customerId = 1;

        if (customers.size() > 0) {
            customerId = customers.get(customers.size()-1).getCustomerId() + 1;
        }

        System.out.println("---Create new customer---");
        System.out.print("First name: ");
        String firstName = sc.nextLine();
        System.out.print("Last name: ");
        String lastName = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Phone Number: ");
        int number = sc.nextInt();

        customers.add(new Customer(firstName, lastName, email, number, customerId));

    }

    public static void addNewCart() {

    }

    public static void editCart() {

    }
}
