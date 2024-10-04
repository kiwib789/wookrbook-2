package donutloop;

public class DonutShop {
    public static void main(String[] args) {
        Donut d = new Donut();
        d.description = "Big Fluffy Donut with cherry on top";
        d.calories = 499;
        d.price= 3.99;
        Donut d2 = new Donut();
        d2.description = "Chocolate donut";
        d2.calories = 399;
        d2.price= 1.99;
    printDonut(d);
    printDonut(d2);
    }
    public static void printDonut(Donut d){
        System.out.println(d.description);
        System.out.printf(" which costs $%.2f\n", d.price);
    }
}
