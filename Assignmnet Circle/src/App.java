import circleclass.circle;
import cylanderClass.cylander;

public class App {
    public static void main(String[] args) throws Exception {   

        circle newCircle = new circle(5 , 2);
        System.out.println("Area of Circle: " + newCircle.getArea()); 
        System.out.println("Parameter of Circle: " + newCircle.getParameter()); 


        cylander cylander1 =  new cylander(10, 5);
        System.out.println("Area of Cylander: " + cylander1.getVolume()); 
    }
}
