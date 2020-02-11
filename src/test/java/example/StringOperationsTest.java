package example;

import org.junit.Assert;
import org.testng.annotations.*;
import org.testng.xml.dom.OnElement;

import static org.testng.Assert.*;

public class StringOperationsTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AferMethod");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeMethod");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@afterSuite");
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