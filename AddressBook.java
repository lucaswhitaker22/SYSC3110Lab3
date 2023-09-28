import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddies;

    public AddressBook() {this.buddies = new ArrayList<BuddyInfo>();}
    public static void main(String args[]) {
        System.out.println("Address Books");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {
        this.buddies.add(buddy);
    }

    public boolean removeBuddy(BuddyInfo buddy) {
        return this.buddies.remove(buddy);
    }
}
