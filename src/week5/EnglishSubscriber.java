package week5;

public class EnglishSubscriber implements Subscriber {
    private String name;
    private int value;
    private LandCh landCh;  // has - a

    public EnglishSubscriber(String name, LandCh landCh) {
        this.name = name;
        this.landCh = landCh;
        landCh.registerSubscriber(this);
    }

    @Override
    public void update() {
        this.value = landCh.getPrice(); // pull
        System.out.println("Mr/Mrs. " + name + ", the price has been changed to " + value + " won.");
    }
}
