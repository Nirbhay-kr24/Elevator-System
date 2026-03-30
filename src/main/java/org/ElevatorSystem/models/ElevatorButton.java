package org.ElevatorSystem.models;

import org.ElevatorSystem.enums.FloorNumber;
import org.ElevatorSystem.interfacees.Button;

public class ElevatorButton implements Button {
    private boolean status;
    private FloorNumber floorNumber;

    public ElevatorButton(boolean status, FloorNumber floorNumber) {
        this.status = status;
        this.floorNumber = floorNumber;
    }

    public FloorNumber getFloorNumber() {
        return this.floorNumber;
    }

    public void setFloorNumber(FloorNumber floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean isPressed() {
        return this.status;
    }

    @Override
    public boolean press() {
        this.status = !this.status;
        return this.status;
    }
}
