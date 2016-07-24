package com.example.writer;

import com.example.model.Person;
import com.example.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonItemWriter implements ItemWriter<Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemWriter.class);

    @Autowired
    private PersonRepository personRepository;


    @Override
    public void write(List<? extends Person> persons) throws Exception {
        personRepository.save(persons);
    }
}
