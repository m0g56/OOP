import java.util.function.Function;


public class Maybe<T>{
    private T value;

    private Maybe(T value){
        this.value = value;
    }

    public static <T> Maybe<T> nothing() {
        return new Maybe<>(null);
    }
    public static <T> Maybe<T> just(T obj) {
        return new Maybe<>(obj);
    }

    public boolean isEmpty(){
        if (this.value == null){
            return true;
        }
        else return false;
    }
    public <U> Maybe<U> map(Function<T, U>){

    }
}
