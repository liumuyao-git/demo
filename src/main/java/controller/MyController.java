package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@RequestMapping("/hello")

    public String hello(){
    System.out.println("=========傻叉===========");
    return "你好";
}
}
