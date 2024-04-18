public class Main {
    public static void main(String[] args) {
        String text1 = "Hello World";
        String text2 = "HellO WOrld";

        System.out.println(text1.equalsIgnoreCase(text2));
        System.out.println(text1.equals(text2));
        System.out.println(text1.compareTo(text2));
        System.out.println(text1.compareToIgnoreCase(text2));
    }
}

