package CRT2025.OOPS.inheritance.HybridInheritence;

public class Flight extends Vehicle {
    String Seat;
    String Plane;
    public Flight(){
        super();
    }

    public String getSeat() {
        return Seat;
    }
    public void setSeat(String seat) {
        Seat = seat;
    }
    public String getPlane() {
        return Plane;
    }
}
