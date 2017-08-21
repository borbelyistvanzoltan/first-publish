package cars_example;

public class SportCar extends Car {

    private String type;
    private String color;
    private int doors;
    private int speed;
    private int nitroCapacity;

//    private void check(String type, String color, int doors, int speed) {
//        // if (experssion here) {
//        // throw new IllegalArgumentException();
//        // }
//    }

    public SportCar(String type, String color, int doors, int speed, int nitroCapacity) {
//        check(type, color, doors, speed);
        
        super(type, color, doors, speed);
        this.nitroCapacity = nitroCapacity;
    }

    public void set(String type, String color, int doors, int speed, int nitroCapacity) {
//        check(type, color, doors, speed);
        
            super.set(type, color, doors, speed);
            this.nitroCapacity = nitroCapacity;
        
    }

    public SportCar() {
    }

    public synchronized String getCarData() {

        String str = new String(super.getCarData());
        str += (", nitro capacity: " + nitroCapacity);

        return str;
    }

    public synchronized String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }
    
    public String getType() {
        return type;
    }
    
    public int getNitroCapacity() {
        return nitroCapacity;
    }

    // public synchronized void invert() {
    // red = 255 - red;
    // green = 255 - green;
    // blue = 255 - blue;
    // name = "Inverse of " + name;
    // }

}
