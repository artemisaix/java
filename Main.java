package artemisaix.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Persona> list = Arrays.asList(
                new Persona("Miguel", 20, false), new Persona("Angel", 31, false), new Persona("Rafa", 32, false),
                new Persona("Donnie", 55, false), new Persona("Shogo", 33, true), new Persona("Omori", 34, true)
        );

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Jack"));
        customers.add(new Customer(2, "James"));
        customers.add(new Customer(3, "Kelly"));

        // boolean filterCust = customers.stream().anyMatch(x -> x.getName().equals("Jack"));
        Customer jack = new Customer(2, "Jack");
        boolean isFounded = findCust(customers, jack.getName());
        if (isFounded == true) {
            System.out.println("Customer founded");
        } else {
            System.out.println("Customer NOT FOUND");
        }

        List<Persona> l = getH(list);

        l.stream().forEach(x -> {
            System.out.println(x);
        });
    }

    private static List<Persona> getH(List<Persona> list) {
        return list.stream().filter(x -> x.isSexo()).collect(Collectors.toList());
    }

    private static boolean findCust(List<Customer> list, String customer) {
        return list.stream().anyMatch(x -> x.getName().equals(customer));
    }

}
