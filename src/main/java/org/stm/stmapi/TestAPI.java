package org.stm.stmapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {

    @RequestMapping(path = "/hello")
    public String sayHello() {
        return "Hello STM API";
    }

}
