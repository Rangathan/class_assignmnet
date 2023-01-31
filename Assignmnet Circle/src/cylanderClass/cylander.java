package cylanderClass;

public class cylander {
    int height;
    int radius;

    public cylander(){

    }
    public cylander(int height, int radius){
        this.height = height;
        this.radius = radius;
    }

    public int getVolume(){
        return (int) (Math.PI*this.radius*this.radius*this.height);
    }
}
