import junit.framework.TestCase;

public class CurrencyConverterTest extends TestCase
{
    CurrencyConverter currencyConverter = new CurrencyConverter();

    //Test Case 1
    //Objective: Convert 1 euro to 1 dollar
    //Input: 1 Euro
    //Expected output: 1.21

    public void testCurrencyConverter001()
    {
        assertEquals(1.21f,currencyConverter.ConvertE_D(1));
    }
}