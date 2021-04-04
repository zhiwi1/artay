package org.zhyuliuk.array.service;

import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;

public interface SortArrayServiceInterface {
    public void quickSort(NumberArray numberArray) throws ArrayException;
    public void bubbleSort(NumberArray numberArray) throws ArrayException;
    public void insertionSort(NumberArray numberArray)throws ArrayException;
    }
