public class Clothing {
    String brand;
    String type;

    Clothing(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String toString() {
        return this.brand + " " + this.type;
    }
}
