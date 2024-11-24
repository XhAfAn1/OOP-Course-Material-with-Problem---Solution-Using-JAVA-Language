
package mid12020;

import java.util.Scanner;

class Rectangle{
    private double width;
    private double height;
    
    Rectangle(){
        
    }
    Rectangle(double w, double h){
        width=w;
        height=h;
    }
    
    public void setWidth(double w){
        width=w;
    }
    public void setHeight(double h){
        height=h;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    
    
    void Get(){
        System.out.println("width is: "+width+" height is: "+height);
    }
    
    public double CalculateArea(){
         return width*height;
     }
    
    public String toString(){
        String s="Rectangle has Width "+width+" and height "+height;
        return s;
    }
    
    
    
}



public class midq4 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        //Rectangle r1= new Rectangle(3.5,4.5);    
        //String s=r1.toString();
        //System.out.println(s);
        //System.out.println(r1.toString());
        
        Rectangle[] r= new Rectangle[4];
        
        for (int i = 0; i < 4; i++) {
            r[i]=new Rectangle();
            System.out.println("Enter width and height :");
            r[i].setWidth(inp.nextDouble());
            r[i].setHeight(inp.nextDouble());
        }        
        
//        if(isSimilar(r[1],r[2]))
//            System.out.println("similar Rectangle");
//        else
//            System.out.println("not smimilar");
        
       
    }
    public static boolean isSimilar(Rectangle R1,Rectangle R2){
        if(R1.getHeight()==R2.getHeight() && R1.getWidth()==R2.getWidth())
            return true;
        else
            return false;
    }
}
