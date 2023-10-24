import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
   
    @Test
    public void testFilter()
    {
        List<String> input1 = new ArrayList();
        input1.add("Hi");
        input1.add("Hello");
        input1.add("World");
        List<String> input2 = new ArrayList();
        input2.add("Hi");
        input2.add("Hello");
        input2.add("World");
        assertEquals(input1, ListExamples.filter(input1, new StringChecker() {
            public boolean checkString(String s)
            {
                return true;
            }
        }));
    }
}
