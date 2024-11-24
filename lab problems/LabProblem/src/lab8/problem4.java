
package lab8;
class GeometricObject{
      private String color = "white";
    private boolean filled;


    public GeometricObject() {

    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {
        return "color: " + color + " and filled: "+ filled;
    }
}
class triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    triangle(){
        side1=1;
        side2=1;
        side3=3;
    }
    triangle(double side1, double side2, double side3,String color, boolean filled) throws IllegalTriangleException{
        super(color,filled);
        setSides(side1, side2, side3);
    }
    
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
     private void setSides(double side1, double side2, double side3) throws IllegalTriangleException{
         
        if (side1 + side2 < side3) {
            throw new IllegalTriangleException("side1 + side2 < side3");
        } else if (side2 + side3 < side1) {
            throw new IllegalTriangleException("side2 + side3 < side1");
        } else if (side1 + side3 < side2) {
            throw new IllegalTriangleException();
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

        }

    }
    
    double getArea(){
        double s=(side1+side2+side3)/2;
        double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        return area;
    }
    double getPerimeter() {

        double p = this.side1 + this.side2 + this.side3;

        return p;

    }
    public String toString(){
        String s="Tringle: side1= "+side1+" side2= "+side2+" side3= "+side3+ " and color: " + getColor() + " and filled: "+ isFilled();
        return s;
    }
    
    
}


    class IllegalTriangleException extends Exception {

     IllegalTriangleException() {

    }   
        
     IllegalTriangleException(String s) {
        super(s);
    }

  

}

public class problem4 {

    public static void main(String[] args) {

        try {
            triangle t1 = new triangle(1.0, 0.1, 0.2,"Blue",true);
            System.out.println("The Triangle's area is " + t1.getArea());
            System.out.println(t1);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
        

        try {
            triangle t2 = new triangle(1.0, 1.0, 1.0,"Red",false);
            System.out.println("The Triangle's area is " + t2.getArea());
            System.out.println(t2);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }

    }
    
}
