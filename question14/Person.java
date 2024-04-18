interface Person {
    void introduceYourself();
}

class Teacher implements Person {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hello, I am " + name + " and I am a teacher.");
    }
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hi, I am " + name + " and I am a student.");
    }
}