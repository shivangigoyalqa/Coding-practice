import java.util.*;
/**
 * this class will calculate the area of Triangle, Rectangle, Square, Circle
 */
 public class CalculateArea {
 	public float circle (float radius) {
        return (3.14f * radius * radius);
    }
    public float triangle (float base, float altitude) {
        return (0.5f * base * altitude);
    }
    public float rectangle (float length, float width) {
        return (length * width);
    }
    public float square (float side) {
        return (side * side);
    }
 	public static void main (String args[]) {
 	 	Scanner sc = new Scanner(System.in); 
 	  String shape = sc.nextLine();
 	 	CalculateArea shape1 = new CalculateArea();
 	 	if (shape.equals("circle")) {
 	 		       System.out.println("Please enter radius");
            float radius = sc.nextFloat();
            System.out.println("Area of circlr is :" + shape1.circle(radius));


 	 	}else if (shape.equals("triangle")) {
 	 		System.out.println("Please enter base");
            float base = sc.nextFloat();
            System.out.println("Please enter altitude");
            float altitude = sc.nextFloat();
            System.out.println("Area of triangle is :" + shape1.triangle( base, altitude ));
        
        }else if (shape.equals("rectangle")) {
        	   System.out.println("Please enter length");
            float length = sc.nextFloat();
         	  System.out.println("Please enter width");
        	   float width = sc.nextFloat();
         	  System.out.println("Area of rectangle is :" + shape1.rectangle(length, width));
        
        }else if (shape.equals("square")) {
        	  System.out.println("Please enter side");
         	 float side = sc.nextFloat();
         	 System.out.println(shape1.square(side));
        
        } else {
          System.out.println("Wrong Choice");
        }

        }
    }




 
