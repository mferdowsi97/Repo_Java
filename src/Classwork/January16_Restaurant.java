package Classwork;

public class January16_Restaurant {
    /**
     * Create a restaurant class with attribute name, guestCapacity, guestCount
     * 1. Create a method that tells user if the seats are available
     * 2. Create a method that seatsParty
     * 3. Create a method that removesParty
     * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
     * 5. Create a method that printsRestaurantSummary
     */

    private String name;
    private int guestCapacity;
    private int guestCount;
    private int guestArrival;
    private int guestLeft;

    public void printRestaurantSummary () {
        System.out.println("Name " + name);
        System.out.println("Guest Capacity " + guestCapacity);
        System.out.println("Guest Count " + guestCount);
    }

    public boolean seatsAvailable () {
        boolean seatsAreAvailable = true;
        boolean seatsAreNotAvailable = false;

        if (guestCapacity - guestCount < guestCapacity) {
            return seatsAreAvailable;
        } else {
            return seatsAreNotAvailable;
        }
    }


    public void setSeatsParty() {

    }

    public void hostOpening (String name, int guestCapacity) {
        this.name = name;
        this.guestCapacity = guestCapacity;
    }
}
