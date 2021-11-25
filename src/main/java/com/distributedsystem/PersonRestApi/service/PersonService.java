package com.distributedsystem.PersonRestApi.service;

import com.distributedsystem.PersonRestApi.entity.Person;

import java.util.List;



public interface PersonService {


    //read
    List<Person> findAll();
    Person findByid(Integer id);

    //create
    Person save(Person person);

    //update
    Integer updatePerson(String name, Integer id);
    //Integer updatePerson(Person person);

    //delete
    void deleteById(Integer id);







}



