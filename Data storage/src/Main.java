import java.util.Scanner;

/**
 * Main class
 * SAM AI Technologies - Software Developer Internship
 * Task 4: Data Storage
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final DataStorage storage = new DataStorage();

    public static void main(String[] args) {

        boolean running = true;

        System.out.println("========================================");
        System.out.println("      DATA STORAGE MANAGEMENT SYSTEM");
        System.out.println("========================================");

        while (running) {

            printMenu();

            int choice = getIntegerInput("Enter your choice: ");

            switch (choice) {

                case 1:
                    addData();
                    break;

                case 2:
                    storage.displayEntries();
                    break;

                case 3:
                    removeByText();
                    break;

                case 4:
                    removeByIndex();
                    break;

                case 5:
                    running = false;

                    System.out.println("\nExiting application...");
                    System.out.println(
                            "Total entries: " +
                                    storage.getTotalEntries()
                    );
                    System.out.println("Thank you for using the application!");

                    break;

                default:
                    System.out.println(
                            "\nInvalid choice! " +
                                    "Please select an option between 1 and 5.\n"
                    );
            }
        }

        scanner.close();
    }

    // Display application menu
    private static void printMenu() {

        System.out.println("\n--------------- MENU ---------------");
        System.out.println("1. Add new entry");
        System.out.println("2. Display all entries");
        System.out.println("3. Remove entry by text");
        System.out.println("4. Remove entry by index");
        System.out.println("5. Exit");
        System.out.println("------------------------------------");
    }

    // Add new data
    private static void addData() {

        System.out.println("\n---------- ADD DATA ----------");

        System.out.print("Enter data: ");
        String entry = scanner.nextLine();

        storage.addEntry(entry);
    }

    // Remove data by text
    private static void removeByText() {

        if (storage.isEmpty()) {
            System.out.println("\nNo data available to remove.");
            return;
        }

        System.out.println("\n------- REMOVE BY TEXT -------");

        System.out.print("Enter exact data to remove: ");
        String entry = scanner.nextLine();

        storage.removeEntry(entry);
    }

    // Remove data by index
    private static void removeByIndex() {

        if (storage.isEmpty()) {
            System.out.println("\nNo data available to remove.");
            return;
        }

        storage.displayEntries();

        System.out.println("------- REMOVE BY INDEX -------");

        int index = getIntegerInput(
                "Enter entry number to remove: "
        );

        // User sees 1, 2, 3...
        // ArrayList uses 0, 1, 2...
        storage.removeEntryByIndex(index - 1);
    }

    // Handle invalid numeric input
    private static int getIntegerInput(String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input! Please enter a valid number."
                );
            }
        }
    }
}