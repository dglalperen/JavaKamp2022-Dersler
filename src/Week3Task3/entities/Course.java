package Week3Task3.entities;

public class Course {
    private String name;
    private String categoryName;
    private int price;

    public Course(String name, String categoryName, int price) {
        this.name = name;
        this.categoryName = categoryName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
