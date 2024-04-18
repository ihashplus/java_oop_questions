
public class Book {
    private String title;
    private int pages;
    private double price;

    public Book(String title, int pages, double price){
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }

    public void displayInfo() {
        System.out.println("title: " + title
                + ", pages: " + pages
                + ", price: $" + price);
    }
}