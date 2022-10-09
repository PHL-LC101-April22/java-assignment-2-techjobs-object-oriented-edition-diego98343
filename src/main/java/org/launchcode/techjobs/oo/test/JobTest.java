package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


  @Test
  public void testSettingJobId() {
      Job testingJob = new Job();
      Job testingJob2= new Job();

      assertEquals(1,testingJob.compareGetter(testingJob2.getId()));
      // We are expecting the test to PASS if the IDS are different . We want them different
    assertNotEquals(testingJob.getId(),testingJob2.getId());
  }

  @Test
    public void testJobConstructorAllFields(){
      Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
      Job Testingjob2 = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Peristance"));

      Employer employer=new Employer("Tesla");
      CoreCompetency coreCompetency=new CoreCompetency("java");
      Location location= new Location("Texas");
      PositionType positionType= new PositionType("Front-end");

      assertEquals(1,testingJob.testInstance(Testingjob2));




  }



  @Test
  public void testJobConstructorSetsAllFields(){
    Job testingJob = new Job();
    Job testingJob2 = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));

    testingJob.setEmployer(new Employer("product tester"));
    testingJob.setLocation(new Location("Desert"));
    testingJob.setEmployer(new Employer("ACME"));
    testingJob.setPositionType(new PositionType("Quality Control"));
    testingJob.setCoreCompetency(new CoreCompetency("Persistance"));








  }

  @Test
    public void  testJobsForEquality(){
      Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
      Job testingJob2 = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Peristance"));
      Employer employer= new Employer("Tesla");
      Employer employer1= new Employer("Tesla");

      Employer employer2= new Employer("Tesla");
      Employer employer3= new Employer("Google");

      Employer employer4= new Employer("Tesla");



     assertEquals(employer2,employer2);
     assertNotEquals(employer2.hashCode(),employer3);


     assertEquals(employer2.hashCode(),employer4.hashCode());

     assertNotEquals(employer1,employer);
     assertNotEquals(testingJob.getId(),testingJob2.getId());
     assertNotEquals(testingJob,testingJob2);





  }


  @Test
  public void testHashCodeMethod(){

    Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
    Job testingJob2 = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Peristance"));

    assertEquals(true,testingJob.hashCode()!=testingJob2.hashCode());

  }



  @Test
  public void testToStringStartsAndEndsWithNewLine() {
    Job testingJob = new Job("product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistance"));

    assertEquals(
            "\n" +
                    "ID: " + testingJob.getId() + "\n" +
                    "Name: " + testingJob.getName() + "\n" +
                    "Employer: " + testingJob.getEmployer() + "\n" +
                    "Location: " + testingJob.getLocation() + "\n" +
                    "Position Type: " + testingJob.getPositionType() + "\n" +
                    "Core Competency: " + testingJob.getCoreCompetency() +
                    "\n",


            testingJob.toString());
  }






  @Test
  public void testToStringContainsCorrectLabelsAndData(){
    Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
    Job testingJob2 = new Job("",new Employer(""),new Location(""),new PositionType(""), new CoreCompetency(""));

    assertEquals(
            "\n"+
                     "ID: "+testingJob.getId()+ "\n"+
                     "Name: "+ testingJob.getName() +"\n"+
                     "Employer: "+ testingJob.getEmployer()+ "\n"+
                     "Location: "+ testingJob.getLocation()+ "\n"+
                     "Position Type: "+ testingJob.getPositionType()+ "\n"+
                     "Core Competency: "+ testingJob.getCoreCompetency()+
                     "\n",


            testingJob.toString() );

     assertNotNull(testingJob);
  }

  @Test
  public void testToStringHandlesEmptyField(){
    Job testingJob2 = new Job("",new Employer(""),new Location(""),new PositionType(""), new CoreCompetency(""));

    assertEquals(
            "\n"+
                    "ID: "+testingJob2.getId()+ "\n"+
                    "Name: "+"Data not available"+"\n"+
                    "Employer: "+"Data not available"+"\n"+
                    "Location: "+"Data not available"+ "\n"+
                    "Position Type: "+"Data not available"+"\n"+
                    "Core Competency: "+"Data not available"+
                    "\n",


            testingJob2.toString() );
  }




  @Test
  public void  testClassExtensions(){
    Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
    CoreCompetency coreCompetency= new CoreCompetency("Java");
    coreCompetency.setValue("JavaScript");


  }



}
