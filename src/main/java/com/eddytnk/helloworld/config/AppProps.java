package com.eddytnk.helloworld.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author: Edward Tanko <br/>
 * Date: 8/6/20 8:56 AM <br/>
 */
@Component
@ConfigurationProperties("app")
public class AppProps {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
