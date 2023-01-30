package ru.imbabot.lesson3.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<Person>> map;

    public PhoneBook(){
        map = new HashMap<>();
    }

    public void add(Person person){
        if (map.containsKey(person.getLastName())){
            map.get(person.getLastName()).add(person);
        }else {
            List<Person> list = new ArrayList<>();
            list.add(person);
            map.put(person.getLastName(), list);
        }
    }

    public List<String> get(String lastname){
        List<Person> list = map.get(lastname);
        List<String> phones = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            phones.add(list.get(i).getPhone());
        }
        return phones;
    }
}
