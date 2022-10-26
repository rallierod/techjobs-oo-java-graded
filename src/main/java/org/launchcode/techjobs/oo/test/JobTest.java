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
    Job testJob;
    Job testJob2;
@Test
   public void testSettingJobId(){
    testJob = new Job();
    testJob2 = new Job();
    assertNotEquals(testJob.getId(), testJob2.getId());
}

@Test
    public void testJobConstructorSetsAllFields(){
    testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(testJob.getName() instanceof String);
    assertTrue(testJob.getEmployer() instanceof Employer);
    assertTrue(testJob.getLocation() instanceof Location);
    assertTrue(testJob.getPositionType() instanceof PositionType);
    assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Product tester", testJob.getName());
    assertEquals(testJob.getEmployer().getValue(), "ACME");
    assertEquals(testJob.getLocation().getValue(), "Desert");
    assertEquals(testJob.getPositionType().getValue(), "Quality control");
    assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
}
@Test
    public void testJobsForEquality() {
    testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    assertFalse(testJob.getId() == testJob2.getId());
}
@Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job job = new Job();
    char lastChar = job.toString().charAt(job.toString().length()-1);
    char firstChar = job.toString().charAt(0);
    assertEquals(lastChar, '\n');
    assertEquals(firstChar, '\n');
}
}
