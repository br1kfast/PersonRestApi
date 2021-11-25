package com.distributedsystem.PersonRestApi.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description: SpringBoot自动配置会探测到我们使用了H2数据库，他会根据实体类自动创建数据表
 */

@Entity
@Table(name = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String name;

    public Person() {

    }


    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }




    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person{" + "id=" + id + "name" + name +'}';

    }


}
