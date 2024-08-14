public class Laptop {
    private String brand;
    private String model;
    private String color;
    private int ram;
    private int cpu;
    private String Storage;
    private double price;
    private String graphicCard;

    public Laptop(String brand, String model, String color, int ram, int cpu, String Storage, double price, String graphicCard) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.ram = ram;
        this.cpu = cpu;
        this.Storage = Storage;
        this.price = price;
        this.graphicCard = graphicCard;
    }
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
public class OfficeLaptops extends Laptop {
    public OfficeLaptops(String brand, String model, String color, int ram, int cpu, String Storage, double price, String graphicCard) {
            super(brand, model, color, ram, cpu, Storage, price, graphicCard);
        }
}
public class GamingLaptops extends Laptop {
    public GamingLaptops(String brand, String model, String color, int ram, int cpu, String Storage, double price, String graphicCard) {
            super(brand, model, color, ram, cpu, Storage, price, graphicCard);
        }
    }

public  LaptopFactory{
        public s
}

}
    public class Main {
    }
    public static void main(String[] args) {
}
