package CRT2025.OOPS.inheritance;

public class VehicleDemo {
    public static void main(String[] args) {

        Flight f = new Flight();
        f.setSpeed(900);
        f.setSeats(280);
        f.setFuel(200);

        f.getFlightDetails();

    }

    public VehicleDemo() {
    }
}

class Vehicle{
    int speed= 300;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Flight extends Vehicle{
    int seats=250;
    int fuel=100;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;

    }
        public void getFlightDetails(){
            System.out.println("Flight Speed: " + getSpeed());
            System.out.println("Seats: " + getSeats());
            System.out.println("Fuel: " + getFuel());

        }


}



