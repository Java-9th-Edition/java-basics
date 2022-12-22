package Inheritance;

class Vehicle {
    private int passengers;
    private int fuelCapacity;
    private int mpg;
    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelCapacity = f;
        mpg = m;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    int range() {
        return fuelCapacity * mpg;
    }

    float fuelNeeded(int miles) {
        return (float) miles / mpg;
    }
}

class Truck extends Vehicle {
    private int cargoCapacity; // cargo capacity in pounds

    Truck (int p, int f, int m, int c) {
        super(p, f, m);
        cargoCapacity = c;
    }

    int getCargo() {
        return cargoCapacity;
    }

    void putCargo(int c) {
        cargoCapacity = c;
    }

}

public class TruckDemo {
    public static void main(String[] args) {
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelNeeded(dist);

        System.out.println("Semi can carry " + semi.getPassengers() + " with a cargo capacity of " + semi.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.");

        gallons = pickup.fuelNeeded(dist);

        System.out.println("Pickup can carry " + pickup.getPassengers() + " with a cargo capacity of " + pickup.getCargo() + " pounds.");
        System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");
    }
}
