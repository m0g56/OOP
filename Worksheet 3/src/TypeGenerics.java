import java.util.ArrayList;
import java.util.List;

public class TypeGenerics {
    /*static boolean isEqual(Object left, Object right) {
        return left.equals(right);
    }*/

    public static <T> boolean isEqual1(T left, T right) {
        return left.equals(right);
    }
    public static <T> List<T> reverse(List<T> listA){
        List<T> listB = new ArrayList<T>();

        for (int i= listA.size() - 1; i>=0; i--){
            listB.add(listA.get(i));
        }
        return listB;
    }




}

/*Subtype Polymorphism - ability to use a subclass where a superclass is expected.
 Parametric Polymorphism (Generics) - to write a function or datatype so it can
  handle values without depending on their type.
  Ad-hoc Polymorphism - allowing a method or operator to apply to multiple different types
 */