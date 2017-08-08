import org.junit.Test;

import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void JobinstantiatesCorrectly() throws Exception {
        Job newJob = new Job("businessman","ToysRus", "Tulsa","sell toys","Future");
        assertTrue(newJob instanceof Job);
    }

    @Test
    public void JobTitleReturnsCorrectly_businessman() throws Exception {
        Job newJob = new Job("businessman","ToysRus", "Tulsa","sell toys","Future");
        assertEquals(newJob.getTitle(), "businessman");
    }

    @Test
    public void ArrayContainsMultipleJobs_2() throws Exception {
        Job newJob = new Job("businessman","ToysRus", "Tulsa","sell toys","Future");
        Job newJob2 = new Job("businessman","ToysRus", "Tulsa","sell toys","Future");
        assertEquals(2, Job.allJobs.size());
    }
}