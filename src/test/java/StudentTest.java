import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    private String expectedName;
    private long exptedId;
    private Student student;

    @Before
    public void setUp(){
        this.expectedName = "Julian";
        this.exptedId = 221117;
        this.student = new Student(221117,"Julian");
    }

    @Test
    public void testIdIsSet(){
        Assert.assertEquals(this.exptedId, this.student.getId());
    }

    @Test
    public void testNameIsSet(){
        Assert.assertEquals(this.expectedName, this.student.getName());
    }

    @Test
    public void testAddGrades(){
        Assert.assertEquals(0, this.student.getGrades().size());
        this.student.addGrade(90);
        Assert.assertEquals(1, this.student.getGrades().size());
        this.student.addGrade(87);
        Assert.assertEquals(2, this.student.getGrades().size());
        this.student.addGrade(86);
        Assert.assertEquals(3, this.student.getGrades().size());
    }
    /*
    // returns the list of grades
    public ArrayList<Integer> getGrades(){...}
     */
    @Test
    public void testGetGrades(){
        List<Integer> grades = this.student.getGrades();
        Assert.assertEquals(grades, this.student.getGrades());
    }
    /*
    // returns the average of the students grades
    public double getGradeAverage(){...}
     */
    @Test
    public void testGetAverage(){
        this.student.addGrade(87);
        this.student.addGrade(87);
        Assert.assertEquals(90, this.student.getGradeAverage(), 2);
    }




}
