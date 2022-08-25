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
  }

  @Test
    public void testJobConstructorAllFields(){
      Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
      Job Testingjob2 = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Peristance"));


      assertEquals(1,testingJob.testInstance(Testingjob2));

      assertTrue( testingJob.getEmployer() instanceof  Employer);
      assertTrue( testingJob.getLocation() instanceof Location);
      assertTrue( testingJob.getPositionType() instanceof PositionType);
      assertTrue( testingJob.getCoreCompetency() instanceof CoreCompetency);

  }

  @Test
    public void  testJobsForEquality(){
      Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
      Job testingJob2 = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Peristance"));



      assertFalse(testingJob.testEquals(testingJob2));
      assertEquals(false,testingJob.equals(testingJob2));
      assertEquals(false,testingJob.hashCode()==testingJob2.hashCode());



  }


  @Test
  public void testHashCodeMethod(){

    Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
    Job testingJob2 = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Peristance"));

    assertEquals(false,testingJob.hashCode()==testingJob2.hashCode());

  }



  @Test
  public void testToStringStartsAndEndsWithNewLine(){
    Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));

    assertEquals("ID:  _______\n" +
            "Name: _______\n" +
            "Employer: _______\n" +
            "Location: _______\n" +
            "Position Type: _______\n" +
            "Core Competency: _______",


            testingJob.toStringFistTest());
  }


  @Test
  public void testToStringContainsCorrectLabelsAndData(){
    Job testingJob = new Job("product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistance"));
    Job testingJob2= new Job();
    assertEquals(

            "ID: "+testingJob.getId()+ "\n"+
            "Name: "+ testingJob.getName() +"\n"+
            "Employer: "+ testingJob.getEmployer()+ "\n"+
            "Location: "+ testingJob.getLocation()+ "\n"+
            "Position Type: "+ testingJob.getPositionType()+ "\n"+
            "Core Competency: "+ testingJob.getCoreCompetency(),


            testingJob.toString() );





  }

  @Test
  public void  testToStringHandlesEmptyField(){

  }



}
