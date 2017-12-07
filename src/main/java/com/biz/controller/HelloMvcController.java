package main.java.com.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author yangming
 * @date 2017/12/6 0006
 */
@Controller
public class HelloMvcController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
