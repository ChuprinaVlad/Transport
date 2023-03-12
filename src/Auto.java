public class Auto extends Transport {
    private int acceleration;

    public Engine engine = new Engine();

    public Auto (int speed, int weight, String color, byte[] coordinate){
        super(speed, weight, color, coordinate);

    }

    @Override
    public void moveObject(int speed) {
        System.out.println("Object moves at speed: " + speed);
    }

    public void setAcceleration(int acceleration){
        this.acceleration = acceleration;
        System.out.println(getAcceleration());
    }

    public String getAcceleration() {
        if (acceleration >= 70){
            return "This is sport car";
        }
        else
            return "This is family car";
    }
}
