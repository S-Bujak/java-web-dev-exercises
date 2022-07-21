package exercises;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
int [] numberArray = {1, 2, 2, 3, 5, 8};
    //for (int i: numberArray) {
      //  System.out.println(i);
        for(int i=0;i<numberArray.length;i++){
            if(numberArray[i]%2!=0){
                System.out.println(numberArray[i]);
            }
        }
        String saying = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = saying.split(" ");
        System.out.println(Arrays.toString(words));
        String [] sentence = saying.split("\\.");
        System.out.println(Arrays.toString(sentence));

    }
}
