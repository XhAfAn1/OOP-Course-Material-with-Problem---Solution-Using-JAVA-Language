
package final1;

class NegValueException extends Exception{
    NegValueException(){
        
    }
    NegValueException(String m){
        super(m);
    }
} 

class Vehicle<T>{
    private T vehicleInfo;
    private double mileage;
    private int capacity;
    Vehicle(){
        
    }
    Vehicle(T info,double m, int c) throws NegValueException{
         if (m < 0 || c < 0) {
            throw new NegValueException("Mileage and capacity must be non-negative");
        }
        vehicleInfo=info; 
        mileage=m;
        capacity=c;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) throws NegValueException{
        if(mileage<0)
            throw new NegValueException("Mileage cant be negetive");
        else
        this.mileage = mileage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(T vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }
    public String toString() {
        return "Vehicle Information: " + vehicleInfo +
               "\nMileage: " + mileage + " km/l" +
               "\nCapacity: " + capacity + " passengers";
    }
    
}


public class q1and2 {

    public static void main(String[] args) {
       try {
            Vehicle<String> car = new Vehicle<>("Toyota Camry", 12.5, 5);
            System.out.println(car);
            
            Vehicle<Integer> bus = new Vehicle<>(12345, 8.0, 30); // This will throw NegativeValueException
            System.out.println(bus);
        } catch (NegValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
