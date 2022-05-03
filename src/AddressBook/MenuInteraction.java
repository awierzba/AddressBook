package AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuInteraction {
    Scanner scanner = new Scanner(System.in);
    List<String> contacts = new ArrayList<>();

    public void addContact() {
        System.out.println("Please provide contact name:");
        String clientName = scanner.nextLine();
        contacts.add(clientName);
    }

    public void displayContacts() {
        int contactNumber = 1;
        for (String contact : contacts) {
            System.out.println(contactNumber++ + ". " + contact);
            System.out.println();
        }
    }

    public void displayOneContact() {
        System.out.println("Please provide an ordinal number of a contact to be shown:");
        int ordinalNumber = Integer.parseInt(scanner.nextLine());
        System.out.println(contacts.get(--ordinalNumber));
        System.out.println();
    }

    public void deleteContact() {
        System.out.println("Please provide an ordinal number of a contact to be deleted:");
        int ordinalNumber = scanner.nextInt();
        contacts.remove(--ordinalNumber);
    }

    public void displayContactByName(){
        System.out.println("Please provide contact's name:");
        String name = scanner.nextLine();
//        System.out.println(contacts.get(String name));
    }

}