package test.zhyuliuk.array.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.service.impl.ReplacementArrayService;

public class ReplacementArrayServiceTest {
    ReplacementArrayService service = new ReplacementArrayService();

    @Test(description = "Тест на корректность замены по условию")
    public void replaceIfSmallerTest() throws ArrayException {
        NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
        service.replaceIfNegativeToZero(numberArray);
        NumberArray expected = new NumberArray(1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0);
        Assert.assertEquals(numberArray, expected);
    }
    @Test(description = "Тест на корректность замены по условию")
    public void replaceIfSmallerTestWithStream() throws ArrayException {
        NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
       NumberArray actualNumberArray =service.replaceIfNegativeToZeroWithStream(numberArray);
        NumberArray expected = new NumberArray(1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0);
        Assert.assertEquals(actualNumberArray, expected);
    }

    @Test(description = "Тест на корректность замены по условию")
    public void replaceIfBiggerTest() throws ArrayException {
        NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
        service.replaceIfPositiveToZero(numberArray);
        NumberArray expected = new NumberArray(0, 0, 0, 0, 0, -1, -2, -3, -4, -5, 0);
        Assert.assertEquals(numberArray, expected);
    }
    @Test(description = "Тест на корректность замены по условию")
    public void replaceIfBiggerTestWithStream() throws ArrayException {
        NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
        NumberArray actualNumberArray=service.replaceIfPositiveToZeroWithStream(numberArray);
        NumberArray expected = new NumberArray(0, 0, 0, 0, 0, -1, -2, -3, -4, -5, 0);
        Assert.assertEquals(actualNumberArray, expected);
    }
}
