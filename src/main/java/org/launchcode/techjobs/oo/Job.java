package org.launchcode.techjobs.oo;

import java.lang.instrument.ClassDefinition;
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

    public boolean testEquals( Job object){
        boolean temp= false;

        if( this.name.equals(object.getName()) &&
                this.employer.equals(object.getEmployer())&&
                this.positionType.equals(object.getPositionType())&&
                this.coreCompetency.equals(object.getCoreCompetency())&&
                this.location.equals(object.getLocation())
        ){
            temp= true;

        } else if (this.id == object.id) {

            temp= true;
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

    public boolean compare(Employer input){
        boolean temp= false;
        if (input.getValue().equalsIgnoreCase("")){
            temp= true;
        }else{

        }
        return  temp;
    }



@Override
    public String toString(){

        String temp="";
        String temp2="No data";



//        if(new Employer("").toString().equals()){
//
//            temp+= "ID: "+this.id+ "\n"+
//                    "Name: "+ this.name +"\n"+
//                    "Employer: "+  temp2+ "\n"+
//                    "Location: "+ this.location+ "\n"+
//                    "Position Type: "+ this.positionType+ "\n"+
//                    "Core Competency: "+ this.coreCompetency;
//
//        } else {

            temp+=          "\n"+
                            "ID: "+this.id+ "\n"+
                            "Name: "+ this.name +"\n"+
                            "Employer: "+ getEmployer()+ "\n"+
                            "Location: "+ this.location+ "\n"+
                            "Position Type: "+ this.positionType+ "\n"+
                            "Core Competency: "+ this.coreCompetency+
                            "\n";





        return  temp;


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
