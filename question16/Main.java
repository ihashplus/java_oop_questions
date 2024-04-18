import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Lina");
        names.add("Muhjah");
        names.add("Anas");
        names.add("Bassam");

        System.out.println("the names after add: " + names);
        names.remove("Anas");
        System.out.println("the names after delete: " + names);

        names.add("Lina");
        names.add("Muhjah");
        names.add("Anas");
        names.add("Bassam");
        System.out.println("LinkedList: " + names.size());
        System.out.println("all the names: " + names);
    }
}