import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;




public class CalculatorTest {
    @Test
    public void testPerform(){
        Calculator c = new Calculator();
        Assert.assertEquals(20,c.perform(12,8));
        Assert.assertTrue(c.checkEven(8));
        Assert.assertEquals(20,c.performDivision(40,2),0);



    }
    @Test(expected = ArithmeticException.class)
    public void testPerformDivision(){
        Calculator c = new Calculator();
       // assertEquals(20,c.performDivision(40,2));
       // assertThrows(ArithmeticException.class,c.performDivision(4,0))
        c.perform(4,0 );
    }
}
