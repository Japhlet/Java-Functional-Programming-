package functionalinterface;

public class _Consumer {
    public static void main(String [] args) {
        Customer maria = new Customer("Maria", "9999999");

        greetCustomer(maria);
    }

    //Imperative Approach
    static void greetCustomer(Customer customer) {
        System.out.println("Hello "+customer.customerName+"" +
                ", thanks for registering with phone number "
                +customer.customerPhone);
    }

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
