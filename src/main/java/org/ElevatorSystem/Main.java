package org.ElevatorSystem;

import org.ElevatorSystem.models.ElevatorSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Elevator System initialized");
        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();
        System.out.println("Elevators: " + elevatorSystem.getElevators().size());
        System.out.println("Elevator System started successfully");
    }
}