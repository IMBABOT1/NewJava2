package ru.imbabot.lesson3.PhoneBook;

public class Person {

    private String lastName;
    private String phone;

    public Person(String lastName, String phone) {
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "lastname: " + lastName + " phone: " + phone;
    }
}
