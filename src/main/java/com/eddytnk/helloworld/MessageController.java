package com.eddytnk.helloworld;

import com.eddytnk.helloworld.model.HeathDTO;
import org.apache.catalina.valves.HealthCheckValve;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Value("${app.message}")
    private String message;

    @GetMapping("/")
    ResponseEntity<String> getMessage() {
        logger.info("Getting message...");
        return ResponseEntity.ok(message);
    }

    @GetMapping("/health")
    ResponseEntity<HeathDTO> getAppHeath() {
        logger.info("Checking health ...");
        return ResponseEntity.ok(new HeathDTO("UP"));
    }
}
