package exercises;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void printWord(ArrayList<String> words) {
        ArrayList<String> fiveLetters = new ArrayList<>();
        for (String word : words) {
            if (word.length() == 5) {
                fiveLetters.add(word);
            }
            for (String letter : fiveLetters) {
                System.out.println(letter);
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(101);
        myNumbers.add(91);
        myNumbers.add(18);
        myNumbers.add(12);
        myNumbers.add(2);
        myNumbers.add(3);
        myNumbers.add(5);
        myNumbers.add(8);
        myNumbers.add(10);

        System.out.println(sumEven(myNumbers));
    }
    }

