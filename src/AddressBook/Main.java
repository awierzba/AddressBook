package AddressBook;

// TODO practice Address Books! - add phone number, location (with hashmap - no doubles), make a search by phone number + throw exceptions

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MenuInteraction menuInteraction = new MenuInteraction();

        boolean cont = true;

        while (cont) {
            System.out.println("Hello!");
            System.out.println("- To show list of contacts press " + 1 + ".");
            System.out.println("- To add a contact press " + 2 + ".");
            System.out.println("- To show one contact press " + 3 + ".");
            System.out.println("- To delete a contact press " + 4 + ".");
            System.out.println("- To EXIT press " + 5 + ".");

            int userInput = scanner.nextInt();

            //TODO - display guest by name

            switch (userInput) {
                case 1 -> menuInteraction.displayContacts();
                case 2 -> menuInteraction.addContact();
                case 3 -> menuInteraction.displayOneContact();
                case 4 -> menuInteraction.deleteContact();
                case 5 -> cont = false;
                case 6 -> menuInteraction.displayContactByName();

            }
        }
    }
}

