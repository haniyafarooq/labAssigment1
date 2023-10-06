
import java.util.ArrayList;
import java.util.List;
class Library {
    private List<LibraryItem> collection;


    public Library() {
        this.collection = new ArrayList<>();
    }


    public void addItem(LibraryItem item) {
        collection.add(item);
    }


    public void borrowItem(LibraryItem item) {
        if (collection.contains(item)) {
            item.setBorrowed(true);
        } else {
            System.out.println("Item not found in the library.");
        }
    }


    public void returnItem(LibraryItem item) {
        if (collection.contains(item)) {
            item.setBorrowed(false);
        } else {
            System.out.println("Item not found in the library.");
        }
    }
    public void displayAvailableItems() {
        System.out.println("Available Items:");
        for (LibraryItem item : collection) {
            if (!item.isBorrowed()) {
                System.out.println(item.getTitle());
            }
        }
    }


    public void displayBorrowedItems() {
        System.out.println("Borrowed Items:");
        for (LibraryItem item : collection) {
            if (item.isBorrowed()) {
                System.out.println(item.getTitle());
            }
        }
    }
}