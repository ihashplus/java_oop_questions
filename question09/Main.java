import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(38);
        numbers.add(9);
        numbers.add(0);
        numbers.add(97);
        numbers.add(44);

        System.out.println(numbers);;
        System.out.println("9 in list? " + numbers.contains(9));
        System.out.println("size: " + numbers.size());
        numbers.remove(1);
        numbers.remove(3);
        System.out.println(numbers);;
        System.out.println("size: " + numbers.size());
    }
}