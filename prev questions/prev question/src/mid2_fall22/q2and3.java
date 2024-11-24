
package mid2_fall22;
import java.util.ArrayList;


abstract class Patient{
    int id;
    String name;
    Patient(){
        
    }
    Patient(int id,String name){
        this.id=id;
        this.name=name;
        
    }
    abstract double bill();
    
    void display(){
        System.out.println("Id: "+id+" Name: "+name);
    }
}

class OutdoorPatient extends Patient{
   double visitingFee;
   OutdoorPatient(){
       
   }
   OutdoorPatient(int id,String name,double fee){
       super(id,name);
       visitingFee=fee;
   }

   double bill(){
       return visitingFee;
   }

   void display(){
      System.out.println("Id: "+id+" Name: "+name+" visitingFee: "+visitingFee); 
   }
}
class IndoorPatient extends Patient{
    double bedFee;
    double medicineFee;
    double labTestFee;
    
    IndoorPatient(){
        
    }
    IndoorPatient(int id,String name,double bedfee,double medifee,double labfee ){
       super(id,name);
       bedFee=bedfee;
       medicineFee=medifee;
       labTestFee=labfee;
    }
    double bill(){
        return bedFee+medicineFee+labTestFee;
    }
    
    void display(){
      System.out.println("Id: "+id+" Name: "+name+" Bed Fee: "+bedFee+" medicine Fee: "+medicineFee+" Lab test Fee :"+labTestFee); 
   }
    
}


public class q2and3 {
    public static void main(String[] args) {
        ArrayList<Patient> patientList=new ArrayList<>();
         
        IndoorPatient indoorPatient1 = new IndoorPatient(1, "John Doe", 1000, 500, 300);
        IndoorPatient indoorPatient2 = new IndoorPatient(2, "Jane Smith", 1500, 700, 400);

        OutdoorPatient outdoorPatient1 = new OutdoorPatient(3, "Mike Johnson", 200);
        OutdoorPatient outdoorPatient2 = new OutdoorPatient(4, "Emily Brown", 250);
        
        patientList.add(indoorPatient1);
        patientList.add(indoorPatient2);
        patientList.add(outdoorPatient1);
        patientList.add(outdoorPatient2);
        
        for (int i = 0; i < patientList.size(); i++) {
            patientList.get(i).display();
            System.out.println("Bill: "+ patientList.get(i).bill());
            
        }
        
        
        double totalIndoorBill = 0;
        int numIndoorPatients = 0;
        for (int i = 0; i < patientList.size(); i++) {
            if(patientList.get(i) instanceof IndoorPatient){
                totalIndoorBill += patientList.get(i).bill();
                numIndoorPatients++;
            }
                
        }
        double averageIndoorBill = totalIndoorBill / numIndoorPatients;
        System.out.println("Average bill of IndoorPatient type patients: " + averageIndoorBill);
    

    }
}
