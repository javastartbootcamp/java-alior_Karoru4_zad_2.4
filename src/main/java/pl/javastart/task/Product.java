package pl.javastart.task;

public class Product {

    String name;
    String description;
    double price;
    Category category;

    public Product(String name, String description, double price, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    String getProductInfo() {
        return
//                + category.getCategoryInfo()
                "Produkt:" + name + ", " + description + ", cena: " + price + "zł";
    }

}
