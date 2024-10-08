package com.pluralsight.library;
import java.util.Scanner;
public class NeighborhoodLibraryApp {

 static Scanner scanner;

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  Book book1 = new Book(1, "To Kill a Mockingbird", "978-0-06-112008-4", false);
  Book book2 = new Book(2, "1984", "978-0-452-28423-4", true, "Kate Thomas");
  Book book3 = new Book(3, "The Great Gatsby", "978-0-7432-7356-5", false);
  Book book4 = new Book(4, "Pride and Prejudice", "978-1-59308-201-1", true, "Keely Lowder");
  Book book5 = new Book(5, "The Catcher in the Rye", "978-0-316-76948-0", false);
  Book book6 = new Book(6, "The Hobbit", "978-0-345-33968-3", true, "Sophia King");
  Book book7 = new Book(7, "Fahrenheit 451", "978-1451673319", false);
  Book book8 = new Book(8, "Moby-Dick", "978-1-5011-9682-3", false);
  Book book9 = new Book(9, "Brave New World", "978-0-06-085052-4", true, "Satoru Gojo");
  Book book10 = new Book(10, "The Diary of a Young Girl", "978-0-553-57710-9", false);
  Book book11 = new Book(11, "The Picture of Dorian Gray", "978-0-14-143957-0", false);
  Book book12 = new Book(12, "War and Peace", "978-0-14-303999-0", true, "Tyler Wright");
  Book book13 = new Book(13, "Jane Eyre", "978-0-14-243720-9", false);
  Book book14 = new Book(14, "The Alchemist", "978-0-06-112241-5", true, "Charlotte Brown");
  Book book15 = new Book(15, "The Grapes of Wrath", "978-0-14-303943-3", false);
  Book book16 = new Book(16, "Catch-22", "978-0-684-83339-0", false);
  Book book17 = new Book(17, "Little Women", "978-0-14-751401-5", true, "Frank Miller");
  Book book18 = new Book(18, "The Fault in Our Stars", "978-0-525-47881-2", false);
  Book book19 = new Book(19, "The Road", "978-0-307-26339-0", true, "Ryan Allen");
  Book book20 = new Book(20, "The Book Thief", "978-0-552-55353-8", false);

  Book[] allBooks = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14, book15, book16, book17, book18, book19, book20};

  System.out.println("""
          Welcome to your neighborhood library""");
  String report = ("""
          Please select one of the following options below\n
          
          To see available books please press 1\n
          To see checked out book please press 2""");



   Book tracker = new Book.Tracker();
         scanner = new Scanner(System.in);
   boolean running = true;

   while (running) {
    tracker.menu();
    System.out.print("Choose an option: ");
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline

    if (choice == 1) {
     tracker.viewCatalog();
    } else if (choice == 2) {
     System.out.print("Enter your User ID: ");
     String userId = scanner.nextLine();
     System.out.print("Enter the name of the book to checkout: ");
     String book = scanner.nextLine();
     tracker.isCheckedOut(userId, book);
    } else if (choice == 3) {
     System.out.print("Enter your User ID: ");
     String userId = scanner.nextLine();
     System.out.print("Enter the name of the book to return: ");
     String book = scanner.nextLine();
     tracker.returnBook(userId, book);
    } else if (choice == 4) {
     running = false;
     System.out.println("Exit:");
    } else {
     System.out.println("Invalid option. Please try again.");
    }
   }

   scanner.close();
  }
 }

