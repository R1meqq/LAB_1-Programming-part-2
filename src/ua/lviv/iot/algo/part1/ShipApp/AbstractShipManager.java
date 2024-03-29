package ua.lviv.iot.algo.part1.ShipApp;

import java.util.List;

public abstract class AbstractShipManager {
    public abstract void addShip(final Ship ship);
    public abstract List<Ship> findAllWithMoreThanCapacity(double maxCapacity);
    public abstract List<Ship> findAllWithMoreThanLoad(double currentLoad);
}