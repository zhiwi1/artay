package org.zhyuliuk.array.reader;

import org.zhyuliuk.array.exception.ArrayException;

import java.util.ArrayList;

public interface ReadArrayInterface {
  public ArrayList<String> readInArrayListFromFile(String pathname) throws ArrayException;

}
