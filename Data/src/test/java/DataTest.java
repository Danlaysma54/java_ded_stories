import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {
    private Data obj;

    @Before
    public void SetUp() {
        obj = new Data();
    }

    @Test(expected = IllegalArgumentException.class)
    public void DataMoreThan30Days() {
        obj = new Data(31, "April", 2002);
    }

    @Test(expected = IllegalArgumentException.class)
    public void DataMoreThan28Days() {
        obj = new Data(29, "February", 2003);
    }

    @Test(expected = IllegalArgumentException.class)
    public void DataMoreThan29Days() {
        obj = new Data(30, "February", 2000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void DataMoreThan31Days() {
        obj = new Data(32, "December", 2003);
    }
    @Test(expected = IllegalArgumentException.class)
    public void DataLessThan1970() {
        obj = new Data(32, "December", 1970);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestLessThan1Day() {
        int test_1 = 0;
        obj.setDay(test_1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMoreThan32Days() {
        int test_2 = 32;
        obj.setDay(test_2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMoreThan28InFebruaryLeapYear() {
        obj.SetMonth("february");
        obj.SetYear(1999);
        obj.setDay(29);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMoreThan29InFebruary() {
        obj.SetMonth("february");
        obj.SetYear(2000);
        obj.setDay(30);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMoreThan30InApril() {
        obj.SetMonth("april");
        obj.setDay(31);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMoreThan30InJune() {
        obj.SetMonth("june");
        obj.setDay(31);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMoreThan30InSeptember() {
        obj.SetMonth("september");
        obj.setDay(31);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMoreThan30InNovember() {
        obj.SetMonth("november");
        obj.setDay(31);
    }

    @Test(expected = IllegalStateException.class)
    public void TestFebruaryInLeapYear() {
        obj.SetYear(2000);
        obj.setDay(30);
        obj.SetMonth("february");

    }

    @Test(expected = IllegalStateException.class)
    public void TestFebruaryInNotLeapYear() {
        obj.SetYear(2001);
        obj.setDay(29);
        obj.SetMonth("february");

    }

    @Test(expected = IllegalStateException.class) //отошёл
    public void TestApril() {
        obj.setDay(31);
        obj.SetMonth("april");

    }

    @Test(expected = IllegalStateException.class)
    public void TestJune() {
        obj.setDay(31);
        obj.SetMonth("june");

    }

    @Test(expected = IllegalStateException.class)
    public void TestSeptember() {
        obj.setDay(31);
        obj.SetMonth("september");

    }

    @Test(expected = IllegalStateException.class)
    public void TestNovember() {
        obj.setDay(31);
        obj.SetMonth("november");

    }

    @Test(expected = IllegalStateException.class)
    public void NotLeapYear() {
        obj.setDay(29);
        obj.SetMonth("february");
        obj.SetYear(2001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TooOldYear() {
        obj.SetYear(1969);
    }

    @Test
    public void TestSetDay() {
        obj.setDay(12);
        assertEquals(12, obj.getDay());
    }

    @Test
    public void TestSetMonth() {
        obj.SetMonth("february");
        assertEquals("february", obj.getMonth());
    }

    @Test
    public void TestSetYear() {
        obj.SetYear(2000);
        assertEquals(2000, obj.getYear());
    }

    @Test
    public void equalityTrue() {
        Data test = new Data();
        assertTrue(obj.equality(test));
    }

    @Test
    public void equalityFalse() {
        Data test = new Data(12, "february", 2000);
        assertFalse(obj.equals(test));
    }
}