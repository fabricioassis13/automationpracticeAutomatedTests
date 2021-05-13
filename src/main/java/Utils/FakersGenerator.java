package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakersGenerator {
    private static Faker faker = new Faker();

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }

    public static String getPassword(){
        return faker.internet().password(5, 10);
    }

    public static String getAddress(){
        return faker.address().streetAddress();
    }

    public static String getCity(){
        return faker.address().city();
    }

    public static String getMobilePhone(){
        return faker.phoneNumber().cellPhone();
    }

    public static String getEmail(){
        return faker.internet().emailAddress();
    }
}
