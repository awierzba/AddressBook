package AddressBook;

import java.util.*;

public class Display extends MenuInteraction {
    Scanner scanner = new Scanner(System.in);

    public void displayAllContacts() {
        for (Client client : contacts) {
            int index = contacts.indexOf(client);
            System.out.println(++index + ".");
            client.displayContact();
        }
    }

    public void displayContactByName() {
        System.out.println("Please provide contact's name:");
        System.out.println();
        String name = scanner.nextLine();
        Client client = clientsNames.get(name);
        client.displayContact();
    }

    public void displayContactByPhoneNumber() {
        System.out.println("Please provide phone number:");
        System.out.println();
        Integer number = Integer.valueOf(scanner.nextLine());
        Client client = phoneNumber.get(number);
        client.displayContact();
    }

    public void displayLocations() {
        for (String location : locations) {
            System.out.println(location);
            System.out.println();
        }
    }
}
