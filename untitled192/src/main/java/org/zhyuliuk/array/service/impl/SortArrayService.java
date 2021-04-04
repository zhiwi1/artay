package org.zhyuliuk.array.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.service.SortArrayServiceInterface;
import org.zhyuliuk.array.validator.ValidatorOfData;

public class SortArrayService implements SortArrayServiceInterface {
    private static Logger logger = LogManager.getLogger();

    public void quickSort(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR,"Entity can not be empty.");
            throw new ArrayException();
        }

        quickSortInside(numberArray, 0, numberArray.getNumberArray().length - 1);

    }

    private void quickSortInside(NumberArray numberArray, int low, int high) throws ArrayException {

        if (numberArray.getNumberArray().length <= 1) {
            return;
        }

        int middle = low + (high - low) / 2;
        int middleElement = numberArray.getElementByIndex(middle);
        int i = low, j = high;
        while (i <= j) {
            while (numberArray.getElementByIndex(i) < middleElement) {
                i++;
            }

            while (numberArray.getElementByIndex(j) > middleElement) {
                j--;
            }

            ;
            if (i <= j) {
                swap(i, j, numberArray);

                i++;
                j--;
            }
        }
        if (low < j) {
            quickSortInside(numberArray, low, j);
        }
        if (high > i) {
            quickSortInside(numberArray, i, high);
        }
    }

    public void bubbleSort(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR,"Entity can not be empty.");
            throw new ArrayException();
        }
        for (int k = numberArray.getNumberArray().length - 1; k >= 0; k--) {
            for (int j = 0; j < k; j++) {
                if (numberArray.getElementByIndex(j) >= numberArray.getElementByIndex(j + 1)) {
                    swap(j, j + 1, numberArray);
                }
            }
        }
    }

    public void insertionSort(NumberArray numberArray) throws ArrayException{
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR,"Entity can not be empty.");
            throw new ArrayException();
        }
        for (int i = 1; i < numberArray.getNumberArray().length; i++) {
            int temp = numberArray.getElementByIndex(i);
            int j = i - 1;
            while (j >= 0 && temp < numberArray.getElementByIndex(j)) {
                numberArray.setElementByIndex(j + 1, numberArray.getElementByIndex(j));
                j--;
            }
            numberArray.setElementByIndex(j + 1, temp);
        }
    }

    private void swap(int x, int y, NumberArray numberArray) throws ArrayException{
        int temp = numberArray.getElementByIndex(x);
        numberArray.setElementByIndex(x, numberArray.getElementByIndex(y));
        numberArray.setElementByIndex(y, temp);
    }
}

