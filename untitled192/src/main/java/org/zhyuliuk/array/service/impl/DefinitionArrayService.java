package org.zhyuliuk.array.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.validator.ValidatorOfData;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.service.DefinitionArrayServiceInterface;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DefinitionArrayService implements DefinitionArrayServiceInterface {

    private static Logger logger = LogManager.getLogger();

    public int countPositiveEl(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            throw new ArrayException();
        }
        int counter = 0;
        for (int i = 0; i < numberArray.getNumberArray().length; i++) {
            if (numberArray.getElementByIndex(i) > 0) {
                counter++;
            }
        }
        logger.log(Level.INFO, "quantity of positive elements : {},result : {}", numberArray, counter);
        return counter;
    }

    public int countPositiveElWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.INFO, "Entity can not be empty.");
            throw new ArrayException();
        }
        return (int) IntStream.of(numberArray.getNumberArray()).filter(element -> element > 0).count();
    }

    public int countNegativeEl(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        int counter = 0;
        for (int i = 0; i < numberArray.getNumberArray().length; i++) {
            if (numberArray.getElementByIndex(i) < 0) {
                counter++;
            }
        }
        logger.log(Level.INFO, "quantity of negative elements : {},result : {}", numberArray, counter);
        return counter;
    }

    public int countNegativeElWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        return (int) IntStream.of(numberArray.getNumberArray()).filter(element -> element < 0).count();
    }

    public int definitionSum(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        int sum = 0;
        for (int i = 0; i < numberArray.getNumberArray().length; i++) {
            sum += numberArray.getElementByIndex(i);
        }
        logger.log(Level.INFO, "sum of elements : {},result : {}", numberArray, sum);
        return sum;
    }

    public int definitionSumWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        int[] array = numberArray.getNumberArray();
        return Arrays.stream(array).sum();

    }

    public double definitionOfMean(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        int sum = definitionSum(numberArray);
        double mean = (double) sum / (double) numberArray.getNumberArray().length;
        logger.log(Level.INFO, "average value elements : {},result : {}", numberArray, mean);
        return mean;
    }

    public double definitionOfMeanWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        return (int) Arrays.stream(numberArray.getNumberArray())
                .average()
                .orElseThrow(ArrayException::new);

    }

}
