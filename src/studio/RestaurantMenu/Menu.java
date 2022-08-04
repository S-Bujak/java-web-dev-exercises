package studio.RestaurantMenu;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
    private ArrayList <MenuItem> items;
    private Date lastUpdated;


    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void add(MenuItem item) {
        this.items.add(item);
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void showLastUpdated() {
        System.out.println(String.format("The menu was last updated on: %s", this.getLastUpdated()));
    }


    public void simpleRemove(int index) {
        this.items.remove(index);
    }
    public void remove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a number corresponding to the menu item you would like to remove:");
        this.showAll();
        int indexToDelete = input.nextInt();
        input.close();

        this.items.remove(indexToDelete);
    }

    public void simpleShowItem(int index) {
        MenuItem theItem = this.items.get(index);
        System.out.println(theItem.getName() + ": " + theItem.getPrice());
    }

    public void showItems() {
        Scanner input = new Scanner(System.in);
        System.out.println(String.format("Select a number from %s to %s corresponding to the menu item you would like to show:", 0, (this.items.size()-1)));
        int indexToShow = input.nextInt();
        input.close();
        this.simpleShowItem(indexToShow);
    }

    public void showAll() {
        for (int i = 0; i < this.items.size(); i++) {
            MenuItem theItem = this.items.get(i);
            System.out.println(String.format("%s) %s: %s", i, theItem.getName(), theItem.getPrice()));
        }
    }
    }

