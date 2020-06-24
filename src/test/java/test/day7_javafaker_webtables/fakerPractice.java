package test.day7_javafaker_webtables;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class fakerPractice {
    @Test
    public void faker_test(){
        Faker faker =new Faker();
        String name =faker.name().fullName();
        System.out.println("name ="+ name);

        String firstName=faker.name().firstName();
        System.out.println("First name ="+ firstName);
        String potterSpell = faker.harryPotter().quote();
        System.out.println("" +
                "Potter quote: " +  potterSpell);
    }
}
