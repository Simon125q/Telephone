public class TelephoneNumber implements Comparable<TelephoneNumber>
{
    String countryCode;
    String localNumber;

    public TelephoneNumber(String code, String number)
    {
        countryCode = code;
        localNumber = number;
    }

    @Override
    public int compareTo(TelephoneNumber otherNum)
    {
        if (countryCode == otherNum.countryCode && localNumber == otherNum.localNumber)
        {
            return 1;
        }
        else {
            return 0;
        }
    }

    public void PrintNumber() {
        System.out.println("+" + countryCode + " " + localNumber);
    }
}