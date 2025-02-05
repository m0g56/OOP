import java.util.ArrayList;
import java.util.List;

public class Test {

   public static void RunTest1() {
       Object ob1 = new Object();
       Object ob2 = ob1;
       if (TypeGenerics.isEqual1(ob1, ob2)) {
           System.out.println("equal!");
       }

       List<Integer> list1 = new ArrayList<>();
       list1.add(1);
       list1.add(2);
       list1.add(3);
       list1.add(4);

       System.out.println(list1);
       System.out.println(TypeGenerics.reverse(list1));

       List<String> list2 = new ArrayList<>();
       list2.add("p");
       list2.add("e");
       list2.add("n");
       list2.add("i");
       list2.add("s");

       System.out.println(list2);
       System.out.println(TypeGenerics.reverse(list2));
   }

   public static void RunTest2() {
       System.out.println("Beginning test 2...");
       Maybe<Integer> nonEmptyMaybe = Maybe.just(15);
       if (!nonEmptyMaybe.isEmpty()) {
           System.out.println("Not empty");
       }

       Maybe<Integer> emptyMaybe = Maybe.nothing();
       if (emptyMaybe.isEmpty()) {
           System.out.println("empty");
       }

       System.out.println("Test 2 complete.");

   }
}
