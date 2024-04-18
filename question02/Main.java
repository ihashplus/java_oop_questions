public class Main {
    public static void main(String[] args) {
        Car  car = new Car("BMW", 2022, "White");

        car.displayInfo();
        car.setColor("Blue");
        System.out.println(car.getName());
        System.out.println(car.numberOfYears(2024) + " years");
        car.displayInfo();
    }
}

