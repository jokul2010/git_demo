package com.jokul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysController {

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
