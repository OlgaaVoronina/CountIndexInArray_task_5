package ua.epam;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Olga_Voronina on 9/9/2016.
 */


public class IsIndexTest extends TestCase {

    private IsIndex isInd;
    private IsIndex howM;
    private IsIndex ifO;
    private IsIndex countI;


    int[] arr = {4, 5, 8, 7, 4, 5, 4};
    int[] arrEmpty = {};
    int value = 4;
    int value1 = 10;
    boolean isLocVT = true;
    boolean isLocVF = false;

    @Before
    public void runIsIndex(){isInd = new IsIndex(); } //inicialization
    public void runHowMuch(){howM = new IsIndex(); } //inicialization
    public void runIfOne(){ifO = new IsIndex(); } //inicialization
    public void runCountIndex(){countI = new IsIndex(); } //inicialization


    //is value in Array
    @Test
    public void testIsValueInArrayTrue() {
        boolean bol = isInd.isValueInArray( value, arr );
        Assert.assertTrue( bol == true); //array is not empty with value = 4...value is in array
    }

    @Test
    public void testIsValueInArrayFalse() {
        boolean bol = isInd.isValueInArray( value1, arr );
        Assert.assertTrue( !bol); //array is not empty without value = 12...value is not in array
    }


    @Test
    public void testIsValueInArrayEmptyV() {
        boolean bol = isInd.isValueInArray( value, arrEmpty );
        Assert.assertTrue( bol == false); //array is empty without value = 4...value is not in array
    }

    @Test
    public void testIsValueInArrayEmptyV1() {
        boolean bol = isInd.isValueInArray( value1, arrEmpty );
        Assert.assertTrue( bol == false); //array is empty without value = 12...value is not in array
    }


    //how times is value in array
    @Test
    public void testHowMuch() {
        int count = howM.HowMuch( isLocVT, arr, value );
        Assert.assertEquals(count, 3); //count = 3 times value 4 in array {4, 5, 8, 7, 4, 5, 4}
    }

    @Test
    public void testHowMuch1() {
        int count = howM.HowMuch( isLocVF, arr, value1 );
        Assert.assertEquals(count, 0); //count = 0 times value 12 in array {4, 5, 8, 7, 4, 5, 4}
    }

    @Test
    public void testHowMuch2() {
        int count = howM.HowMuch( isLocVF, arrEmpty, value );
        Assert.assertEquals(count, 0); //count = 0 times value 4 in array {}
    }

    @Test
    public void testHowMuch3() {
        int count = howM.HowMuch( isLocVF, arrEmpty, value );
        Assert.assertEquals(count, 0); //count = 0 times value 12 in array {}
    }


    //if one value in array
    int countValueOne = 1;
    int countValue = 3;

    @Test
    public void testIfOne() {
        int times = ifO.IfOne( countValueOne );
        Assert.assertEquals(times, 1); // 1 time meet value in array
    }

    @Test
    public void testIfOne1() {
        int times = ifO.IfOne( countValue );
        Assert.assertEquals(times, 3); // 3 times meet value in array
    }


    //count indexes
    int[] arrayOfIndexes = {0, 4, 6};

    @Test
    public void testIndexes() {
        int[] index = countI.Indexes( countValue, value, arr );
        Assert.assertEquals(Arrays.toString(index), Arrays.toString(arrayOfIndexes)); // arr = {4, 5, 8, 7, 4, 5, 4}
    }

}