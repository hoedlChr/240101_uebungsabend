package IBAN_;

import java.util.Objects;

public class IbanValidationService {
    private String iBan;
    private int calculatedCheckSum;

    public IbanValidationService(String iBan) {
        this.iBan = iBan;
        this.calculatedCheckSum = -1;
    }
    public String getCountryCode(){
        return iBan.substring(0,2);
    }

    public int getCheckSum(){
        return Integer.valueOf(iBan.substring(2,4));
    }
    public String getAccountNumber(){
        return iBan.substring(4);
    }
    public String getCountryCodeNumber(){
        String CountryCode = getCountryCode();
        char[] charCountryCode = CountryCode.toCharArray();

        char test1 = CountryCode.charAt(0);
        char test2 = CountryCode.charAt(1);
        int inttest1 = test1;
        int inttest2 = test2;

        return (inttest1-55) + "" + (inttest2-55) + "00";

//        String returnValue = "";
//        for (char c : charCountryCode) {
//            int i = c;
//            returnValue += (i-55);
//        }
//        return returnValue + "00";
    }
    public String getFullCode(){
        return getAccountNumber() + getCountryCodeNumber();
    }
    public int[] buildArray(){// "1234" => [1,2,3,4]
        String code = getFullCode();
        char[] charCode = code.toCharArray();//"1234" => ["1","2","3","4"]

        int[] returnValue = new int[code.length()];

        for (int i = 0; i < charCode.length; i++) {
//            returnValue[i] = charCode[i] - '0';
            returnValue[i] = charCode[i] - 48;
        }

        return returnValue;
    }

    public int calcCheckSum(){
        int[] value = buildArray();

        int returnValue = 0;
        for (int i : value) {
            returnValue = ((10 * returnValue) + i) % 97;
        }
        calculatedCheckSum = 98 - returnValue;
        return calculatedCheckSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IbanValidationService that = (IbanValidationService) o;
        return Objects.equals(iBan, that.iBan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iBan);
    }

    public boolean isIbanCorrect(){
        return calculatedCheckSum == getCheckSum();
    }


}
