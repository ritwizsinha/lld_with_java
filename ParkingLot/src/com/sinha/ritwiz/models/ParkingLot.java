package com.sinha.ritwiz.models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static final int maxCapacity = 100000;
    private int capacity;
    ArrayList<Slot> slots;

    private void checkSlotIdInRange(int slotId) {
        if (slotId > capacity) {
//            Throw exception
        }
    }

    public ParkingLot(int size, ArrayList<Slot> slots) {
        if (size > maxCapacity) {
//            Throw error
        }
        this.capacity = size;
        this.slots = slots;
    }

    public void parkCar(Car car, int slotId) {
        checkSlotIdInRange(slotId);
        Slot s = slots.get(slotId);
        if (s.isOccupied()) {
//            Throw error
        }
        s.parkCar(car);
    }

    public void unparkCar(int slotId) {
        checkSlotIdInRange(slotId);
        Slot s = slots.get(slotId);
        if (!s.isOccupied()) {
//            Throw Exception
        }
        s.unparkCar();
    }
}
