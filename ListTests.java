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
    @Test
    public void testMerge()
    {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        input1.add("d");
        List<String> input2 = new ArrayList();
        input2.add("c");
        input2.add("e");
        input2.add("f");
        List<String> input3 = new ArrayList();
        input3.add("a");
        input3.add("b");
        input3.add("c");
        input3.add("d");
        input3.add("e");
        input3.add("f");
        assertEquals(input3, ListExamples.merge(input1, input2));
    }
}
