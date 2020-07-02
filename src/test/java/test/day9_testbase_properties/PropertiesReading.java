package test.day9_testbase_properties;

import org.testng.annotations.Test;

public class PropertiesReading {
    @Test
    public void java_properties_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }


}
