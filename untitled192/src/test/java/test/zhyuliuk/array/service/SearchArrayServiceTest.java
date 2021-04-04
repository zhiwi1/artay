package test.zhyuliuk.array.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.service.impl.SearchArrayService;

public class SearchArrayServiceTest {
    NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
    SearchArrayService service = new SearchArrayService();

    @Test(description = "Тестируем Поиск максимального элемента в массиве ")
    public void findMaxElementTest() throws ArrayException {
        int actual = service.findMaxElement(numberArray);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }
    @Test(description = "Тестируем Поиск максимального элемента в массиве ")
    public void findMaxElementTestWithStream() throws ArrayException {
        int actual = service.findMaxElementWithStream(numberArray);
        int expected = 5;
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "")
    public void findMinElementTestWithStream() throws ArrayException {
        int actual = service.findMinElementWithStream(numberArray);
        int expected = -5;
        Assert.assertEquals(actual, expected);
    }
    @Test(description = "")
    public void findMinElementTest() throws ArrayException {
        int actual = service.findMinElement(numberArray);
        int expected = -5;
        Assert.assertEquals(actual, expected);
    }
}
