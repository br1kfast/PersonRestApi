package com.distributedsystem.PersonRestApi.repository;

import com.distributedsystem.PersonRestApi.entity.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    //read
    @Override
    List<Person> findAll(Sort sort);


    @Query("select p from Person p where p.id = ?1")
    Person findByid(Integer id);

    //create
    @Override
    Person save(Person person);

    //update
    @Modifying
    @Query("update Person p set p.name = ?1 where p.id = ?2")
    Integer updatePerson(String name, Integer id);

    //delete
    @Override
    @Modifying
    @Query(value = "delete from person where id = ?1", nativeQuery = true)
    void deleteById(Integer id);










}
