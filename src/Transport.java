public abstract class Transport {
    protected int speed;
    protected int weight;
    protected String color;
    protected byte[] coordinate;

    public Transport (int speed, int weight, String color, byte[] coordinate){
        setValues(speed, weight, color, coordinate);
        System.out.println(getValues());
    }
    public Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }

    public abstract void moveObject(int speed);
    protected void setValues (int speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }


    protected String getValues (){
        String info = "Speed: " + speed + ". weight: " + weight + ". color: " + color + ". \n";
        String infoCoordinates = "Coordinates: \n";

        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\t";

    return info + infoCoordinates;
    }

    class Engine{
        private boolean isReady;
        private int km;

        public void setValues (boolean isReady, int km){
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady (boolean isReady){
            this.isReady = isReady;
        }
        public void info (){
            if(isReady)
                System.out.println("Engine is ready");
            else
                System.out.println("Engine is not running, car drove (проїхав) " + km + " km.");
        }
    }
}
