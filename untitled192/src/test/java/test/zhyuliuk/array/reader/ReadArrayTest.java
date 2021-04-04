package test.zhyuliuk.array.reader;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.reader.ReadArrayInterface;
import org.zhyuliuk.array.reader.impl.ReadArrayAction;

import java.util.ArrayList;

public class ReadArrayTest {
    ReadArrayInterface arrayInterface = new ReadArrayAction();
    String filename = "testRead.txt";

    @Test(description = "Test of reading")
    public void ReadInListTest() throws ArrayException {
            ArrayList<String> list = arrayInterface.readInArrayListFromFile(filename);
            ArrayList<String> expected = new ArrayList<>();
            expected.add("1, 2, 3");
            Assert.assertEquals(list, expected);

    }

}
