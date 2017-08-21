package car_tyre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car {

    private List<Tyre> tires = new ArrayList<Tyre>();

    public void setTires(List<Tyre> tires) {
//        this.tires.clear();
        this.tires.addAll(tires);
    }

    public void addTire(Tyre tire) {
        this.tires.add(tire);
    }

    public List<Tyre> getTires() {
        return Collections.unmodifiableList(tires);
    }

}
