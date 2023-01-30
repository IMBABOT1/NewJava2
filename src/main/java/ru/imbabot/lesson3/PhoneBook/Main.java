package ru.imbabot.lesson3.PhoneBook;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Person("First", "88000001"));
        phoneBook.add(new Person("Second", "880000002"));
        phoneBook.add(new Person("First", "880000003"));

        System.out.println(phoneBook.get("First"));
    }
}
