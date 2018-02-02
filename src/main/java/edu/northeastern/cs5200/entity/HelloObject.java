package edu.northeastern.cs5200.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "hello")
public class HelloObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // given message
    private String message;

    public HelloObject() {}

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
