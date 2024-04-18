// Superclass: Shape
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclasses: Circle and Rectangle (polymorphism)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}