package com.company.buildings;

import com.company.animals.Animal;
import com.company.farms.Farm;

import java.util.List;

abstract public class Building<T> {
    public final BuildingType buildingType;
    Double capacity;
    final Integer maxCapacity;
    public final Integer space;
    public final Double cost;
    final Double costToDestroy;
    public Farm assignedTo;

    public Building(BuildingType buildingType,Double cost ,Double costToDestroy ,Integer maxCapacity, Integer space) {
        this.buildingType = buildingType;
        this.maxCapacity = maxCapacity;
        this.space = space;
        this.cost = cost;
        this.costToDestroy = costToDestroy;
        capacity = 0.0;
    }

    abstract public void put (T type);
    abstract public void remove (T type);
    abstract public String toString();


}
