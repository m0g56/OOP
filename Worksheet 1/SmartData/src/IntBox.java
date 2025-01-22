public class IntBox {
    private int x;

    public IntBox(int x) {
        this.x = x;
    }

    public IntBox add(int a) {
        x += a;
        return new IntBox(x);
    }

    public IntBox subtract(int a) {
        x -= a;
        return new IntBox(x);
    }

    public IntBox multiply(int a) {
        x *= a;
        return new IntBox(x);
    }


}
