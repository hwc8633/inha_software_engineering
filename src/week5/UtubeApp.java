package week5;

public class UtubeApp {
    public static void main(String[] args) {
        LandCh landCh = new LandCh();
        KoreanSubscriber ks1 = new KoreanSubscriber("Choi", landCh);
        KoreanSubscriber ks2 = new KoreanSubscriber("Kim", landCh);
        landCh.setPrice(300000000);
        KoreanSubscriber ks3 = new KoreanSubscriber("Park", landCh);
        landCh.setPrice(290000000);
        landCh.removeSubscriber(ks2);
        landCh.setPrice(280000000);
        EnglishSubscriber es1 = new EnglishSubscriber("David", landCh);
        landCh.setPrice(1000);
    }
}
