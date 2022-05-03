package AddressBook;

public class Client {
    String name;
    String location;
    int phoneNumber;
    boolean wasContacted;

    public Client(String name, String location, int phoneNumber, boolean wasContacted) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.wasContacted = wasContacted;
    }

    void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Phone number: " + phoneNumber);
        String wasContactedString = wasContacted ? "Yes" : "No";
        System.out.println("Was contacted?: " + wasContactedString);
        System.out.println();
    }
}
