package AddressBook;

import java.util.*;

public class MenuInteraction {
    Scanner scanner = new Scanner(System.in);
    public final List<Client> contacts = new ArrayList<>();
    public final Set<String> locations = new HashSet<>();
    public final HashMap<String, Client> clientsNames = new HashMap<>();
    public final HashMap<Integer, Client> phoneNumber = new HashMap<>();
    SaveAsTxtFile saveTxt = new SaveAsTxtFile();

    public void addContact() {

        System.out.println("Please provide contact name:");
        String clientName = scanner.nextLine();
        while (!clientName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input provided, please insert correct data:");
            clientName = scanner.nextLine();
        }

        System.out.println("Please provide contact's location:");
        String clientLocation = scanner.nextLine();
        while (!clientLocation.matches("[a-zA-Z]+")) {
            System.out.println("Invalid input provided, please insert correct data:");
            clientLocation = scanner.nextLine();
        }

        System.out.println("Please provide client's phone number:");
        int clientPhoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Was the client contacted?(answer with Y/N):");
        String isContactedString = scanner.nextLine();
        while (!isContactedString.matches("[YN]")) {
            System.out.println("Invalid input provided, please answer with Y/N:");
            isContactedString = scanner.nextLine();
        }

        boolean isContacted;

        isContacted = isContactedString.equals("Y");

        Client client = new Client(clientName, clientLocation, clientPhoneNumber, isContacted);

        locations.add(clientLocation);
        contacts.add(client);
        clientsNames.put(clientName, client);
        phoneNumber.put(clientPhoneNumber, client);

    }

    public void deleteContact() {
        System.out.println("Please provide an ordinal number of a contact to be deleted:");
        int ordinalNumber = scanner.nextInt();
        contacts.remove(--ordinalNumber);
    }

    public void saveAsTxt() {
        saveTxt.saveFile();
    }
}