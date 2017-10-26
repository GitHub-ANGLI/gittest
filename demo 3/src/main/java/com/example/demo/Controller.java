package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by a51 on 2017/10/20.
 */
@RestController
public class Controller {
    @GetMapping("/")
    public String find(){
        return "fanzhongkui";
    }

}
