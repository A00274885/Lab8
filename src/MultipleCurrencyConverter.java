public class MultipleCurrencyConverter extends CurrencyConverter implements BaseCurrency
{

    public float ConvertE_(float money,char currency)
    {
        if (currency == 'D')
        {
            return super.ConvertE_(money);
        }
        else if(currency == 'G')
        {
            return money * EUR_GBP;
        }
        else if (currency == 'Y')
        {
           return money * EUR_YUAN;
        }
        else
        {
            return -99f;
        }
    }


}
