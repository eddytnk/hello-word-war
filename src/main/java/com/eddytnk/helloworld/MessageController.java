package com.eddytnk.helloworld;

import com.eddytnk.helloworld.model.HeathDTO;
import org.apache.catalina.valves.HealthCheckValve;
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

    @GetMapping("/health")
    ResponseEntity<HeathDTO> getAppHeath() {
        return ResponseEntity.ok(new HeathDTO("UP"));
    }
}
