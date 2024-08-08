package org.employee;

@FunctionalInterface
public interface Foo {

    public static final String message = "Hello Sandhya";

    //void bar();

    void fooUsage();

    default String helloMsg() {
        return "Hello Message";
    }

    static String helloStaticMessage(){
        return message;
    }

}
