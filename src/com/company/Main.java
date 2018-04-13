package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input, answer;
        Book b;
        boolean addingBooksDone, done = false;
        int selection = 0;
        ArrayList<Book> books = new ArrayList<>();

        //Existing Books
        Book bookOne = new Book("The Catcher in the Rye", "J.D. Salinger", "1951", "27851");
        books.add(bookOne);
        Book bookTwo = new Book("The Handmaid's Tale", "Margaret Atwood", "1985", "52879");
        books.add(bookTwo);
        Book bookThree = new Book("The Color Purple", "Alic Walker", "1985", "75421");
        books.add(bookThree);
        Book bookFour = new Book("How to Be A Woman", "Caitlin Moran", "2015", "46812");
        books.add(bookFour);
        Book bookFive = new Book("Persepolis", "Marjane Satrapi", "2000", "18634");
        books.add(bookFive);

        do {
            menuOptions(); //This method prints the menu options
            System.out.print("Enter a menu number: ");

            switch (Integer.valueOf(sc.nextLine())) { //This switch statement performs the designated operation based on theuser's input
                case 1: //This case lists the books in at the Library
                    System.out.println("**************** Books ****************");
                    for (Book eachBook: books) {
                        System.out.print(eachBook.getBookInfo());
                    }
                    break;
                case 2: //This case allows the user to add a book to the list of books which is then add to the library
                    do {
                        addingBooksDone = false;
                        b = new Book();
                        System.out.println("Use the prompt below to add a book to the library. ");
                        System.out.println("Enter the title: ");
                        b.setTitle(sc.nextLine());
                        System.out.println("Enter the author: ");
                        b.setAuthor(sc.nextLine());
                        System.out.println("Enter the year of publication: ");
                        b.setYearOfPublication(sc.nextLine());
                        System.out.println("Enter the ISBN number: ");
                        b.setIsbnNumber(sc.nextLine());
                        books.add(b); //Adds the new book to the list of books

                        System.out.print("Would you like to enter another book? (Y/N) ");
                        answer = sc.nextLine();
                        if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No")) {
                            addingBooksDone  = true;
                        }
                    } while (!addingBooksDone);
                    break;
                case 3:
                        do{

                    }while (!done);
                    break;
                default: System.out.println(books);

            }
            System.out.println("Would you like to return to the main menu? "); //This gives the user the option to return to the main menu
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
                done = true;
        }while(!done);

    }

    public static void menuOptions()
    {
        System.out.println("1. List books");
        System.out.println("2. Add a book");
        System.out.println("3. Borrow a book");
    }

    public static void availableBooks(ArrayList<Book> books){
        boolean available = false;
        
    }
}
