package org.zhyuliuk.array.creator;

import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;

import java.util.ArrayList;

public interface CreatorInterface {
    public NumberArray[] createArrayOfNumberArray(ArrayList<int[]> arrayList) throws ArrayException;
    public NumberArray[] createArrayOfNumberArrayWithStream(ArrayList<int[]> arrayList) throws ArrayException;
}
