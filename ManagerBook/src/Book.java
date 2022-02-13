public class Book {
    private String name;
    private String author;
    private int price;
    private int number;
    private double weight;

    public Book(String name, String author, int price, int number, double weight) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.number = number;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTotalPrice() {
        double totalPrice = price * number;
        return totalPrice;
    }

    public double getTotalWeight() {
        double totalWeight = weight * number;
        return totalWeight;
    }
}
