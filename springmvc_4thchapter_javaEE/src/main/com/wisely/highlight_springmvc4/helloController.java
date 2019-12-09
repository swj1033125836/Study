package com.wisely.highlight_springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class helloController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
