import junit.framework.TestCase;

public class MultipleCurrencyConverterTest extends TestCase
{
    MultipleCurrencyConverter converter = new MultipleCurrencyConverter();
    //TestCase 1
    //Objective convert euro to dollar
    //input: 1, D
    //output: 1.21

    public void testConvertE_001()
    {
     assertEquals(1.21f,converter.ConvertE_(1,'D'));
    }

    //Test Case 2
    //Objective: convert Euro to GBP
    //input: 1, G
    //output:0.88
    public void testConvertE_002()
    {
        assertEquals(0.88f,converter.ConvertE_(1,'G'));
    }

    //TestCase: 3
    //Objective: Convert Euro to Yuan
    //Input: 1,Y
    //output: 7.81
    public void testConvertE_003()
    {
        assertEquals(7.81f,converter.ConvertE_(1,'Y'));
    }

    //TestCase: 4
    //Objective: Convert with unspecified currency
    //1,H
    //-99.00
    public void testConvertE_004()
    {
        assertEquals(-99.00f,converter.ConvertE_(1,'H'));
    }
}