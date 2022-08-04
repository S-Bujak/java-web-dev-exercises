package studio.RestaurantMenu;


import java.util.Objects;

public class MenuItem {
    public static int nextId = 1;
    private String name;
    private final int id;
    private double price;
    private String description;
    private String category;
    private Boolean newStatus;

    public MenuItem(String name, String description, String category, double price) {
        this.id = nextId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.newStatus = true;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Boolean newStatus) {
        this.newStatus = newStatus;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem =(MenuItem) o;
        return id == menuItem.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
