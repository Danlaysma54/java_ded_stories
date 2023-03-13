import org.example.Methods;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class test {
    private Methods obj;

    @Before
    public void setUp() {
        obj = new Methods();
    }
    @Test
    public void TestMultiplyString(){
        String test = new String("ha");
        int n = 3;
    }

    @Test(expected = IllegalArgumentException.class) // исключение при отрицательном входном значении
    public void TestPositiveString() {
        String test = new String("12");
        obj.repeat_Str(test, -1);
    }

    @Test(expected = IllegalStateException.class) // исключение при нулевой строке
    public void TestNotZeroString() {
        String test = new String();
        String test_1 = new String("1");
        StringBuilder test_2 = new StringBuilder();
        obj.consist_numb(test_1, test);
        obj.numb_to_string(test);
        obj.delete_smth(test_2);
    }
}
