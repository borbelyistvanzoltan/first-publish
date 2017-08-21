package cars_example;

public class Car {

    private String type;
    private String color;
    private int doors;
    private int speed;

    private void check(String type, String color, int doors, int speed) {
        // if (experssion here) {
        // throw new IllegalArgumentException();
        // }
    }

    public Car(String type, String color, int doors, int speed) {
        check(type, color, doors, speed);
        this.type = type;
        this.color = color;
        this.doors = doors;
        this.speed = speed;
    }

    public void set(String type, String color, int doors, int speed) {
        check(type, color, doors, speed);
        synchronized (this) {
            this.type = type;
            this.color = color;
            this.doors = doors;
            this.speed = speed;
        }
    }

    public Car() {
    }

    public synchronized String getCarData() {

        String str = new String("Az auto adatai: " + type + ", " + color + ", " + doors + ", " + speed);

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

    // public synchronized void invert() {
    // red = 255 - red;
    // green = 255 - green;
    // blue = 255 - blue;
    // name = "Inverse of " + name;
    // }

}
