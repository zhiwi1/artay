package test.zhyuliuk.array.parser;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.parser.ParserOfNumberArrayInterface;
import org.zhyuliuk.array.parser.impl.ParserOfNumberArray;

import java.util.ArrayList;

public class ParserTest {
    ParserOfNumberArrayInterface parser = new ParserOfNumberArray();

    @Test(description = "Test of parsing")
    public void parseTest() throws ArrayException {

        ArrayList<String> list = new ArrayList<>();
        list.add("1,2,3,4");
        ArrayList<int[]> listActual = parser.parse(list);
        ArrayList<int[]> listExpected = new ArrayList<>();
        listExpected.add(new int[]{1, 2, 3, 4});

        Assert.assertEquals(listActual.get(0), listExpected.get(0));
    }
    @Test(description = "Test of parsing")
    public void parseWithStreamTest() throws ArrayException {

        ArrayList<String> list = new ArrayList<>();
        list.add("1,2d,3,4");
        ArrayList<int[]> listActual = parser.parseWithStream(list);
        ArrayList<int[]> listExpected = new ArrayList<>();
        listExpected.add(new int[]{1, 2, 3, 4});

        Assert.assertEquals(listActual.get(0), listExpected.get(0));
    }

}
