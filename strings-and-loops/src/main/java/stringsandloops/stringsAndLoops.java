package stringsandloops;

public class stringsAndLoops {
    public static void main(String[]args)
    { // Hard way to do things
        String s = "Hello World";
        System.out.println("Milk");
        System.out.println("Cereal");
        System.out.println("Bread");
        System.out.println("Chips");
        System.out.println("Queso");
        System.out.println("Guac");
        System.out.println("Bagels");
        System.out.println("Pepper");

        String[] list = {"Milk","Cereal","Bread","Chips","Queso","Guac","Bagels","Pepper"};
        //* to not repeat yourself
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
            }
        }

    }


