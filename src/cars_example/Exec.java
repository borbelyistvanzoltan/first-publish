package cars_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Exec {

    public static void main(String[] args) {
        
        int N = 77777777;
        long t;

        List<Car> carList = new ArrayList<Car>();

        carList.add(new Car("730", "black", 5, 280));
        carList.add(new Car("RS5", "red", 5, 242));
        carList.add(new Car("Corsa", "blue", 5, 187));
        carList.add(new Car("Ferrari", "yellow", 5, 320));
        carList.add(new Car("C3", "silver", 3, 146));
        carList.add(new Car("X90", "gray", 5, 210));
        
        HashSet<SportCar> sportAutoHashSet = new HashSet<>();
        SportCar batmanAutoja = new SportCar("BatCar", "black", 2, 450, 500);
        sportAutoHashSet.add(batmanAutoja);
        sportAutoHashSet.add(new SportCar("FastAndFurious", "red", 5, 350, 700));
        
        Iterator<SportCar> sportAutoHashIterator = sportAutoHashSet.iterator();
        
//        while(sportAutoHashIterator.hasNext()){
//            System.out.println(sportAutoHashSet.toString());
//        }
        
        StringBuffer stringbuffer = new StringBuffer();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
            stringbuffer.append("");
        }
        System.out.println(System.currentTimeMillis() - t);
        
        StringBuilder stringbuilder = new StringBuilder();
        t = System.currentTimeMillis();
        for (int i = N; i --> 0 ;) {
            stringbuilder.append("");
        }
        System.out.println(System.currentTimeMillis() - t);

        
        
//        carList.add(new SportCar("Batman Car", "black", 2, 410, 300));

        System.out.println(CarUtils.getStrongestCar(carList).getCarData());
        
        System.out.println(CarUtils.listToString(carList));
        
        System.out.println(batmanAutoja.getCarData());
        
//        HashMap<String, HashMap> selects = new HashMap<String, HashMap>();
        
        

        
    }

}
