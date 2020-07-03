package com.lesson02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值 ，映射到这个组件中
 * @author huqiang
 * @ConfigurationProperties : 告诉springboot 讲本类中的所有属性和配置文件中相关的配置进行绑定
 * 只有这个组件是容器中的组件，才能使用容器提供的 @ConfigurationProperties 功能, 所以要加 @component
 * @ConfigurationProperties(prefix = "person") 默认从全局配置文件(application.properties)中获取值
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String lastName;

    private Integer age;

    private Boolean boss;

    private Date birth;

    private Map<String ,Object> maps;

    private List<Object> lists;

    private Dog dog;


    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Boolean getBoss() {
        return boss;
    }

    public Person setBoss(Boolean boss) {
        this.boss = boss;
        return this;
    }

    public Date getBirth() {
        return birth;
    }

    public Person setBirth(Date birth) {
        this.birth = birth;
        return this;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public Person setMaps(Map<String, Object> maps) {
        this.maps = maps;
        return this;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Person setLists(List<Object> lists) {
        this.lists = lists;
        return this;
    }

    public Dog getDog() {
        return dog;
    }

    public Person setDog(Dog dog) {
        this.dog = dog;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
