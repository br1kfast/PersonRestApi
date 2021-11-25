package com.distributedsystem.PersonRestApi.web;

import com.distributedsystem.PersonRestApi.repository.PersonRepository;
import com.distributedsystem.PersonRestApi.service.CommonResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonControllerTest {

    @Autowired
    private PersonController personController;

    @Test
    public void findAll() {
        Assert.assertNotNull(personController.findAll());
    }

    @Test
    public void findPersonById() {
        Assert.assertNotNull(personController.findPersonById(1));
    }

    @Test
    public void addPerson() {
        Assert.assertNotEquals(null ,personController.addPerson("wood"));
    }

    @Test
    public void updatePerson() {
        Assert.assertNotNull(personController.updatePerson(2, "DUDU"));

    }

    @Test
    public void deletePersonById() {
        Assert.assertNotNull(personController.deletePersonById(3));


    }
}