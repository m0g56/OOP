public class Id<K> {
    K field;

    public Id(K field) {
        this.field = field;
    }

}

class Tuple<K,L> {
    K field1;
    L field2;
    public Tuple(K field1, L field2){
        this.field1 = field1;
        this.field2 = field2;
    }

}
class Triple<K,L,M> {
    K field3;
    L field4;
    M field5;
    public Triple(K field3, L field4, M field5){
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
    }
}