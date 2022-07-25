package studio.RestaurantMenu;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private Boolean New;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNew() {
        return New;
    }

    public void setNew(Boolean aNew) {
        New = aNew;
    }
}
