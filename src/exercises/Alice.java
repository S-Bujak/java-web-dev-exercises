package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String aliceOpening = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";


        System.out.println("What do you want to search for in the opening line of Alice's Adventures in Wonderland? ");

        String searchTerm = input.nextLine();

        boolean search = aliceOpening.toLowerCase().contains(searchTerm.toLowerCase());
        Integer index = aliceOpening.indexOf(searchTerm);
        Integer length = searchTerm.length();
        String modified = aliceOpening.replace(searchTerm, "");
        if (search) {
            System.out.println("Search found first at index " + index + ". The search term is " + length + " characters long.");
            System.out.println(modified);
        } else {
            System.out.println("Search not found");
        }





    }
}
