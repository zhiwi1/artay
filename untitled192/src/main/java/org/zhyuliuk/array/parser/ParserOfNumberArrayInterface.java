package org.zhyuliuk.array.parser;

import org.zhyuliuk.array.exception.ArrayException;

import java.util.ArrayList;

public interface ParserOfNumberArrayInterface {
    public ArrayList<int[]> parseWithStream(ArrayList<String> list) throws ArrayException;
    public ArrayList<int[]> parse(ArrayList<String> list) throws ArrayException;
}
