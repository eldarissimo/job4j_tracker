package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    public void whenFindPerson() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getName()).isEqualTo("Petr");
    }

    @Test
    void whenNotFindPerson() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Ivan", "Ivanov", "12345", "Perm"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.isEmpty()).isTrue();
    }
}