public class Truck extends Transport {
    private boolean isLoaded;

    public Engine engine = new Engine();

    public Truck(int speed, int weight,String color, byte[] coordinate, boolean isLoaded) {

        super(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    public void setLoaded (boolean loaded){
        this.isLoaded = loaded;
        }

    @Override
    public void moveObject(int speed) {
        System.out.println("Object moves at speed: " + speed);}

    @Override
    public String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public String getLoaded(){
        if(isLoaded) {
            weight += 600;
            return "Truck is loaded" + ", weight: " + weight;
        }
        else
            return "Truck is not loaded";
    }


}
