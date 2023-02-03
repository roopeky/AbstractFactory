public class AdidasClothingFactory implements ClothingAbstractFactory {
    public Clothing createHat() {
        return new Clothing("Adidas", "hat");
    }

    public Clothing createShirt() {
        return new Clothing("Adidas", "t-shirt");
    }

    public Clothing createPants() {
        return new Clothing("Adidas", "pants");
    }

    public Clothing createShoes() {
        return new Clothing("Adidas", "shoes");
    }
}
