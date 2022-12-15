package OOP;

class Vehicle {
    int passengers;
    int fuelCapacity;
    int mpg;
    Vehicle (int p, int f, int m) {
        passengers = p;
        fuelCapacity = f;
        mpg = m;
    }
    int range() {
        return fuelCapacity * mpg;
    }

    float fuelNeeded(int miles) {
        return (float) miles / mpg;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(10, 20, 200);
        int range;
        float gallons;

        // compute the range assuming a full tank of gas
        range = minivan.range();
        gallons = minivan.fuelNeeded(250);
        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range);
        System.out.println("To go 250 miles minivan needs " + gallons + " gallons of fuel.");

    }
}

// you can put both classes in the same file, since there is only one main() method in VehicleDemo class
// upon compilation with javac, there are two .class files that are created
// Vehicle and VehicleDemo need not be in the same source file