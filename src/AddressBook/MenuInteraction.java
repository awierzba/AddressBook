package AddressBook;

import java.util.*;

public class MenuInteraction {
    Scanner scanner = new Scanner(System.in);
    private final List<Client> contacts = new ArrayList<>();
    private final Set<String> locations = new HashSet<>();
    private final HashMap<String, Client> clientsNames = new HashMap<>();
    private final HashMap<Integer, Client> phoneNumber = new HashMap<>();
    SaveAsTxtFile saveTxt = new SaveAsTxtFile();

    public void addContact() {

        System.out.println("Please provide contact name:");
        String clientName = scanner.nextLine();

        System.out.println("Please provide contact's location:");
        String clientLocation = scanner.nextLine();

        System.out.println("Please provide client's phone number:");
        int clientPhoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Was the client contacted?(answer with Y/N):");
        String isContactedString = scanner.nextLine();

        // TODO add ordinal numbers to the List

        boolean isContacted;

        isContacted = isContactedString.equals("Y");

        Client client = new Client(clientName, clientLocation, clientPhoneNumber, isContacted);

        locations.add(clientLocation);
        contacts.add(client);
        clientsNames.put(clientName, client);
        phoneNumber.put(clientPhoneNumber, client);
    }

    public void displayContacts() {
        for (Client client : contacts) {
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

    // TODO improve deleteContact

    public void deleteContact() {
        System.out.println("Please provide an ordinal number of a contact to be deleted:");
        int ordinalNumber = scanner.nextInt();
        contacts.remove(--ordinalNumber);
    }

    public void saveAsTxt() {
        saveTxt.saveFile();
    }
}

