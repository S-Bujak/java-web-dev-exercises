package studio.RestaurantMenu;
import java.util.ArrayList;
import java.time.LocalDate;

public class Menu {
    private ArrayList <MenuItem> name, price, description;
    private LocalDate date = LocalDate.now();

    public ArrayList<MenuItem> getName() {
        return name;
    }

    public void setName(ArrayList<MenuItem> name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getPrice() {
        return price;
    }

    public void setPrice(ArrayList<MenuItem> price) {
        this.price = price;
    }

    public ArrayList<MenuItem> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<MenuItem> description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
