import java.lang.Math;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String triangleType(){
        if (this.a == this.b){
            if (this.b == this.c){
                return("Equilateral");
            }
            else{
                return("Isosceles");
            }
        }
        if (Math.pow(this.a,2)+Math.pow(this.b,2) == Math.pow(this.b,2)){
            return("RightAngle");
        }
        else{
            return("Scalene");
        }
    }
}

