package com.eddytnk.helloworld;

import com.eddytnk.helloworld.config.AppProps;
import com.eddytnk.helloworld.model.HeathDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private AppProps appProps;

    @Autowired
    public MessageController(AppProps appProps) {
        this.appProps = appProps;
    }

    @GetMapping("/")
    ResponseEntity<String> getMessage() {
        logger.info("Getting message...");
        return ResponseEntity.ok(appProps.getMessage());
    }

    @GetMapping("/health")
    ResponseEntity<HeathDTO> getAppHeath() {
        logger.info("Checking health ...");
        return ResponseEntity.ok(new HeathDTO("UP"));
    }
}
