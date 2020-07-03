package com.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/18 2:41 下午
 */
@Controller
public class MyController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


}
