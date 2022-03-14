package utilities;

import com.github.javafaker.Faker;

public class GenerateFakeMessage {


    public static String getAccountName() {
        Faker faker = new Faker();
        return faker.beer().name();
    }

    public static String getPhone() {
        Faker faker = new Faker();
        return faker.phoneNumber().phoneNumber();
    }

    public static String getFax() {
        Faker faker = new Faker();
        return faker.phoneNumber().cellPhone();
    }

    public static String getWebsite() {
        Faker faker = new Faker();
        return faker.internet().domainName();
    }

    public static String getEmployees() {
        Faker faker = new Faker();
        return faker.funnyName().name();
    }

    public static String getAnnualRevenue() {
        Faker faker = new Faker();
        return faker.number().digit();
    }

    public static String getDescription() {
        Faker faker = new Faker();
        return faker.chuckNorris().fact();
    }

    public static String getBillingStreet() {
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }

    public static String getShippingStreet() {
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }

    public static String getShippingCity() {
        Faker faker = new Faker();
        return faker.address().city();
    }

    public static String getShippingZipPostalCode() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }

    public static String getShippingStateProvince() {
        Faker faker = new Faker();
        return faker.address().state();
    }

    public static String getShippingCountry(){
        Faker faker = new Faker();
        return faker.address().country();
    }

    public static String getBillingCity() {
        Faker faker = new Faker();
        return faker.address().cityName();
    }

    public static String getBillingStateProvince() {
        Faker faker = new Faker();
        return faker.address().state();
    }

    public static String getBillingZipPostalCode() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }

    public static String getBillingCountry() {
        Faker faker = new Faker();
        return faker.address().country();
    }

}
