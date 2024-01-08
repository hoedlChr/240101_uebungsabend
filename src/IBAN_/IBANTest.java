package IBAN_;

import java.util.Arrays;

public class IBANTest {
    public static void main(String[] args) {
        System.out.println("Eingabe von IBAN");
        String iban1 = "AT611904300234573201";
        System.out.println(iban1);
        IbanValidationService myIban1 = new IbanValidationService(iban1);

//        System.out.println("Ländercode: " + myIban1.getCountryCode());
//        System.out.println("Prüfsumme: " + myIban1.getCheckSum());
//        System.out.println("Kontonummer: " + myIban1.getAccountNumber());
        System.out.println();
////        System.out.println("myIban1.getCountryCodeNumber() = " + myIban1.getCountryCodeNumber());
//        System.out.println("Prüfzahl: " + myIban1.getFullCode());
//        System.out.println("Arrays.toString(myIban1.buildArray()) = " + Arrays.toString(myIban1.buildArray()));
//
//        System.out.println("myIban1.calcCheckSum() = " + myIban1.calcCheckSum());
//        System.out.println("myIban1.isIbanCorrect() = " + myIban1.isIbanCorrect());

        IbanValidationService myIban2 = new IbanValidationService("AT022050302101023600");

        System.out.println("myIban1.equals(myIban1) = " + myIban1.equals(myIban1));
        System.out.println("myIban1.equals(myIban1) = " + myIban1.equals("string"));
        System.out.println("myIban1.equals(myIban1) = " + myIban1.equals(1234));
        System.out.println("myIban1.equals(myIban1) = " + myIban1.equals(myIban2));
        System.out.println("myIban1.equals(myIban1) = " + myIban1.hashCode());
        System.out.println("myIban1.equals(myIban1) = " + myIban2.hashCode());
    }
}
