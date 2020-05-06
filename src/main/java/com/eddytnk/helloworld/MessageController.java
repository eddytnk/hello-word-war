package com.eddytnk.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Edward Tanko <br/>
 * Date: 5/6/20 12:37 PM <br/>
 */
@RestController
public class MessageController {

    @Value("${app.message}")
    private String message;

    @GetMapping("/")
    ResponseEntity<String> getMessage() {
        return ResponseEntity.ok(message);
    }
}
