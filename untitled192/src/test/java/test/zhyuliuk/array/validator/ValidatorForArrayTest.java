package test.zhyuliuk.array.validator;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.zhyuliuk.array.entity.NumberArray;
import org.zhyuliuk.array.validator.ValidatorOfData;

import java.util.ArrayList;

public class ValidatorForArrayTest {


    @Test(description = "")
    public void validateLinesWithDTest() {
        String line = "1,2,3,4d";
        Assert.assertTrue(ValidatorOfData.isValidLine(line));

    }

    @Test(description = "")
    public void validateLineTest() {
        String line = "1,2,3,4";

        Assert.assertTrue(ValidatorOfData.isValidLine(line));

    }

    @Test(description = "")
    public void invalidateLineTest() {
        String line = "1false,2,3,4";

        Assert.assertFalse(ValidatorOfData.isValidLine(line));

    }

    @Test
    public void isFileValidNullTest() {
        Assert.assertFalse(ValidatorOfData.isFileValid(null));
    }

    @Test
    public void isFileEmptyTest() {
        Assert.assertFalse(ValidatorOfData.isFileValid(""));
    }

    @Test
    public void isFileInvalidCorrectFileNameTest() {
        Assert.assertFalse(ValidatorOfData.isFileValid("correctfile"));
    }

    @Test
    public void isFileValidTest() {
        Assert.assertFalse(ValidatorOfData.isFileValid("a.txt"));

    }

    @Test
    public void isArrayNullTest() {
        NumberArray numberArray = null;
        Assert.assertTrue(ValidatorOfData.isArrayEmptyOrNull(numberArray));
    }
    @Test
    public void isArrayEmptyTest() {
        NumberArray numberArray = new NumberArray();
        Assert.assertTrue(ValidatorOfData.isArrayEmptyOrNull(numberArray));
    }

    @Test
    public void isListEmpty() {
        ArrayList<String> list = new ArrayList<>();
        Assert.assertTrue(ValidatorOfData.isListNullOrEmpty(list));
    }

    @Test
    public void isListNull() {

        Assert.assertTrue(ValidatorOfData.isListNullOrEmpty(null));
    }
}
