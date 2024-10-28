public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, double cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, double cost) {
        this(title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Director: " + director);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Cost: $" + cost);
        System.out.println();
    }

    public void play() {
        if (length > 0) {
            System.out.println("Playing DVD: " + title);
            System.out.println("DVD length: " + length + " minutes");
        } else {
            System.out.println("Cannot play DVD: " + title + " (invalid length)");
        }
        System.out.println();
    }
}
