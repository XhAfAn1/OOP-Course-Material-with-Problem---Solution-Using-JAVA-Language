package final2;
import java.util.Arrays;

class Vehicle implements Comparable<Vehicle>{
    private String vehicleName;
    private double mileage;
    private int capacity;
    int a;

    public Vehicle(String vehicleName,int a, double mileage, int capacity) {
        this.vehicleName = vehicleName;
        this.mileage = mileage;
        this.capacity = capacity;
        this.a=a;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public double getMileage() {
        return mileage;
    }

    public int getCapacity() {
        return capacity;
    }


    public int compareTo(Vehicle other) {
//        // Compare based on mileage
//        int mileageComparison = Double.compare(this.mileage, other.mileage);
//        if (mileageComparison != 0) {
//            return mileageComparison;
//        }
//
//        // If mileage is the same, compare lexicographically by vehicle name
//        return this.vehicleName.compareTo(other.vehicleName);
    
    if(this.mileage > other.mileage){
            return 1;
        }
    else if(this.mileage < other.mileage)
    return -1;
    
    else return this.vehicleName.compareTo(other.vehicleName);
    }

    @Override
    public String toString() {
        return "Vehicle Name: " + vehicleName + ", Mileage: " + mileage + ", Capacity: " + capacity;
    }
}

public class q4 {
    public static void main(String[] args) {
    
        Vehicle[] vehicles = new Vehicle[]{
            new Vehicle("Car",2, 12.4, 4),
            new Vehicle("Motorcycle",3, 40.2, 2),
            new Vehicle("Truck",1, 15.8, 6),
            new Vehicle("Bicycle",5, 0.0, 1),
            new Vehicle("Bus",4, 10.5, 40)
        };

       
        Arrays.sort(vehicles);

        System.out.println("Vehicles sorted by mileage (ascending):");
//        for (Vehicle vehicle : vehicles) {
//            System.out.println(vehicle);
//        }
        for (int i = 0; i <vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }

        // Modify compareTo to compare based on vehicle name (lexicographically)
        Arrays.sort(vehicles, (v1, v2) -> v1.getVehicleName().compareTo(v2.getVehicleName()));

        System.out.println("\nVehicles sorted by name (lexicographically):");
//        for (Vehicle vehicle : vehicles) {
//            System.out.println(vehicle);
//        }
    for (int i = 0; i <vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        }
     
    }

