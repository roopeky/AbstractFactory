public class Main {
    public static void main(String[] args) {
        Jasper jasper = new Jasper(new AdidasClothingFactory());
        System.out.println("Before brand change:");
        jasper.whatAmIWearing();
        jasper = new Jasper(new BossClothingFactory());
        System.out.println("After brand change:");
        jasper.whatAmIWearing();
    }

}
