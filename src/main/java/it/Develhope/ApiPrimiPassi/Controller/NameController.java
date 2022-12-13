package it.Develhope.ApiPrimiPassi.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/name")
public class NameController {

    @GetMapping
    public String getName(){
        return "Claudio";
    }

    @PostMapping
    public String reverseName(){
        return "oidualC;
    }
}
