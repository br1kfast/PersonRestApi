package com.distributedsystem.PersonRestApi.web;


import com.distributedsystem.PersonRestApi.entity.Person;
import com.distributedsystem.PersonRestApi.service.CommonResult;
import com.distributedsystem.PersonRestApi.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PersonController {
   @Autowired
   private PersonServiceImpl personService;

   @Autowired

   //read
   @GetMapping(value = "/findAll")
   public CommonResult findAll() {
      CommonResult result = new CommonResult();
      try{
         List<Person> list = personService.findAll();
         //将查询结果封装到CommonResult中
         result.setData(list);
         return result;
      }catch (Exception e){
         e.printStackTrace();
         result.setState(500);
         result.setMsg("false");
         return result;
      }
   }
   @GetMapping(value = "/findPersonById/{id}")
   public CommonResult findPersonById(@PathVariable(name = "id") Integer id){
      CommonResult result = new CommonResult();
      try{
         Person person = personService.findByid(id);
         result.setData(person);
         return result;
      } catch (Exception e){
         e.printStackTrace();
         result.setState(404);
         result.setMsg("NOT FOUND");
         return result;
      }
   }

   //create
   /*@RequestMapping(value = "/addPerson/{name}", method = RequestMethod.GET)
   @Transactional
   public CommonResult addPerson(@PathVariable String name){
      CommonResult result = new CommonResult();
      try {
         Person person = new Person();
         //id是自增长的，不需要传
         person.setName(name);
         personService.save(person);
         result.setState(201);
         result.setMsg("CREATED");
         return result;
      } catch(Exception e) {
         e.printStackTrace();
         result.setState(500);
         result.setMsg("false");
         return result;
      }
   }

    */

   @PostMapping("/addPerson")
   public CommonResult addPerson(@RequestParam(value = "name", required = false) String name){
      CommonResult result = new CommonResult();
      try{
         Person person = new Person();
         person.setName(name);
         personService.save(person);
         result.setState(201);
         result.setMsg("CREATED");
         return result;
      }catch (Exception e){
         e.printStackTrace();
         result.setState(500);
         result.setMsg("false");
         return result;
      }
   }
   /*
   @PostMapping(value = "/addPerson")
   public CommonResult addPerson(Person person){
      CommonResult result = new CommonResult();
      try {
         personService.save(person);
         return result;
      }catch (Exception e){
         e.printStackTrace();
         result.setState(500);
         result.setMsg("false");
         return result;
      }
   }

    */

   //update
   /*@RequestMapping(value = "/updatePerson/{name}/{id}", method = RequestMethod.GET)
   public CommonResult updatePerson(@PathVariable String name, @PathVariable Integer id){
      CommonResult result = new CommonResult();
      try{
         personService.updatePerson(name, id);
         return result;
      } catch (Exception e){
         e.printStackTrace();
         result.setState(404);
         result.setMsg("NOT FOUND");
         return result;
      }

   }

    */

   @PatchMapping("/updatePerson/{id}")
   public CommonResult updatePerson(@PathVariable("id")Integer id, @RequestParam(value = "name", required = false)String name){
      CommonResult result = new CommonResult();
      try{
         Person person = personService.findByid(id);
         if(name != null){
            person.setName(name);
         }
         personService.save(person);
         return result;
      }catch(Exception e){
         e.printStackTrace();
         result.setState(404);
         result.setMsg("NOT FOUND");
         return result;
      }

   }

   /*
   //jpa是根据id来修改的
   @PatchMapping(value = "/updatePerson")
   public CommonResult updatePersonById(Person person){
      CommonResult result = new CommonResult();
      try{
         personService.updatePerson(person);
         return result;
      }catch(Exception e){
         e.printStackTrace();
         result.setState(500);
         result.setMsg("false");
         return result;
      }
   }

    */

   //delete
   @DeleteMapping(value = "/deletePerson/{id}")
   public CommonResult deletePersonById(@PathVariable(name = "id") Integer id){
      CommonResult result = new CommonResult();
      try{
         personService.deleteById(id);
         return result;
      }catch (Exception e) {
         e.printStackTrace();
         result.setState(404);
         result.setMsg("NOT FOUND");
         return result;
      }
   }


}
