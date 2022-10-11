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


    public JobField( String value){
        this();
       this.value=value;
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



    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        if(((JobField) o).getId()==this.id) return true;
       JobField jobField = (JobField) o;
        return getId() == jobField.getId() && value.equals(jobField.value);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }


    @Override
    public String toString() {
        return value;
    }

}
