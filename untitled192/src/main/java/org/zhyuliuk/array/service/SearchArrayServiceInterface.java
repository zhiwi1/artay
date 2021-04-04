package org.zhyuliuk.array.service;

import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;

public interface SearchArrayServiceInterface {
    public int findMaxElement(NumberArray numberArray) throws ArrayException;
    public int findMinElement(NumberArray numberArray) throws ArrayException;
    public int findMaxElementWithStream(NumberArray numberArray) throws ArrayException;
    public int findMinElementWithStream(NumberArray numberArray) throws ArrayException;
}
