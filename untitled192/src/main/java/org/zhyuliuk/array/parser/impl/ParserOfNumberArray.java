package org.zhyuliuk.array.parser.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.validator.ValidatorOfData;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.parser.ParserOfNumberArrayInterface;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.stream;

public class ParserOfNumberArray implements ParserOfNumberArrayInterface {
    private static final Logger logger = LogManager.getLogger();

    public ArrayList<int[]> parseWithStream(ArrayList<String> list) throws ArrayException {
        if (ValidatorOfData.isListNullOrEmpty(list)) {
            logger.error("List Incorrect.");
            throw new ArrayException("Exception: Arraylist is null or empty.");
        }
        ArrayList<int[]> resultList = new ArrayList<>();
        for (String correctLine : list) {

            if (ValidatorOfData.isValidLine(correctLine)) {


                double[] resultArrayDouble = Arrays.stream(correctLine.split(",")).mapToDouble(Double::parseDouble).toArray();
                int[] resultArrayInt = new int[resultArrayDouble.length];
                for (int i = 0; i < resultArrayDouble.length; i++) {
                    resultArrayInt[i] = (int) resultArrayDouble[i];
                }
                resultList.add(resultArrayInt);
            }

        }
        return resultList;

    }

    public ArrayList<int[]> parse(ArrayList<String> list) throws ArrayException {
        if (ValidatorOfData.isListNullOrEmpty(list)) {
            logger.error("List Incorrect.");
            throw new ArrayException("Exception: Arraylist is null or empty.");
        }
        ArrayList<int[]> resultList = new ArrayList<>();
        for (String s : list) {
            if (ValidatorOfData.isValidLine(s)) {
                String[] masOfStrings = s.split(",");
                int[] resultArray = new int[masOfStrings.length];
                for (int j = 0; j < masOfStrings.length; j++) {
                    resultArray[j] = (int) Float.parseFloat(masOfStrings[j]);
                }
                resultList.add(resultArray);
            }
        }
        return resultList;
    }
}
