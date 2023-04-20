import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;


public class ListTests {
    @Test
    public void testFilter(){
        String[] inpStr1 = {"apple", "banana", "tree", "peach", "code"};
        String[] result = {"apple", "banana", "peach"};
        List<String> input1 = Arrays.asList(inpStr1);
        assertEquals(ListExamples.filter(input1, new StringChecker() {
            public boolean checkString(String s){
            if(s.contains("a"))
                return true;
            return false; 
            }  
        }), Arrays.asList(result));
    }

    @Test
    public void testMerge(){
        String[] inpStr1 =  {"banana", "peach"};
        String[] inptStr2 = {"code", "elephant", "sword", "pineapple"};
        String[] expStr = {"banana", "code", "elephant", "peach", "pineapple", "sword"};

        List<String> input1= Arrays.asList(inpStr1);
        List<String> input2 = Arrays.asList(inptStr2);
        List<String> expected = Arrays.asList(expStr);
        assertEquals(ListExamples.merge(input1, input2), expected);
    }
}
