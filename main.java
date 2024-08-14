abstract class Laptop {
    private String brand;
    private String model;
    private String color;
    private String ram;
    private String cpu;
    private String Storage;
    private double price;
    private String graphicCard;


    abstract   void buildLaptop();
    public void DisplayLaptopDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("RAM: " + ram);
        System.out.println("CPU: " + cpu);
        System.out.println("Storage: " + Storage);
        System.out.println("Price: " + price);
        System.out.println("GraphicCard: " + graphicCard);

    }
}
class OfficeLaptops extends Laptop {
    public OfficeLaptops(String brand, String model, String color, String ram, String cpu, String Storage, double price, String graphicCard) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.cpu = cpu;
        this.Storage = Storage;
        this.price = price;
        this.graphicCard = graphicCard;
    }

    @Override
    void buildLaptop() {
        System.out.println("Build Office Laptop");
}
class GamingLaptops extends Laptop {
    public GamingLaptops(String brand, String model, String color, String ram, String cpu, String Storage, double price, String graphicCard) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.cpu = cpu;
        this.Storage = Storage;
        this.price = price;
        this.graphicCard = graphicCard;
    }

    @Override
    void buildLaptop() {
        System.out.println("Build Gaming Laptop");
    }
}


//
//    public class Main {
//    public static void main(String[] args) {
//        OfficeLaptops officeLaptops = new OfficeLaptops("Dell","i50","black","35 gb","dell 5110","ssd 2 TB",360,"intel 54T 8GB") {
//
//        };
//}
//    }
