package studio.RestaurantMenu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> myBucket = new ArrayList<>();
        MenuItem bakedBrie = new MenuItem("Baked Brie", "Brie baked to gooey goodness and topped with fig jam and pistachio", "Appetizer", 12.99 );
        MenuItem steak = new MenuItem("Steak", "Choice cut cooked to perfection served with garlic mashed potatoes.", "Entree", 29.99);
        MenuItem cheesecake = new MenuItem ("cheesecake", "Rich and delicious on our spiced wafer crust", "Dessert", 9.75);

        myBucket.add(bakedBrie);
        myBucket.add(steak);
        myBucket.add(cheesecake);

        Menu myMenu = new Menu(myBucket);


        myMenu.remove();
        myMenu.showAll();


    }
}
