package car_tyre;

import java.util.List;

public class CarTest {

    /**
     * Question: what will be the output?
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.addTire(new Tyre(10));
        car.addTire(new Tyre(11));

        List<Tyre> carTires = car.getTires();
        System.out.println("Before: " + carTires.size());
        car.setTires(carTires);
        System.out.println("After (1): " + car.getTires().size());
        System.out.println("After (2): " + carTires.size());
    }

}
