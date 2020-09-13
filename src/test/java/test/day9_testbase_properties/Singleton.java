package test.day9_testbase_properties;

public class Singleton {

    // makint hte constructor private to limit the user access o the obhect of the class
    // then we create our own lofic with our getter method to allow user to use the instance we are creating
    private Singleton(){
        // default
    }
    private static String word;

    public static String getWord(){
    if(word==null){// whenever we call this method, we assign our own value
        System.out.println("First call. Word object is null"+
                "Assigning value to word right now");
        word="something";// this is assigning value to null word
        // whenever we call the method
    }else {
        System.out.println("Word already has value");
    }
    return word;
    }
}
