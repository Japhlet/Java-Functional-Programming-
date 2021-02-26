package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String [] args) {
        //Imperative
        System.out.println("Imperative");
        System.out.println(getDbConnectionUrl());

        //Declarative
        System.out.println("Declarative");
        String url = getDbConnectionUrlSupplier.get();
        System.out.println(url);
    }

    //Imperative Approach
    static String getDbConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    //Declarative
    static Supplier<String> getDbConnectionUrlSupplier =
            () -> "jdbc://localhost:5432/users";
}
