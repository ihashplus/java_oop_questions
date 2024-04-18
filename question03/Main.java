public class Main {
    public static void main(String[] args) {
        double n1 = 10.7;
        int n2 = convertToInteger(n1);
        System.out.println("Double value: " + n1);
        System.out.println("Integer value: " + n2);
    }

    public static int convertToInteger(double num){
        return (int)num;
    }
}

