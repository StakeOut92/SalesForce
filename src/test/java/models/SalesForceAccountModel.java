package models;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class SalesForceAccountModel {

    private String accountName;
    private String phone;
    private String fax;
    private String website;
    private String type;
    private String industry;
    private String employees;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String shippingStreet;
    private String shippingCity;
    private String shippingZipPostalCode;
    private String shippingStateProvince;
    private String shippingCountry;
    private String billingCity;
    private String billingStateProvince;
    private String billingZipPostalCode;
    private String billingCountry;

}
