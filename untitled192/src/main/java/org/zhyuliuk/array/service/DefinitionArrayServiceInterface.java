package org.zhyuliuk.array.service;

import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;

public interface DefinitionArrayServiceInterface {
    public int countPositiveEl(NumberArray numberArray) throws ArrayException;
    public int countPositiveElWithStream(NumberArray numberArray) throws ArrayException;
    public int countNegativeEl(NumberArray numberArray) throws ArrayException;
    public int countNegativeElWithStream(NumberArray numberArray) throws ArrayException;
    public int definitionSum(NumberArray numberArray) throws ArrayException;
    public int definitionSumWithStream(NumberArray numberArray) throws ArrayException;
    public double definitionOfMean(NumberArray numberArray)throws ArrayException;
    public double definitionOfMeanWithStream(NumberArray numberArray) throws ArrayException;


}
