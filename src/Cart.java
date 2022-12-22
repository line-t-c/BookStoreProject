import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {

    int oderId;
    int listOfItems;

    public Cart (int oderId, int listOfItems) {
        this.oderId = oderId;
        this.listOfItems = listOfItems;
    }

    public static void add () {

    }

    public static void remove () {
//        System.out.print("Enter book id: ");
//        int id = sc.nextInt();
//
//        if (id == books.id) {
//            books.remove(id);
//            }
//        else
//            System.out.println("\nError: There is no books with that id number.");
    }

    public static void display (List<Book> books) {
//        System.out.println("---Books---");
//        boolean isEmphty = true;
//        for (int i = 0; i < books.size(); i++) {
//            if (books.get(i) != null){
//                System.out.println(i+1+". "+ books.get(i));
//                isEmphty = false;
//            }
//        }
//        if (isEmphty){
//            System.out.println("\nBook list is emphty.");
//        }

    }
    public static void placeOrder () {

    }

    public static void payOrder () {

    }

    public static void printOrder () {
        System.out.println("---Your order---");



    }


}



//    public static void addBookToList () {
//        System.out.print("Enter book id: ");
//        String bookTitle = sc.nextLine();
//        System.out.print("Enter book title: ");
//        String bookTitle = sc.nextLine();
//        System.out.print("Enter author: ");
//        String bookTitle = sc.nextLine();
//        System.out.print("Enter book price: ");
//        String bookTitle = sc.nextLine();
//
//        books.add(new Book (bookId, title, author, price));
//    }