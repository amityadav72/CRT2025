package CRT2025.OOPS.encapsulation;

public class Hotel1 {
    String name;
    String location;
    int numberOfRooms;
    boolean isAvailable;

    void setHotelDetails(String hotelName, String hotelLocation, int rooms) {
        name = hotelName;
        location = hotelLocation;
        numberOfRooms = rooms;
        isAvailable = rooms > 0;
    }

    void displayDetails() {
        System.out.println("Hotel Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Total Rooms: " + numberOfRooms);
        System.out.println("Availability: " + (isAvailable ? "Yes" : "No"));
    }

    void bookRoom() {
        if (isAvailable && numberOfRooms > 0) {
            numberOfRooms--;
            System.out.println("Room booked successfully!");
            if (numberOfRooms == 0) {
                isAvailable = false;
            }
        } else {
            System.out.println("No rooms available!");
        }
    }

    public static void main(String[] args) {
        Hotel1 h = new Hotel1();
        h.setHotelDetails("Taj", "Delhi", 2);
        h.displayDetails();
        h.bookRoom();
        h.bookRoom();
        h.bookRoom();
        h.displayDetails();
    }
}
