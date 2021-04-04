package test.zhyuliuk.array.creator;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.creator.CreatorInterface;
import org.zhyuliuk.array.creator.impl.CreatorNumberArray;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;

import java.util.ArrayList;


public class CreatorTest {
    CreatorInterface creator = new CreatorNumberArray();

    @Test(description = "Test of creating")
    public void createTest() throws ArrayException {
        int[] array = new int[]{1, 2, 3};
        NumberArray numArray = new NumberArray(array);
        NumberArray[] arrayExpected = new NumberArray[]{
                numArray
        };
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3});
        NumberArray arrayActual[] = creator.createArrayOfNumberArray(list);
        Assert.assertEquals(arrayActual, arrayExpected);


    }

    @Test(description = "Test of creating")
    public void createTestWithStream() throws ArrayException {
        int[] array = new int[]{1, 2, 3};
        NumberArray numArray = new NumberArray(array);
        NumberArray[] arrayExpected = new NumberArray[]{
                numArray
        };
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3});
        NumberArray arrayActual[] = creator.createArrayOfNumberArrayWithStream(list);
        Assert.assertEquals(arrayActual, arrayExpected);
    }
}
