package CRT2025.OOPS.encapsulation;

class UserDetailsForFlightBooking {
    private String name;
    private String email;
    private String mobile;
    private String address;
    private String city;
    private String state;

    public UserDetailsForFlightBooking() {
        this.name = "Amit";
        this.email = "amit@example.com";
        this.mobile = "9876543210";
        this.address = "123 Main Street";
        this.city = "Amravati";
        this.state = "Maharashtra";
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        UserDetailsForFlightBooking user = new UserDetailsForFlightBooking();
        System.out.println("Name: " + user.getName());
        System.out.println("City: " + user.getCity());
    }
}