
package final1;

interface Vehicle{
     void changeGear(int a);
     void speedUp(int a);
     void applyBrakes(int a);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    Bicycle(){
        
    }
    Bicycle(int a,int b){
        gear=a;
        speed=b;
    }
    public void changeGear(int a){
        gear=a;
    }
    public void speedUp(int a){
        speed+=a;
    }
    public void applyBrakes(int a){
        speed-=a;
    }
    public String toString() {
        return "Bicycle - Gear: " + gear + ", Speed: " + speed + " km/h";
    }

}
    class Bike implements Vehicle{
    int speed;
    int gear;
    Bike(){
        
    }
    Bike(int a,int b){
        gear=a;
        speed=b;
    }
    public void changeGear(int a){
        gear=a;
    }
    public void speedUp(int a){
        speed+=a;
    }
    public void applyBrakes(int a){
        speed-=a;
    }
    public String toString() {
        return "Bike - Gear: " + gear + ", Speed: " + speed + " km/h";
    }

}
public class q5 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(3);
        bicycle.speedUp(15);
        bicycle.applyBrakes(5);
        System.out.println(bicycle);

        Bike bike = new Bike();
        bike.changeGear(4);
        bike.speedUp(30);
        bike.applyBrakes(10);
        System.out.println(bike);
    }
}
