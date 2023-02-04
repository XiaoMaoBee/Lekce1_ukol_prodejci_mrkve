package com.engetoacademy;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String firstname = "Oldrich";
        String surname = "Lapka";
        LocalDate sellerBirthday = LocalDate.of(1970,3,17);
        int numOfContractsOpened = 5;
        double soldCarrotInTuns = 23;
        String sellerCityName = "Brno";
        String licensePlate = "BMU 26 04";
        double gasUsageLiterPer100Km = 10;
        String ipAddress = "192.168.48.39";

        // An average amount of sold carrot in tuns per contract.
        double averageAmountPerContract = soldCarrotInTuns / numOfContractsOpened;

        System.out.println("An average amount of " +
                "sold carrot per a contract is: " + averageAmountPerContract + " tuns.");
    }
}
