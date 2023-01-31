package circleclass;

public class circle {
    int radius;
    int diameter;


    public circle(){
        
    }

    public circle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }


    public int getArea(){
        return (int) (this.radius*this.radius*Math.PI);
    }
    public int getParameter(){
        return (int) (this.diameter*Math.PI);
    }
}
