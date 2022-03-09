package com.santidev.listviewadapterstest;

public class Animal {

    private String name;
    private String scientificName;
    private String averageLife;

    public Animal(String name, String scientificName, String averageLife) {
        this.name = name;
        this.scientificName = scientificName;
        this.averageLife = averageLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getAverageLife() {
        return averageLife;
    }

    public void setAverageLife(String averageLife) {
        this.averageLife = averageLife;
    }
}
