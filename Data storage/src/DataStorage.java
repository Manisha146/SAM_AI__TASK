import java.util.ArrayList;
import java.util.List;

/**
 * Handles storing and managing data entries.
 * Task 4: Data Storage
 */
public class DataStorage {

    private final List<String> dataList;

    // Create an empty list for storing data
    public DataStorage() {
        dataList = new ArrayList<>();
    }

    // Add a new data entry
    public void addEntry(String entry) {

        if (entry == null || entry.trim().isEmpty()) {
            System.out.println("Error: Entry cannot be empty.");
            return;
        }

        entry = entry.trim();

        // Prevent duplicate entries
        if (dataList.contains(entry)) {
            System.out.println("Entry already exists: " + entry);
            return;
        }

        dataList.add(entry);

        System.out.println("Entry added successfully: " + entry);
    }

    // Display all stored entries
    public void displayEntries() {

        System.out.println("\n========== STORED DATA ==========");

        if (dataList.isEmpty()) {
            System.out.println("No data available.");
        } else {

            for (int i = 0; i < dataList.size(); i++) {
                System.out.println((i + 1) + ". " + dataList.get(i));
            }

            System.out.println("---------------------------------");
            System.out.println("Total Entries: " + dataList.size());
        }

        System.out.println("=================================\n");
    }

    // Remove an entry using its text
    public void removeEntry(String entry) {

        if (entry == null || entry.trim().isEmpty()) {
            System.out.println("Error: Entry cannot be empty.");
            return;
        }

        entry = entry.trim();

        if (dataList.remove(entry)) {
            System.out.println("Entry removed successfully: " + entry);
        } else {
            System.out.println("Entry not found: " + entry);
        }
    }

    // Remove an entry using its index
    public void removeEntryByIndex(int index) {

        if (index < 0 || index >= dataList.size()) {
            System.out.println("Error: Invalid entry number.");
            return;
        }

        String removedEntry = dataList.remove(index);

        System.out.println(
                "Entry removed successfully: " + removedEntry
        );
    }

    // Check whether the list is empty
    public boolean isEmpty() {
        return dataList.isEmpty();
    }

    // Return total number of entries
    public int getTotalEntries() {
        return dataList.size();
    }
}