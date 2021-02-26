package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String [] args) {
        //Imperative
        System.out.println("Imperative");
        System.out.println(isPhoneNumberValid("07939493433"));
        System.out.println(isPhoneNumberValid("09939493433"));

        //Declarative
        System.out.println("Declarative");
        System.out.println(isPhoneNumberValidPredicate.test("07993415444"));

        System.out.println("Chaining Predicates");
        System.out.println(isPhoneNumberValidPredicate.and(phoneNumberContains3).test("07993415444"));
    }

    //Imperative Approach
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    //Declarative
    static Predicate<String> isPhoneNumberValidPredicate =
            phoneNumber ->
                    (phoneNumber.startsWith("07") && phoneNumber.length() == 11);

    static Predicate<String> phoneNumberContains3 =
            phoneNumber ->
                    phoneNumber.contains("3");
}
