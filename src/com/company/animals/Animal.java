package com.company.animals;

import java.util.List;

abstract public class Animal {
    public final AnimalType species;
    public final Integer cost;
    private Double weight;
    public final Double growPerWeek;
    private Integer oldInWeeks;
    private Integer adulthood;
    public final Double foodPerWeek;
    public final List<Food> acceptedFood;
    private Integer weeksStarving;

    Animal(AnimalType species, Integer cost, Integer oldInWeeks, Double weight) {
        this.species = species;
        this.cost = cost;
        this.oldInWeeks = oldInWeeks;
        this.weight = weight;
        weeksStarving = 0;
        acceptedFood = AnimalFood.getAnimalFood(species);
        growPerWeek = AnimalGrow.getGrowRate(species);
        foodPerWeek = AnimalEat.getEatingRate(species);
        adulthood = AnimalAdulthood.getAdulthood(species);
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getOldInWeeks() {
        return oldInWeeks;
    }

    public void nextWeek () {
        if (oldInWeeks < adulthood){
            oldInWeeks++;
            if (oldInWeeks == adulthood) animalIsAdult(this);
        }

        if (isEnoughFood(acceptedFood)){
            weight += growPerWeek;
            weeksStarving = 0;
            takeFood(acceptedFood, foodPerWeek);
        } else {
            weight -= growPerWeek;
            if (weeksStarving > 1) animalIsDead(this);
        }
    }

    private boolean isEnoughFood(List<Food> acceptedFood) {
        return true;
    }

    private void takeFood(List<Food> acceptedFood, Double foodPerWeek) {
    }

    private void animalIsDead(Animal animal) {
    }

    private void animalIsAdult(Animal animal) {
    }
}
