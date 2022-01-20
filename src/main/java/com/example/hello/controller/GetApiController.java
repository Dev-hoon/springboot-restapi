package com.example.hello.controller;

import com.example.hello.dto.Userrequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:1234/api/get/hello
    public String gethello(){
        return "get hello";
    }
    //@GetMapping(path = "/hi")
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi(){
        return  "get hi";
    }


    // 윤호연의 아이디
    // 김태훈의 아이디
    // 이승현의 아이디
    //매번 만들수가 없어서
    // {누구누구} 의 아이디


    @GetMapping("/path-variable/{para}")
    public int pathVariacble(@PathVariable(name = "para") int parameter){
        //System.out.println("Path-variable 의 값은:" + parameter );
        return parameter +parameter +parameter;
    }

    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry->{
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
            System.out.print("\n");

            sb.append(entry.getKey()+ " : " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping(path = "/query-param2")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age) {

        System.out.print(name);
        System.out.print(email);
        System.out.print(age);

        return name + "의 이메일 주소는 " + email + " , 나이는 " + age + "살이다다";

    }

    @GetMapping("/query-param3")
    public String queryParam3(Userrequest A) {

        System.out.print(A.getName());
        System.out.print(A.getEmail());
        System.out.print(A.getAge());

        return A.toString();

    }



}
