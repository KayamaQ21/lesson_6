package example;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringOperations2Test {

    @BeforeMethod
    public void setUp() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("@AferMethod");
    }

    @Test
    public void testConcatTwo() {
        StringOperations stringOperation = new StringOperations();
        String actualResult = stringOperation.concatTwo("aa", "bb");
        String expectedResult = "aabb";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @DataProvider
    public Object[][] getStrings() {
        return new Object[][]{
                {"a", "b", "c", "abc"},
                {"", "aa", "", "aa"},
                {"yes", " ", "we can", "yes we can"}};
    }

    @Test(dataProvider = "getStrings")
    public void testConcat(String str1, String str2, String str3, String expectedResult) {
        StringOperations stringOperation = new StringOperations();
        String actualResult = stringOperation.concat(str1, str2, str3);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLength() {
        StringOperations stringOperation = new StringOperations();
        int expectedResult = 4;
        int actualResult = stringOperation.length("mama");
        Assert.assertEquals(expectedResult, actualResult);
    }
}