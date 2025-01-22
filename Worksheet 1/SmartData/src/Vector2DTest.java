import java.util.Objects;

public class Vector2DTest {

    public static void runVectorTest() {
        Vector2D a = new Vector2D(10.0,10.0);

        if (a.distance(new Vector2D(13,14)) == 5){
            System.out.println("distance works");
        }
        if (Objects.equals(a.add(new Vector2D(5, 5)), new Vector2D(15, 15))) {
            System.out.println("add works");
        }

        if (Objects.equals(a.scale(5),new Vector2D(50,50))){
            System.out.println("scale works");
        }
    }

    public static void runIntTest() {
        IntBox a = new IntBox(10).add(10);
        System.out.println(a); // "IntBox(20)"
        System.out.println(a.multiply(10)); // "IntBox(200)"
        System.out.println(a); // "IntBox(200)"

    }


}
