
public class CurrencyConverter implements BaseCurrency
{
    public float ConvertE_(float money)
    {
        return money * EUR_USD;
    }

    public float ConvertE_G(float money) {
        return 0;
    }

    public float ConvertE_Y(float money) {
        return 0;
    }


}
