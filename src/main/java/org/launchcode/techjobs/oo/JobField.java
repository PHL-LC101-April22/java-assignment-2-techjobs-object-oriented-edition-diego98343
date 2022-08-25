package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class  JobField {
    private int id;
    private String value;

    private static int nextId = 1;


    public JobField (){
        id= nextId;
        nextId++;
    }


    public JobField(int id, String value){
        this();
        this.value= value;
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id && Objects.equals(value, jobField.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }
}
