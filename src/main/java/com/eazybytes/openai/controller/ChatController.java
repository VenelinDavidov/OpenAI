package com.eazybytes.openai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("/api")
public class ChatController {

    @GetMapping("/chat")
    public String chat(@RequestPart String message) {
        return "Hello" + message;
    }
}
