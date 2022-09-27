package org.launchcode.techjobs.oo;

import java.util.Objects;
//all have the first three methods and vars, hashcode,equals,gets and sets;make class abstract
public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
    //  toString() for value
    @Override
    public String toString() {
        return value;
    }
    //hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //equals method for ids
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
//gets and sets for all!
}
