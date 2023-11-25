package pl.javastart.task;

public class Category {

    String categoryName;
    String categryDescription;

    public Category(String categoryName, String categryDescription) {
        this.categoryName = categoryName;
        this.categryDescription = categryDescription;
    }

    String getCategoryInfo() {
        return "\nKategoria: " + categoryName + " - " + categryDescription + "\n";
    }

}
