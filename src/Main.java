public class Main {
    public static void main(String[] args) {

        System.out.println("Info Audi:");
        Auto audi = new Auto(320,4100, "white", new byte[] {0,0,0});
        audi.setAcceleration(50);

            System.out.println("\n");

        System.out.println("Info Volvo:");
        Auto volvo = new Auto(420,5900, "black", new byte[] {2,0,0});
        audi.setAcceleration(90);

            System.out.println("\n");

        System.out.println("Info Truck:");
        Truck truck = new Truck(150, 9150, "red", new byte[] {10,0,10}, false);
       // truck.setLoaded(true);
       // truck.getLoaded();
    }
}