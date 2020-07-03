package com.lesson02;

import com.MyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Springboot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等功能
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class SpringBootConfigApplicationTests {


    @Autowired
    private Person person;

    @Test
    public void contextLoads(){
        System.out.println("person="+person);
    }
}
