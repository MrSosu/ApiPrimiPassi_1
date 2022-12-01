package it.Develhope.ApiPrimiPassi.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NameController {

    @GetMapping(value = "/getName/{name}")
    public String getName(@PathVariable String name){
        return name;
    }

    @PostMapping(value = "/reverseName/{name}")
    public StringBuilder reverseName(@PathVariable String name){
        StringBuilder reverseName = new StringBuilder(name);
        reverseName.reverse();
        return reverseName;
    }
}
