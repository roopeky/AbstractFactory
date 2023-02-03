public class BossClothingFactory implements ClothingAbstractFactory{
    public Clothing createHat() {
        return new Clothing("Boss", "hat");
    }

    public Clothing createShirt() {
        return new Clothing("Boss", "t-shirt");
    }

    public Clothing createPants() {
        return new Clothing("Boss", "pants");
    }

    public Clothing createShoes() {
        return new Clothing("Boss", "shoes");
    }

}
