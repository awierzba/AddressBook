package AddressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CustomException {

        Scanner scanner = new Scanner(System.in);
        MenuInteraction menuInteraction = new MenuInteraction();
        Display display = new Display();

        boolean cont = true;

        while (cont) {
            System.out.println("Hello!");
            System.out.println(1 + ". Show list of contacts");
            System.out.println(2 + ". Add a contact");
            System.out.println(3 + ". Display contact by name");
            System.out.println(4 + ". Display contact by phone number");
            System.out.println(5 + ". Display client's locations");
            System.out.println(6 + ". Delete a contact");
            System.out.println(7 + ". Save the contact list in the .txt file");
            System.out.println(8 + ". EXIT");

            try {
                int userInput = scanner.nextInt();

                if (userInput > 8 || userInput == 0) {
                    throw new CustomException("The provided number is incorrect.");
                }

                switch (userInput) {
                    case 1 -> display.displayAllContacts();
                    case 2 -> menuInteraction.addContact();
                    case 3 -> display.displayContactByName();
                    case 4 -> display.displayContactByPhoneNumber();
                    case 5 -> display.displayLocations();
                    case 6 -> menuInteraction.deleteContact();
                    case 7 -> menuInteraction.saveAsTxt();
                    case 8 -> cont = false;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid figure provided");
                cont = false;
            }
        }
    }
}

