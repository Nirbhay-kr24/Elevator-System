package org.ElevatorSystem.models;

import java.util.ArrayList;
import java.util.List;
import org.ElevatorSystem.enums.Direction;
import org.ElevatorSystem.interfacees.Pannel;

public class OutsidePannel implements Pannel {
    private List<HallButton> hallButtons;

    public void someMethod() {
    }

    public OutsidePannel() {
        hallButtons = new ArrayList<>();
        hallButtons.add(new HallButton(false, Direction.UP));
        hallButtons.add(new HallButton(false, Direction.DOWN));
        hallButtons.add(new HallButton(false, Direction.IDLE));
    }

    public void moveUp(){

    }
    public void moveDown(){

    }
}
