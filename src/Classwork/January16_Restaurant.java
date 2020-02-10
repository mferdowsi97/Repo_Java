//package Classwork;
//
//public class January16_Restaurant {
    /**
     * Create a restaurant class with attribute name, guestCapacity, guestCount
     * 1. Create a method that tells user if the seats are available
     * 2. Create a method that seatsParty
     * 3. Create a method that removesParty
     * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
     * 5. Create a method that printsRestaurantSummary
     */


//        private String name;
//        private int guestCapacity;
//        private int guestCount;
//        public January16_Restaurant(String name, int guestCapacity) {
//            this.name = name;
//            this.guestCapacity = guestCapacity;
//        }
//
//        public boolean isSeatAvailable(int partySize) {
//            int seatsLeft = guestCapacity - guestCount;
//            return partySize <= seatsLeft;
//        }
//
//        public void seatParty(int partySize) { guestCount = guestCount + partySize; }
//
//        public void removeParty(int partySize) { guestCount = guestCount - partySize; }
//
//        public void printRestaurantSummary(){
//            System.out.println("Name: " + name + " Guest Capacity: " + guestCapacity + " GuestCount: " + guestCount);
//        }
//    }