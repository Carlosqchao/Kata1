package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan", LocalDate.of(2020,10,10));
        System.out.println(person);
    }
}
