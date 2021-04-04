package org.zhyuliuk.array.creator.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.creator.CreatorInterface;
import org.zhyuliuk.array.validator.ValidatorOfData;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;

import java.util.ArrayList;

public class CreatorNumberArray implements CreatorInterface {
    private static final Logger logger = LogManager.getLogger();


    public NumberArray[] createArrayOfNumberArray(ArrayList<int[]> arrayList) throws ArrayException{
        if (ValidatorOfData.isListNullOrEmpty(arrayList)) {
            logger.error("List Incorrect.");
            throw new ArrayException("Exception: Arraylist is null or empty.");
        }
        NumberArray[] intArray = new NumberArray[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            int[] insertingArr = arrayList.get(i);
            intArray[i] = new NumberArray(insertingArr);
        }
        return intArray;
    }
    public NumberArray[] createArrayOfNumberArrayWithStream(ArrayList<int[]> arrayList) throws ArrayException{
        if (ValidatorOfData.isListNullOrEmpty(arrayList)) {
            logger.error("List Incorrect.");
            throw new ArrayException("Exception: Arraylist is null or empty.");
        }
        return arrayList.stream().map(NumberArray::new).toArray(NumberArray[]::new);
        }
    }

