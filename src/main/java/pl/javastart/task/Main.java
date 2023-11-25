package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Category category1 = new Category("Osprzęt", "Gniazdka, wtyczki, włączniki itp.");
        Category category2 = new Category("Kable", "Kable lektryczne, internetowe itp.");
        Product product1 = new Product("Gniazdko", "Posiada uziemienie", 14.99, category1);
        Product product2 = new Product("Włącznik smart", "Regulacja natężenia świała", 155.55, category1);
        Product product3 = new Product("Kabel 3x1,5", "Do instalacji elektrycznych", 29.99, category2);
        Product product4 = new Product("Kostka elektryczna", "Zacisk śróbowy biały", 5.50, null);
        SpecialOffer specialOffer1 = new SpecialOffer("Black Friday", "10-11-2023", "30-11-2023", 20, product2);

        System.out.println(product1.getProductInfo() + category1.getCategoryInfo());
        System.out.println(product2.getProductInfo() + category1.getCategoryInfo() + specialOffer1.getSpecialOffer());
        System.out.println(product3.getProductInfo() + category2.getCategoryInfo());
        System.out.println(product4.getProductInfo());

    }
}
