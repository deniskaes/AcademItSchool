package Lesson7;

import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String firstName = scanner.nextLine();

        System.out.println("Ведите имя:");
        String lastName = scanner.nextLine();

        System.out.println("телефон:");
        String phoneNumber = scanner.nextLine();

        Contact contact1 = new Contact(firstName, lastName, phoneNumber);

        System.out.println(contact1.getFirstName() + " " + contact1.getLastName() + " " + contact1.getPhoneNumber());
    }

}
