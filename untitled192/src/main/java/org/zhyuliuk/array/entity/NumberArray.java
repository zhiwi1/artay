package org.zhyuliuk.array.entity;

import org.zhyuliuk.array.exception.ArrayException;

import java.util.Arrays;

public class NumberArray {
    private int[] numberArray;

    public NumberArray(int... numberArray) {

        this.numberArray = numberArray;
    }

    public int[] getNumberArray() {
        return Arrays.copyOf(numberArray, numberArray.length);
    }

    public void setNumberArray(int[] numberArray) {
        this.numberArray = Arrays.copyOf(numberArray, numberArray.length);
    }

    public int getElementByIndex(int index) throws ArrayException {
        if ( index < 0 || index > numberArray.length - 1) {
            throw new ArrayException("Exception: out of index! Your index: " + index + " range: [0..." + numberArray.length + "]");
        }
        return numberArray[index];

    }

    public void setElementByIndex(int index, int replacement) throws ArrayException {
        if (index < 0 || index >= numberArray.length - 1) {
            throw new ArrayException("NumberArrayException: out of index! Your index: " + index + " range: [0..." + numberArray.length + "]");
        }
        numberArray[index] = replacement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberArray array = (NumberArray) o;
        return Arrays.equals(numberArray, array.numberArray);
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int element : numberArray) {
            result = 31 * result + element;
        }
        return result;
    }

    @Override
    public String toString() {
        return " NumberArray{" + "array=" + Arrays.toString(numberArray) +
                '}';
    }
}
