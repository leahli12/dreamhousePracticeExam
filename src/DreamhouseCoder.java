public class DreamhouseCoder {
    public String dreamhouseName;
    public boolean isDreamhouseOpen;
    public int numberOfRooms;

    public static void main(String[] args) {
        DreamhouseCoder barbieCoder = new DreamhouseCoder();
        BarbieAccessory glamNecklace = new BarbieAccessory(50, "pink", true);
        glamNecklace.printInfo();
        BarbieAccessory beachBag = new BarbieAccessory(12, "blue and white", false);
        beachBag.printInfo();
    }

    public DreamhouseCoder(){
        System.out.println("Hi, Coders of Dreamhouse!");
        dreamhouseName = "Dream Glitter Palace";
        isDreamhouseOpen = true;
        numberOfRooms = 50;
        System.out.println("Welcome to " + dreamhouseName + "! It is " + isDreamhouseOpen + " that we are open. We have " + numberOfRooms + " rooms in our glittery palace.");
        numberOfRooms *= 2;
        System.out.println("Welcome to " + dreamhouseName + "! It is " + isDreamhouseOpen + " that we are open. We have " + numberOfRooms + " rooms in our glittery palace.");
        randomBarbieAccessories();
        fashionIconOfTheDay("Barbie");
        organizeWardrobe();
        System.out.println();
        barbieChoices();
    }

    public void randomBarbieAccessories(){
        int randomAccessoryCount = (int)(Math.random() * 56);
        System.out.println("Let's accessorize! You get " + randomAccessoryCount + " new accessories for your Dream Glitter Palace!");
    }

    public void fashionIconOfTheDay(String fashionista){
        System.out.println("Today's fashion icon is " + fashionista + ".");
    }

    public void organizeWardrobe(){
        for (int x = 0; x < 4; x += 1){
            System.out.println(x);
        }
        for (int i = 5; i < 21; i += 5){
            System.out.println(i);
        }
        for (int j = 18; j > 5; j -= 3){
            System.out.print(j + ", ");
        }
    }

    public void barbieChoices(){
        double randomNum = Math.random();
        if (randomNum < 0.25){
            System.out.println("Barbie recommends a glamorous outfit.");
        }
        else if (randomNum < 0.51){
            System.out.println("Barbie recommends a beach-ready look.");
        }
        else if (randomNum < 0.76) {
            System.out.println("Barbie recommends a party dress.");
        }
        else {
            System.out.println("Barbie recommends a cozy pajama set.");
        }
    }
}
