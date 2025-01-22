import java.lang.Math;
public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Vector2D add(Vector2D v){
        return (new Vector2D(this.x+v.x, this.y+v.y));
    }


    public double distance(Vector2D v) {
        return(Math.sqrt(Math.pow(this.x-v.x,2) + Math.pow(this.y-v.y,2)));
    }

    public Vector2D scale(double f) {
        return (new Vector2D(this.x*f,this.y*f));
    }
}
