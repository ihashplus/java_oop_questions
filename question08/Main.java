
public class Main {
    public static void main(String[] args) {
        // Polymorphism: Creating objects of different types but treated uniformly
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}