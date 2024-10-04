package donutloop;

public class Donut {
    String description;
    int calories;
    double price;

    @Override
    public String toString() {
        return "Donut{" +
                "description='" + description + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }

}
