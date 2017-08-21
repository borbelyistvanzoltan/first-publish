package cars_example;

import java.util.List;

public class CarUtils {

    public static Car getStrongestCar(List<Car> carList) {

        int max = 0;
        Car typeofcar = new Car();

        for (Car car : carList) {
            if (car.getSpeed() > max) {
                typeofcar = car;
                max = car.getSpeed();
            }
        }
        return typeofcar;
    }

    public static String listToString(List<Car> carList) {

        String listofcars = "";

        for (Car s : carList) {
            if (s.equals(carList.get(carList.size() - 1))) {
                listofcars += (s.getType());
            } else {
                listofcars += (s.getType() + ", ");
            }
        }
        return listofcars;
    }

    public void printSomething() {
        System.out.println("Valami");
    }

}
