import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class MyFirstTest {
    @Test
    public void codeupIsNotCodeUp(){
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void davidIsDavid(){
        String instructor = "David";
        String testWriter = "David";

        Assert.assertEquals(instructor, testWriter);
    }

    @Test
    public void listsAreDifferent(){
        List<String> languages = new ArrayList<>();
//        List<String> names = new ArrayList<>();
        List<String> names = languages;
        languages.add("Latin");
        names.add("Latin");

        //  checking the values
//        Assert.assertEquals(languages, names);
        //  checking the objects
        Assert.assertSame(languages, names);
    }

    @Test
    public void arrAreEqual(){
        int[] nums = {1, 2, 3};
        int[] nums2 = new int[3];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;

        //  checking each element in comparing arrays
        Assert.assertArrayEquals(nums, nums2);
    }

    @Test
    public void funWithPHP(){
        String language = "PHP";
        Assert.assertTrue(language.contains("H"));
        //  recommended to use 1/method
        //  otherwise both tests won't run if one fails
//        Assert.assertFalse(language.contains("J"));
    }
}
