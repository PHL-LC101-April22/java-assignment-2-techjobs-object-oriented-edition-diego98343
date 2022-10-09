package org.launchcode.techjobs.oo;

import java.lang.instrument.ClassDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        id= nextId;
        nextId++;
    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(String name,Employer employer,Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer= employer;
        this.location= location;
        this.positionType= positionType;
        this.coreCompetency= coreCompetency;

    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(((Job) o).getId()==this.id) return true;
        Job job = (Job) o;
        return id == job.id && name.equals(job.name) && employer.equals(job.employer) && location.equals(job.location) && positionType.equals(job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }


    public boolean equals2(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(((Job) o).getId()==this.id) return true;
        Job job = (Job) o;
        return id == job.id && name.equals(job.name) && employer.equals(job.employer) && location.equals(job.location) && positionType.equals(job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    public int compareGetter(int getter){
        int temp=0;

        if(getter != getId()){
            temp=1;
        }
        return temp;
    }




    public int testInstance(Object object1){

        int temp= 0;
        if( object1 instanceof Job){
            temp= 1;
        }
        return  temp;
    }



@Override
    public String toString() {

    String temp = "";

            temp += "\n" +
                "ID: " + this.id + "\n";

                if(this.name.equals("")||this.name.isEmpty()){
                    temp += "Name: Data not available"+ "\n";
                }else {
                    temp+= "Name: " + this.name + "\n";
                }



                if(getEmployer().getValue().equals("")|| getEmployer().getValue().isEmpty()){
                    temp+= "Employer: Data not available" + "\n" ;
                }else {
                    temp+= "Employer: "+getEmployer()+ "\n";
                }



                if(getLocation().getValue().equals("")|| getLocation().getValue().isEmpty()){
                    temp+= "Location: Data not available"+ "\n";
                }else {
                    temp+= "Location: "+getLocation()+ "\n";
                }


                if(getPositionType().getValue().equals("")|| getPositionType().getValue().isEmpty()){
                    temp+= "Position Type: Data not available"+ "\n";
                }else{
                    temp+= "Position Type: "+getPositionType()+ "\n";
                }

                if(getCoreCompetency().getValue().equals("")|| getCoreCompetency().getValue().isEmpty()){
                    temp+= "Core Competency: Data not available"+ "\n";
                }else{
                    temp+= "Core Competency: "+getCoreCompetency()+ "\n";
                }


    return temp;

    }

    public String toStringFistTest(){

        String temp="";


        temp+="ID:  _______\n" +
                "Name: _______\n" +
                "Employer: _______\n" +
                "Location: _______\n" +
                "Position Type: _______\n" +
                "Core Competency: _______";

        return  temp;

    }

}
