import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest {

    @Test
    public void testAdd(){
        Calculator calc=new Calculator();
        int result=calc.add(2,3);
        assertEquals(5,result);

    }
}
