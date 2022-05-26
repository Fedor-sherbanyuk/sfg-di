package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.MyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SomeController {

    private final MyService myService;


    public SomeController(@Qualifier("myServiceJpaImpl") MyService myService) {
        this.myService = myService;
    }
}
