package edu.northeastern.cs5200.controllers.hello;

public class HelloObject {
    // given message
    private String message;

    // set message through constructor
    public HelloObject(String message) {
        this.message = message;
    }

    // getter
    public String getMessage() {
        return message;
    }

    // setter
    public void setMessage(String message) {
        this.message = message;
    }
}
