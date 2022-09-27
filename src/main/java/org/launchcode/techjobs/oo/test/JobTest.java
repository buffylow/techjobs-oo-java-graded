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
            Job testJobEmptyone = new Job();
            Job testJobEmptytwo = new Job();
            assertNotEquals(testJobEmpty1, testJobEmpty2);
        }
        @Test
        public void testJobConstructorSetsAllFields(){
            Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
            assertEquals("Product tester", testJob.getName());
            assertEquals("ACME", testJob.getEmployer().getValue());
            assertEquals("Desert", testJob.getLocation().getValue());
            assertEquals("Quality control", testJob.getPositionType().getValue());
            assertEquals("Persistence", testJob.getCoreCompetency().getValue());

            assertTrue(testJob instanceof Job);
            assertTrue(testJob.getEmployer() instanceof Employer);
            assertTrue(testJob.getLocation() instanceof Location);
            assertTrue(testJob.getPositionType() instanceof PositionType);
            assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);



        }

        @Test
        public void testJobsForEquality() {
            Job job1 = new Job("Bar Manager", new Employer("Salt and Smoke"), new Location("BPV"), new PositionType("FOH Salary"), new CoreCompetency("Hospitality"));
            Job job2 = new Job("Bar Manager", new Employer("Salt and Smoke"), new Location("BPV"), new PositionType("FOH Salary"), new CoreCompetency("Hospitality"));
            assertFalse(job1.equals(job2));
        }
}

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.toString().charAt(0), '\n');
        assertEquals(testJob.toString().charAt(testJob.toString().length() -1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job testJob = new Job("Bar Manager", new Employer("Salt and Smoke"), new Location("BPV"), new PositionType("FOH Salary"), new CoreCompetency("Hospitality"));
        assertEquals("\nID: " + testJob.getId() + "\nName: Bar Manager" + "\nEmployer: Salt and Smoke" + "\nLocation: BPV"  + "\nPosition Type: FOH Salary" + "\nCore Competency: Hospitality" + "\n", testJob.toString());
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job testJob = new Job("Bar Manager", new Employer("Salt and Smoke"), new Location("BPV"), new PositionType("FOH Salary"), new CoreCompetency("Hospitality"));
        assertEquals("\nID: " + testJob.getId() + "\nName: Bar Manager" + "\nEmployer: Salt and Smoke" + "\nLocation: BPV"  + "\nPosition Type: FOH Salary" + "\nCore Competency: Hospitality" + "\n", testJob.toString());
    }




