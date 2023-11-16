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
        int result = countryCode.compareTo(otherNum.countryCode);
        if (result == 0) {
            result = localNumber.compareTo(otherNum.localNumber);
        }
        return result;
    }

    public void PrintNumber() {
        System.out.println("+" + countryCode + " " + localNumber);
    }
}