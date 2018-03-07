package Lesson7;

import java.util.Scanner;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
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
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
