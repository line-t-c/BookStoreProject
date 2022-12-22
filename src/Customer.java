import java.util.ArrayList;
import java.util.List;

public class Customer {
    List<Cart> customerCarts = new ArrayList<>();

    String firstName;
    String lastName;
    String email;
    int phone;
    int customerId;

    public Customer(String firstName, String lastName, String email, int phone, int customerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String toString() {
        return  "----------------------------------------\nCustomer:\t\t|\t\t" + firstName + " " + lastName + "\nEmail:\t\t\t|\t\t" + email.toLowerCase() + "\nPhone\t\t\t|\t\t" + phone + "\nCustomer ID:\t|\t\t" + customerId + "\n----------------------------------------";

    }
}

