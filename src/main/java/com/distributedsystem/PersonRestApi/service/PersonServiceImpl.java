package com.distributedsystem.PersonRestApi.service;

import com.distributedsystem.PersonRestApi.entity.Person;
import com.distributedsystem.PersonRestApi.repository.PersonRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component("personService")
@Transactional
public class PersonServiceImpl implements PersonService {
    private PersonRepository personRepository;

    PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    //read

    @Override
    public List<Person> findAll(){
        return personRepository.findAll();
    }
    @Override
    public Person findByid(Integer id){
        return personRepository.findByid(id);
    }

    //create
    @Override
    public Person save(Person person){
        return personRepository.save(person);
    }

    //update
    @Override
    public Integer updatePerson(String name, Integer id){
        return personRepository.updatePerson(name, id);
    }
    //public void updatePerson(Person person){ personRepository.save(person);}

    //delete
    @Override
    public void deleteById(Integer id){
        personRepository.deleteById(id);
    }

}
