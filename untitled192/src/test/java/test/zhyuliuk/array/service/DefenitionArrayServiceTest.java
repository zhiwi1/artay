package test.zhyuliuk.array.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.service.DefinitionArrayServiceInterface;
import org.zhyuliuk.array.service.impl.DefinitionArrayService;

public class DefenitionArrayServiceTest {
    NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
    DefinitionArrayServiceInterface service = new DefinitionArrayService();

    @Test(description = "Тест счетчика позитивных элементов")

    public void countPositiveElTest() throws ArrayException {
        int actual = service.countPositiveEl(numberArray);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }@Test
    public void countPositiveElTestWithStream() throws ArrayException {
        int actual = service.countPositiveElWithStream(numberArray);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Тест счетчика негативных элементов c Stream")
    public void countNegativeElTestWithStream() throws ArrayException {
        int actual = service.countNegativeElWithStream(numberArray);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }
    @Test(description = "Тест счетчика негативных элементов")
    public void countNegativeElTestWith() throws ArrayException {
        int actual = service.countNegativeEl(numberArray);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Расчет суммы всех элементов массива")
    public void definitionSumTest() throws ArrayException {
        int actual = service.definitionSum(numberArray);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
    @Test(description = "Расчет суммы всех элементов массива с Stream")
    public void definitionSumTestWithStream() throws ArrayException {
        int actual = service.definitionSumWithStream(numberArray);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }

    @Test(description = "Расчет среднего значения всех элементов массива")
    public void definitionOfMean() throws ArrayException {
        double actual = service.definitionOfMean(numberArray);
        double expected = 0.0d;
        Assert.assertEquals(actual, expected);

    }
    @Test(description = "Расчет среднего значения всех элементов массива")
    public void definitionOfMeanWithStream() throws ArrayException {
        double actual = service.definitionOfMean(numberArray);
        double expected = 0.0d;
        Assert.assertEquals(actual, expected);

    }


}
