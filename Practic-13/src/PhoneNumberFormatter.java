import java.io.StringReader;
import java.util.Scanner;

public class PhoneNumberFormatter {
    public String FormatNumber(String rawNumber)
    {
        int countryCodeLength = 0;
        boolean isRussian = true;
        if(rawNumber.startsWith("+"))
        {
            isRussian = false;
        }
        StringBuilder phoneBuilder = new StringBuilder(countryCodeLength + 13);
        if(isRussian)
        {
           prepareNumberRussian(phoneBuilder, rawNumber);
        }
        else
        {
            countryCodeLength = extractCountryCodeLength(rawNumber);
            prepareNumberDefault(phoneBuilder, rawNumber, countryCodeLength);
        }
        phoneBuilder.append(getFirstNumberPart(rawNumber, countryCodeLength));
        phoneBuilder.append("-");
        phoneBuilder.append(getSecondNumberPart(rawNumber, countryCodeLength));
        phoneBuilder.append("-");
        phoneBuilder.append(getThirdNumberPart(rawNumber, countryCodeLength));
        return phoneBuilder.toString();
    }

    private void prepareNumberDefault(StringBuilder sb, String rawNumber, int countryCodeLength)
    {
        sb.append("+");
        sb.append(getCountryCode(rawNumber, countryCodeLength));
    }

    private int extractCountryCodeLength(String rawNumber)
    {
        return rawNumber.length() - 11;
    }

    private String getCountryCode(String rawNumber, int countryCodeLength)
    {
        return rawNumber.substring(1, 1 + countryCodeLength);
    }

    private String getFirstNumberPart(String rawNumber, int countryCodeLength)
    {
        return rawNumber.substring(1 + countryCodeLength, 4 + countryCodeLength);
    }
    private String getSecondNumberPart(String rawNumber, int countryCodeLength)
    {
        return rawNumber.substring(4 + countryCodeLength, 7 + countryCodeLength);
    }
    private String getThirdNumberPart(String rawNumber, int countryCodeLength)
    {
        return rawNumber.substring(7 + countryCodeLength);
    }

    private void prepareNumberRussian(StringBuilder sb, String rawNumber)
    {
        sb.append("+7");
    }
}
