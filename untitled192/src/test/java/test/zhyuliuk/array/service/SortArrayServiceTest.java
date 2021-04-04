package test.zhyuliuk.array.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.service.impl.SortArrayService;

public class SortArrayServiceTest {

    SortArrayService service = new SortArrayService();
    NumberArray expected = new NumberArray(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);

    @Test(description = "Тестируем пузырьковую сортировку ")

    public void bubbleSortTest() throws ArrayException {
        NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
        service.bubbleSort(numberArray);

        Assert.assertEquals(numberArray, expected);

    }
    @Test
    public void bubbleSortNullTest() {
        Assert.assertThrows(ArrayException.class, () -> service.bubbleSort(null));
    }

    @Test
    public void bubbleSortEmptyArrayTest() {
        Assert.assertThrows(ArrayException.class, () -> service.bubbleSort(new NumberArray()));
    }

    @Test(description = "Тестируем быструю сортировку")
    public void quickSortTest() throws ArrayException {
        NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
        service.quickSort(numberArray);

        Assert.assertEquals(numberArray, expected);


    }
    @Test
    public void quickSortNullTest() {
        Assert.assertThrows(ArrayException.class, () -> service.quickSort(null));
    }

    @Test
    public void quickSortEmptyArrayTest() {
        Assert.assertThrows(ArrayException.class, () -> service.quickSort(new NumberArray()));
    }


    @Test(description = "Teстируем сортировку вставками")
    public void insertionSortTest() throws ArrayException {
        NumberArray actualNumberArray = new NumberArray(1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 0);
        service.insertionSort(actualNumberArray);

        Assert.assertEquals(actualNumberArray, expected);

    }
    @Test
    public void insertionSortNullTest() {
        Assert.assertThrows(ArrayException.class, () -> service.quickSort(null));
    }

    @Test
    public void insertionSortEmptyArrayTest() {
        Assert.assertThrows(ArrayException.class, () -> service.quickSort(new NumberArray()));
    }

}