package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Slf4j
public class TestAz400Application {

    public static void main(String[] args) {
        SpringApplication.run(TestAz400Application.class, args);
    }

    @GetMapping("/")
    public String test1() {
        String s = "666666666666666666666666666";
        log.info(s);
        return s;
    }

}
