package org.zhyuliuk.array.service.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.service.ReplacementArrayServiceInterface;
import org.zhyuliuk.array.validator.ValidatorOfData;

import java.util.Arrays;

public class ReplacementArrayService implements ReplacementArrayServiceInterface {
    private static Logger logger = LogManager.getLogger();


    public void replaceIfPositiveToZero(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        for (int i = 0; i < numberArray.getNumberArray().length; ++i) {
            if (numberArray.getElementByIndex(i) > 0) {
                numberArray.setElementByIndex(i, 0);
            }
        }
        logger.log(Level.INFO, "changed array : {}", numberArray);
    }

    public NumberArray replaceIfPositiveToZeroWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }

            return  new NumberArray(Arrays.stream(numberArray.getNumberArray())
                    .map(number -> Math.min(number, 0)).toArray());
        }


    public void replaceIfNegativeToZero(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }

        for (int i = 0; i < numberArray.getNumberArray().length; ++i) {
            if (numberArray.getElementByIndex(i) < 0) {
                numberArray.setElementByIndex(i, 0);
            }
        }
        logger.log(Level.INFO, "changed array : {}", numberArray);
    }
    public NumberArray replaceIfNegativeToZeroWithStream(NumberArray numberArray) throws ArrayException {
        if (ValidatorOfData.isArrayEmptyOrNull(numberArray)) {
            logger.log(Level.ERROR, "Entity can not be empty.");
            throw new ArrayException();
        }
        return new NumberArray(Arrays.stream(numberArray.getNumberArray())
                .map(number -> Math.max(number, 0)).toArray());
    }
}