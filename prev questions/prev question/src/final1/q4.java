
package final1;
import java.util.*;
import java.io.*;
class Bus {
    private int regNo;
    private String busName;
    Route busRoute;
    
    Bus(){
        
    }
    Bus(int a,String b,Route c){
        regNo=a;
        busName=b;
        busRoute=c;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public Route getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(Route busRoute) {
        this.busRoute = busRoute;
    }
    
    public String toString(){
        String s=" bus reg no ="+regNo+" bus name = "+busName+" "+busRoute;
        return s;
    }
    
    
}
class Route {
    private int routeNo;
    private String despartureStop;
    private String arrivalStop;

    Route(){
        
    }
    Route(int a,String b,String c){
        routeNo=a;
        despartureStop=b;
        arrivalStop=c;
    }

    public int getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }

    public String getDespartureStop() {
        return despartureStop;
    }

    public void setDespartureStop(String despartureStop) {
        this.despartureStop = despartureStop;
    }

    public String getArrivalStop() {
        return arrivalStop;
    }

    public void setArrivalStop(String arrivalStop) {
        this.arrivalStop = arrivalStop;
    }
    
    public String toString(){
        String s=" Route no ="+routeNo+" desparture Stop = "+despartureStop+" arrival Stop = "+arrivalStop;
        return s;
    }
}
public class q4 {
    public static void main(String[] args) throws Exception{
        ArrayList<Route> routes=new ArrayList<>();
        ArrayList<Bus> buses=new ArrayList<>();
        
        Route r1=new Route(101,"dhaka","sylhet");
        Route r2=new Route(202,"dhaka","ctg");
        
        Bus b1=new Bus(11,"Ena",r1);
        Bus b2=new Bus(22,"Hanif",r2);
        
        routes.add(r1);
        routes.add(r2);
        buses.add(b1);
        buses.add(b2);
        
        //System.out.println(b1);
        //System.out.println(b2);
        
        // this is the part u have to write in exam
        try(DataOutputStream output= new DataOutputStream(new FileOutputStream("buses.dat"))){
            for (int i = 0; i < buses.size(); i++) {
                output.writeInt(buses.get(i).getRegNo());
                output.writeUTF(buses.get(i).getBusName());
                output.writeInt(buses.get(i).busRoute.getRouteNo());
                output.writeUTF(buses.get(i).busRoute.getDespartureStop());
                output.writeUTF(buses.get(i).busRoute.getArrivalStop());
            }
            output.close();
        }
        //end of the answer
        
        try(DataInputStream input= new DataInputStream(new FileInputStream("buses.dat"))){
            System.out.println("regNo busName routeNo departureStop arrivalStop");
            while(input.available()!=0) {           
                System.out.print(input.readInt()+" ");
                System.out.print(input.readUTF()+" ");
                System.out.print(input.readInt()+" ");
                System.out.print(input.readUTF()+" ");
                System.out.println(input.readUTF()+" ");
                    
                
            }
            input.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
