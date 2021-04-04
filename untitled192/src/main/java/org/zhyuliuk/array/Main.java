package org.zhyuliuk.array;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.exception.ArrayException;
import org.zhyuliuk.array.parser.ParserOfNumberArrayInterface;
import org.zhyuliuk.array.parser.impl.ParserOfNumberArray;
import org.zhyuliuk.array.reader.ReadArrayInterface;
import org.zhyuliuk.array.reader.impl.ReadArrayAction;
import org.zhyuliuk.array.service.impl.SortArrayService;
import org.zhyuliuk.array.validator.ValidatorOfData;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws ArrayException {
        ReadArrayInterface reader = new ReadArrayAction();
        ParserOfNumberArrayInterface parser = new ParserOfNumberArray();
        ValidatorOfData validator = new ValidatorOfData();
        ArrayList<String> list = reader.readInArrayListFromFile("testRead.txt");
        ArrayList<String> correctList = new ArrayList<>();

        ArrayList<int[]> listInteger = parser.parseWithStream(list);
        for (int i = 0; i < listInteger.size(); i++) {
            logger.info(Arrays.toString(listInteger.get(i)));
        }


        SortArrayService service = new SortArrayService();
        NumberArray numberArray = new NumberArray(1, 2, 3, 4, 5);
        numberArray.getElementByIndex(3);
        service.quickSort(numberArray);
        logger.info("123");


    }

//        NumberArray arr = new NumberArray(new int[]{-1, -2, -3, 1, 2, 3, 10, -10});
//
//        DefinitionArrayService das = new DefinitionArrayService();
//        ReplacementArrayService ras = new ReplacementArrayService();
//        SearchArrayService sas = new SearchArrayService();
//        das.definitionSum(arr);
//        das.countNegativeEl(arr);
//        das.countPositiveEl(arr);
//        das.definitionOfMean(arr);
//        try {
//            sas.findMaxElement(arr);
//            sas.findMinElement(arr);
//        } catch (ArrayException e)
//        {logger.log(Level.ERROR,"Error: array is not valid");}
//        ras.replaceIfSmaller(arr, 57, 0);
//        ReadArrayInterface arrayInterface=new ReadArrayAction();
//        List<String> list=new ArrayList<>();
//        Logger logger=LogManager.getLogger();
//        ValidatorOfDataInterface validator=new ValidatorOfData();
//        String filename="a.txt";
//       list= arrayInterface.readInList(filename);
//
//           for (int i = 0; i < list.size(); i++) {
//               logger.info(validator.isValidLine(list.get(i)));
//               if(validator.isValidLine(list.get(i))) {
//              logger.debug(list.get(i));

//           }
//       }
}

