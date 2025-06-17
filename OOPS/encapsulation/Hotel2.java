package CRT2025.OOPS.encapsulation;


public class Hotel2 {
    private String name;
    private String location;
    private int numberOfRooms;
    private boolean isAvailable;

    public Hotel2() {
        this.name = "Default Hotel";
        this.location = "Unknown";
        this.numberOfRooms = 0;
        this.isAvailable = false;
    }

    public void setHotelDetails(String hotelName, String hotelLocation, int rooms) {
        this.name = hotelName;
        this.location = hotelLocation;
        this.numberOfRooms = rooms;
        this.isAvailable = rooms > 0;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    public void displayDetails() {
        System.out.println("Hotel Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("Total Rooms: " + getNumberOfRooms());
        System.out.println("Availability: " + (getAvailability() ? "Yes" : "No"));
    }

    public void bookRoom() {
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
        Hotel2 h = new Hotel2();
        h.setHotelDetails("Taj", "Delhi", 2);
        h.displayDetails();
        h.bookRoom();
        h.bookRoom();
        h.bookRoom();
        h.displayDetails();
    }
}
