
public class Car {
    private String name;
    private int year;
    private String color;

    public Car(String name, int year, String color){
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        year = newYear;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public void displayInfo(){
        System.out.println(name + " - " + year + " - " + color);
    }

    public int numberOfYears(int currentYear){
        return currentYear - year;
    }
}