package testdata;

import models.SalesForceAccountModel;
import utilities.GenerateFakeMessage;

public class GetNewAccountModel {

    public static SalesForceAccountModel getAccountWithAllFields(){
        return SalesForceAccountModel.builder()
                .accountName(GenerateFakeMessage.getAccountName())
                .phone(GenerateFakeMessage.getPhone())
                .fax(GenerateFakeMessage.getFax())
                .website(GenerateFakeMessage.getWebsite())
                .type("Analyst")
                .industry("Agriculture")
                .employees(GenerateFakeMessage.getEmployees())
                .annualRevenue(GenerateFakeMessage.getAnnualRevenue())
                .description(GenerateFakeMessage.getDescription())
                .billingStreet(GenerateFakeMessage.getBillingStreet())
                .shippingStreet(GenerateFakeMessage.getShippingStreet())
                .shippingCity(GenerateFakeMessage.getShippingCity())
                .shippingZipPostalCode(GenerateFakeMessage.getShippingZipPostalCode())
                .shippingStateProvince(GenerateFakeMessage.getShippingStateProvince())
                .shippingCountry(GenerateFakeMessage.getShippingCountry())
                .billingCity(GenerateFakeMessage.getBillingCity())
                .billingStateProvince(GenerateFakeMessage.getBillingStateProvince())
                .billingZipPostalCode(GenerateFakeMessage.getBillingZipPostalCode())
                .billingCountry(GenerateFakeMessage.getBillingCountry())
                .build();
    }
}
