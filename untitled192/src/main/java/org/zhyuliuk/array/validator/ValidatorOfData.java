package org.zhyuliuk.array.validator;

import org.zhyuliuk.array.entity.NumberArray;

import java.io.File;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorOfData  {
    private final static String NUMBER_REGEX="^\\s*(\\d|\\dd)+\\s*(,\\s*(\\d|\\dd)\\s*)+$";



    public static boolean isValidLine(String stringNumbers) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(stringNumbers);
        return matcher.find();
    }

    public static boolean isFileValid(String fileName) {
        return  fileName != null&&Files.exists(Paths.get(fileName)) && (new File(fileName)).length() > 0L&&fileName.length()!=0;
    }

    public static  <T>  boolean isListNullOrEmpty(ArrayList<T > list) {
        return list == null || list.isEmpty();
    }

    public  static boolean isArrayEmptyOrNull(NumberArray entity) {
        return entity == null || entity.getNumberArray().length == 0;
    }


}