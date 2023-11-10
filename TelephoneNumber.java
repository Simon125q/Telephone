public class TelephoneNumber
{
    String countryCode;
    String localNumber;

    public TelephoneNumber(String code, String number)
    {
        countryCode = code;
        localNumber = number;
    }

    public boolean compare(TelephoneNumber otherNum)
    {
        if (countryCode == otherNum.countryCode && localNumber == otherNum.localNumber)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void PrintNumber() {
        System.out.println("+" + countryCode + " " + localNumber);
    }
}