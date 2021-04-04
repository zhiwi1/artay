package org.zhyuliuk.array.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.service.SearchArrayServiceInterface;
import org.zhyuliuk.array.validator.ValidatorOfData;
import org.zhyuliuk.array.exception.ArrayException;

import java.util.Arrays;

public class SearchArrayService implements SearchArrayServiceInterface {
    private static Logger logger = LogManager.getLogger();


    public int findMaxElement(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        int max = numberArray.getElementByIndex(0);
        for (int i = 0; i < numberArray.getNumberArray().length; i++) {
            if (numberArray.getElementByIndex(i) > max) {
                max = numberArray.getElementByIndex(i);
            }
        }
        logger.log(Level.INFO, "max : {}, result : {} ", numberArray, max);
        return max;
    }
    public int findMaxElementWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        return Arrays.stream(numberArray.getNumberArray()).max().orElseThrow(ArrayException::new);
    }
    public int findMinElement(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        int min = numberArray.getElementByIndex(0);
        for (int i = 0; i < numberArray.getNumberArray().length; i++) {
            if (numberArray.getElementByIndex(i) < min) {
                min = numberArray.getElementByIndex(i);
            }
        }
        logger.log(Level.INFO, "min : {}, result : {} ", numberArray, min);
        return min;
    }

    public int findMinElementWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        return Arrays.stream(numberArray.getNumberArray()).min().orElseThrow(ArrayException::new);
    }
}
