
package mid2_fall22;
class fruit{
    void eat(){
        System.out.print("eating");
    }
}
class apple extends fruit{
    
}
class orange extends fruit{

     void orangeat(){
         System.out.print("orange ");
         super.eat();
     }   
    
}
class gd extends apple{
   void gdap(){
         System.out.print("golden del ");
         super.eat();
     } 
}
class mi extends apple{
    
}

public class q5 {
    public static void main(String[] args) {
        fruit f=new gd();
        orange o=new orange();
        gd gd1= new gd();
        //f.eat();
        o.orangeat();
        gd1.gdap();
        
    }
 
}
