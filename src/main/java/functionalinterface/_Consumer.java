package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String [] args) {
        //Normal Java Function
        Customer maria = new Customer("Maria", "9999999");
        greetCustomer(maria);

        //Consumer Function Interface
        Customer consumerCustomer = new Customer("Consumer Customer", "555555");
        greetCustomerConsumer.accept(consumerCustomer);
    }

    //Imperative Approach
    static void greetCustomer(Customer customer) {
        System.out.println("Hello "+customer.customerName+"" +
                ", thanks for registering with phone number "
                +customer.customerPhone);
    }

    //Declarative Approach
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+customer.customerName+"" +
                    ", thanks for registering with phone number "
                    +customer.customerPhone);

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
