package com.eddytnk.helloworld.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Author: Edward Tanko <br/>
 * Date: 8/6/20 8:50 AM <br/>
 */
@Configuration
@Profile("prod")
public class ProdConfig {

    @Autowired
    private Environment env;
    @Autowired
    private AppProps appProps;

    @PostConstruct
    public void init() throws IOException {
         appProps.setMessage(new String(Files.readAllBytes(Paths.get(env.getProperty("app.message")))));
    }
}
