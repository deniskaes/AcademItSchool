package Lesson7;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

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
        Contact contact1 = new Contact();
        contact1.setFirstName("Esaulov");
        contact1.setLastName("Denis");
        contact1.setPhoneNumber("+79130000001");

        System.out.println(contact1.getFirstName() + " " + contact1.getLastName() + " " + contact1.getPhoneNumber());
    }
}
