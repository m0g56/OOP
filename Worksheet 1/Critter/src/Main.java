public class Main {

    public static void main(String[] args) {
        Critter bug = new Critter("LeBron");
        Critter bug2 = new Critter("ElBron");
        bug.poke();
        bug.eat(bug2);
    }


}
