import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    @Test
    public void testNameIsSet(){
//        Assert.assertEquals("", Student.name);
        Assert.assertEquals("", Student.setName());
    }

    @Test
    public void testIdIsSet(){
//        Assert.assertEquals(0.0, Student.id, 0);
        Assert.assertEquals(0, Student.setId());
    }

    @Test
    public void testGradesIsSet(){
        List<Double> grades = new ArrayList<>();
        Assert.assertEquals(grades, Student.grades);
    }

}
