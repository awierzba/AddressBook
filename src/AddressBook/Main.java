package AddressBook;

// TODO Bilbo challange: Napisanie aplikacji, która będzie robiła książkę adresową, żebyś mógł dodawać nowe kontakty, wyświetlać listę kontaktów, wyświetlić pojedynczy kontakt, usunąć kontakt (klasa ArrayList)

/* Plan aplikacji:

Funkcjonalności:
- Wyświetlanie wszystkich kontaktów
- Wyświetlanie pojedynczego kontaktu
- Dodawania nowego kontaktu
- Usuwanie kontaktu

 */

// TODO format code for refactoring - swap number for variables declared at the very beginning of the code

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Jerry Springer");
        contacts.add("Jeff Bezos");

        Scanner scanner = new Scanner(System.in);

        boolean cont = true;

        int button1 = 1;
        int button2 = 2;
        int button3 = 3;
        int button4 = 4;

        while (cont) {
            System.out.println("Hello!");
            System.out.println("- To show list of contacts press " + button1 + ".");
            System.out.println("- To show one contact press " + button2 + ".");
            System.out.println("- To add a contact press " + button3 + ".");
            System.out.println("- To delete a contact press " + button4 + ".");

            int number = scanner.nextInt();

            if (number == button1) {
                System.out.println(contacts);
            } else if (number == button2) {
                System.out.println("Please provide an ordinal number of a contact to be shown");

            } else if (number == button3) {
                System.out.println("Please provide first name and last name of new contact");
                scanner.nextLine();
                String contactName = scanner.nextLine();
                contacts.add(contactName);
                System.out.println("Contact has been added successfully!");

            } else if (number == button4) {
                // TODO I should add an ordinal number to make the deletion and showing one contact easier
                System.out.println("Please provide first name and last name of contact to be deleted");
                scanner.nextLine();
                String contactName = scanner.nextLine();
                contacts.add(contactName);
                System.out.println("Contact has been successfully deleted!");
            } else {
                // TODO after operation finished - "Do you wish to go back to the main menu?" Y/N
                System.out.println("Operation impossible to perform");
                cont = false;
            }
            System.out.println("Do you wish to go back to the main menu? Press Y/N");
            scanner.nextLine();
            String backToMenu = scanner.nextLine();
            switch (backToMenu) {
                case "Y":
                    continue;
                case "N":
                    cont = false;
            }


//        if (number == 1) {
//            System.out.println(contacts);
//        } else if (number == 2) {
//            System.out.println("Please provide first name and last name of new contact");
//            String contactName = scanner.nextLine();
//            contacts.add(contactName);
//        } else {
//            System.out.println("Operation impossible to perform");

        }
    }
}

