import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("Welcome to the BookStore! ");
        System.out.println("What would you like to do? ");
        System.out.println("------------------");
        displayMenu();


    }
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book(12, "The oldest book", "Old book writer McOld", 399);
        Book book2 = new Book(22, "The newest book", "New book writer McNew", 499);
        Book book3 = new Book(32, "The medium old book", "Medium old book writer McMedium", 449);


        System.out.println("\n");
        System.out.println("\t1. Browse the collection");
        System.out.println("\t2. Add book to your cart.");
        System.out.println("\t3. Remove book from cart");
        System.out.println("\t4. Show cart");
        System.out.print("\tPlease enter your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        if( choice >= 1 && choice <= 4){
        switch (choice) {
            case 1:
                //Insert Books Array List loop instead of individual books.
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
//                for (Cart carts : carts) {
//                    System.out.println(carts);
//                }
                break;
        }
            System.out.println("please enter a number between 1 and 4: ");
        displayMenu();

        }
    }
}