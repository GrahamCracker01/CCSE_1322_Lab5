//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
public class myCollection {
    public static void main(String[] args) {
        Item[] collection = new Item[5];
        Scanner scan = new Scanner(System.in);
        String strInput, strTitle, strAuthor;
        long lngNumber;
        int intNumber;

        //main loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            strInput = scan.nextLine();
            if ((strInput.equals("B")) || (strInput.equals("b"))) {
                //book
                System.out.println("Please enter the name of the Book");
                strTitle = scan.nextLine();
                System.out.println("Please enter the author of the Book");
                strAuthor = scan.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                lngNumber = Long.parseLong(scan.nextLine());
                collection[i] = new Book(strTitle, strAuthor, lngNumber);
            }
            else if((strInput.equals("P")) || (strInput.equals("p"))) {
                //periodical
                System.out.println("Please enter the name of Periodical");
                strTitle = scan.nextLine();
                System.out.println("Please enter the issue number");
                intNumber = Integer.parseInt(scan.nextLine());
                collection[i] = new Periodical(strTitle, intNumber);
            }
            else {
                System.out.println("Please input a valid option");
                i--;
            }
        }
        System.out.println("\nYour Items:");
        for (int i = 0; i < 5; i++) {
            System.out.println(collection[i].getListing() + "\n");
        }
    }
}
