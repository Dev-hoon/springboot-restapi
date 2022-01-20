package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 이 클래스는 rest api를 처리하는 컨트롤러다.
@RequestMapping("/api")  // localhost:12345/api ~ 주소를 사용할거다.
public class ApiController {

    @GetMapping("hello") // http://localhost:12345/api/hello
    public String hello(){
        return "Hello hoyeon";
    }
}
