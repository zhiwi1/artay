package org.zhyuliuk.array.service;

import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;

public interface ReplacementArrayServiceInterface {
    public void replaceIfPositiveToZero(NumberArray numberArray) throws ArrayException;
    public void replaceIfNegativeToZero(NumberArray numberArray) throws ArrayException;
    public NumberArray replaceIfPositiveToZeroWithStream(NumberArray numberArray) throws ArrayException;
    public NumberArray replaceIfNegativeToZeroWithStream(NumberArray numberArray) throws ArrayException;
}
