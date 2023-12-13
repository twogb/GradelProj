package org.example;

public class HumanClass {
    private String name;
    private String lastName;

    public HumanClass(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public HumanClass() {
    }

    public HumanClass setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public HumanClass setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
}
