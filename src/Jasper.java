public class Jasper {
    Clothing hat;
    Clothing shirt;
    Clothing pants;
    Clothing shoes;

    Jasper(ClothingAbstractFactory clothingFactory) {
        this.hat = clothingFactory.createHat();
        this.shirt = clothingFactory.createShirt();
        this.pants = clothingFactory.createPants();
        this.shoes = clothingFactory.createShoes();
    }

    public void whatAmIWearing() {
        System.out.println("I am wearing a " + this.hat);
        System.out.println("I am wearing a " + this.shirt);
        System.out.println("I am wearing " + this.pants);
        System.out.println("I am wearing " + this.shoes);
    }
}
