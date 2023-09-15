package cakeExersize;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake twentyFirst = new BirthdayCake();
        twentyFirst.setFlavor("Chocolate Delight");
        twentyFirst.setPrice(39.99);
        twentyFirst.setCandles(21);
        System.out.println("The flavor of my friends birthday cake was "+ twentyFirst.getFlavor()+ ", the price was $"+ twentyFirst.getPrice()+ ", it also had "+ twentyFirst.getCandles()+ " candles on the cake.\n");

        WeddingCake bobAndSarah = new WeddingCake();
        bobAndSarah.setFlavor("Red Velvet");
        bobAndSarah.setPrice(250.00);
        bobAndSarah.setTiers(6);
        System.out.println("Bob and Sarah's Wedding Cake's flavor was "+ bobAndSarah.getFlavor()+ ", the price was $"+ bobAndSarah.getPrice()+ ", there was also "+ bobAndSarah.getTiers()+ " tiers on the cake." );

    }
}
