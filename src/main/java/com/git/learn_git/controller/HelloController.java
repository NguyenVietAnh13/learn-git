package com.git.learn_git.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.status(200).body("Hello World!");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> sayGoodbye() {
        return ResponseEntity.ok().body("Bye!");
    }

    @GetMapping("/sorry")
    public ResponseEntity<String> saySorry() {
        return ResponseEntity.internalServerError().body("Oops! Error!");
    }

    @GetMapping("/hi")
    public ResponseEntity<String> sayHi() {
        return ResponseEntity.ok().body("Hi!");
    }
  
}
