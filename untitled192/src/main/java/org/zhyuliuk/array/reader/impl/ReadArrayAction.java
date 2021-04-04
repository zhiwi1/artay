package org.zhyuliuk.array.reader.impl;


import org.zhyuliuk.array.reader.ReadArrayInterface;
import org.zhyuliuk.array.validator.ValidatorOfData;
import org.zhyuliuk.array.exception.ArrayException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReadArrayAction implements ReadArrayInterface {

     private static Logger logger = LogManager.getLogger();


    public ArrayList<String> readInArrayListFromFile(String pathname) throws ArrayException {
        if (!ValidatorOfData.isFileValid(pathname)) {
            logger.error("File {} does not valid.", pathname);
            throw new ArrayException(String.format("Read from file %s failed.", pathname));
        }
        try {
            return (ArrayList<String>) Files.readAllLines(new File(pathname).toPath());
        } catch (IOException e) {
            logger.error("Read from file {} failed.", pathname);
            throw new ArrayException(e);
        }
    }
}
