package AddressBook;

// TODO format code for refactoring - swap number for variables declared at the very beginning of the code

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int contactId = 1, button1 = 1, button2 = 2, button3 = 3, button4 = 4;

        ArrayList<String> contacts = new ArrayList<>();
        contacts.add(contactId++ + ". " + "Jerry Springer ");
        contacts.add(contactId++ + ". " + "Jeff Bezos ");

        Scanner scanner = new Scanner(System.in);

        boolean cont = true;

        while (cont) {
            System.out.println("Hello!");
            System.out.println("- To show list of contacts press " + button1 + ".");
            System.out.println("- To show one contact press " + button2 + ".");
            System.out.println("- To add a contact press " + button3 + ".");
            System.out.println("- To delete a contact press " + button4 + ".");

            int number = scanner.nextInt();

            if (number == button1) {
                System.out.println(contacts);
                scanner.nextLine();

            } else if (number == button2) {
                System.out.println("Please provide an ordinal number of a contact to be shown");
                int contactID = scanner.nextInt();
                System.out.println(contacts.get(--contactID));
                scanner.nextLine();

            } else if (number == button3) {
                System.out.println("Please provide first name and last name of new contact");
                scanner.nextLine();
                String contactName = scanner.nextLine();
                contacts.add(contactId++ + ". " + contactName);
                System.out.println("Contact has been added successfully!");

            } else if (number == button4) {
                System.out.println("Please provide an ordinal number of a contact to be deleted");
                int contactID = scanner.nextInt();
                contacts.remove(--contactID);
                System.out.println("Contact has been successfully deleted!");
                scanner.nextLine();

                //TODO test operations out of scope of regular use
            } else {
                System.out.println("Operation impossible to perform");
            }
            System.out.println("Do you wish to go back to the main menu? Press Y/N");
            String backToMenu = scanner.nextLine();
            switch (backToMenu) {
                case "Y":
                    continue;
                case "N":
                    cont = false;
            }
        }
    }
}

