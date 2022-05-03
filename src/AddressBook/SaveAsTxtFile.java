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
//
//    public void createFile() {
//        System.out.println("Please provide a name for a new file: ");
//        Scanner scanner = new Scanner(System.in);
//        String newFileName = scanner.nextLine();
//        try {
//            File newFile = new File(newFileName);
//            if (newFile.createNewFile()) {
//                System.out.println("File created: " + newFile.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (
//                IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeFile() {
//        System.out.println("Please provide ");
//        try {
//            FileWriter myWriter = new FileWriter(newFileName);
//            myWriter.write("Okay");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (
//                IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//    }

