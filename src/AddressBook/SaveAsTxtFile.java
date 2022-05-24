package AddressBook;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

public class SaveAsTxtFile {

    Scanner scanner = new Scanner(System.in);

    public void saveFile() {

        System.out.println("To create a new file press 1");
        System.out.println("To save list in an existing file press 2");

        int input = scanner.nextInt();

        if (input == 1) {
            System.out.println("Please provide new file name:");
            String newFileName = scanner.nextLine();
            try (
                    PrintWriter out = new PrintWriter(newFileName)) {
                out.println("Siema");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                out.close();
                out.println("File saved");
            }
        } else if (input == 2) {
            System.out.println("You chose 2");
        } else {
            System.out.println("Invalid number provided");
        }
    }
}

