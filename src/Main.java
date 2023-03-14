public class Main {
    public static void main(String[] args) {

        System.out.println("Info Audi:");
        Auto audi = new Auto(320,4100, "white", new byte[] {0,0,0});
        audi.setAcceleration(50);
        audi.engine.setValues(true,200);
        audi.engine.info();

            System.out.println("\n");

        System.out.println("Info Volvo:");
        Auto volvo = new Auto(420,5900, "black", new byte[] {2,0,0});
        audi.setAcceleration(90);
        volvo.engine.setValues(true,370);
        volvo.engine.info();

            System.out.println("\n");

        System.out.println("Info Truck:");
        Truck truck = new Truck(150, 9150, "red", new byte[] {10,0,10}, false);
        truck.engine.setValues(false,2000);
        truck.engine.info();

            System.out.println("\n");

        System.out.println("Info FlyCar:");
        new Auto (860,3600, "blue", new byte[] {2,8,0}){
            void flyCar() {
                this.engine.info();
                System.out.println("This is car FlyCar");
            }
        };
    }
}