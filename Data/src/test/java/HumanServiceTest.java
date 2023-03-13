import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanServiceTest {
    private HumanService obj;

    @Before
    public void SetUp() {
        obj = new HumanService();
    }

    @Test
    public void NumberOver18() {
        Data current = new Data(7, "May", 2022);
        Data test_1 = new Data(13, "March", 2002);
        Data test_2 = new Data(13, "April", 2005);
        Data test_3 = new Data(13, "February", 2003);
        String test_11 = new String("Maxim");
        String test_12 = new String("Ivanov");
        String test_13 = new String("Aleksandrovich");
        String test_21 = new String("Ivan");
        String test_22 = new String("Fomin");
        String test_23 = new String("Dmitrievich");
        Human student_1 = new Human(test_1, test_11, test_12, test_13);
        Human student_2 = new Human(test_2, test_21, test_22, test_23);
        Human student_3 = new Human(test_3, test_21, test_12, test_13);
        Human[] students = new Human[]{student_1, student_2, student_3};
        Human[] adults = new Human[]{student_1, student_3};
        assertArrayEquals(adults, obj.NumbOver18(students, current));
    }

    @Test
    public void age() {
        Data current = new Data(7, "May", 2022);
        Data test_1 = new Data(13, "March", 2002);
        Data test_2 = new Data(13, "April", 2005);
        Data test_3 = new Data(13, "February", 2003);
        String test_11 = new String("Maxim");
        String test_12 = new String("Ivanov");
        String test_13 = new String("Aleksandrovich");
        String test_21 = new String("Ivan");
        String test_22 = new String("Fomin");
        String test_23 = new String("Dmitrievich");
        Human student_1 = new Human(test_1, test_11, test_12, test_13);
        Human student_2 = new Human(test_2, test_21, test_22, test_23);
        Human student_3 = new Human(test_3, test_21, test_12, test_13);
        Human[] students = new Human[]{student_1, student_2, student_3};
        int[] ages = new int[]{20, 17, 19};
        assertArrayEquals(ages, obj.age(students, current));
    }
}