public class BarbieAccessory {
    public int numberOfGems;
    public String color;
    public boolean isSparkly;

    public BarbieAccessory(int gems, String colors, boolean sparkly) {
        numberOfGems = gems;
        color = colors;
        isSparkly = sparkly;
    }

    public void printInfo(){
        System.out.println("This " + color + " accessory has " + numberOfGems + " gems and it is " + isSparkly + " that it is sparkly.");
    }
}
