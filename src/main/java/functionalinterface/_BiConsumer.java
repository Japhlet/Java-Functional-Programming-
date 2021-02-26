package functionalinterface;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _BiConsumer {
    public static void main(String [] args) {
        //Normal Java Function
        Customer maria = new Customer("Maria", "9999999");
        greetCustomer(maria, false);

        //Consumer Function Interface
        Customer consumerCustomer = new Customer("Consumer Customer", "555555");
        greetCustomerConsumer.accept(consumerCustomer, false);
    }

    //Imperative Approach
    static void greetCustomer(Customer customer, boolean showCustomerPhoneNumber) {
        System.out.println("Hello "+customer.customerName+"" +
                ", thanks for registering with phone number "
                    +(showCustomerPhoneNumber ? customer.customerPhone : "****************"));

    }

    //Declarative Approach
    static BiConsumer<Customer, Boolean> greetCustomerConsumer = (customer, showCustomerPhoneNumber) ->
            System.out.println("Hello "+customer.customerName+"" +
                    ", thanks for registering with phone number "
                    +(showCustomerPhoneNumber ? customer.customerPhone : "*****************"));

    static class Customer {
        private final String customerName;
        private final String customerPhone;

        public Customer(
                String customerName,
                String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
