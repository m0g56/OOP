public class Critter {
    private String name;

    public Critter (String name) {
        this.name = name;
    }

    public void poke() {
        System.out.println(name + " was poked.");
    }

    public void eat(Critter c) {
        System.out.println(c.name + " was eaten by " + name + ".");
    }
}



