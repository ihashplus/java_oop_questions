abstract class Animal {
    public abstract void makeSound();

    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
}