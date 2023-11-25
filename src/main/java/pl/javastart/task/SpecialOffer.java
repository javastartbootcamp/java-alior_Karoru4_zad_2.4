package pl.javastart.task;

public class SpecialOffer {

    String offerDescrition;
    String startOffer;
    String endOffer;
    int discount;
    Product product;

    public SpecialOffer(String offerDescrition, String startOffer, String endOffer, int discount, Product product) {
        this.offerDescrition = offerDescrition;
        this.startOffer = startOffer;
        this.endOffer = endOffer;
        this.discount = discount;
        this.product = product;
    }

    String getSpecialOffer() {
        double newPrice = ((100 - discount) * 0.01) * product.price;
        return ("Specjalna oferta! " + offerDescrition + ". Czas trwania: od " + startOffer + " do " + endOffer
                + " - zniżka " + discount + "%. Aktualna cena: "  + newPrice + "zł\n");
    }
}
