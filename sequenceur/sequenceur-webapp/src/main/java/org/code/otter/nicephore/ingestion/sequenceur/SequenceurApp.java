package org.code.otter.nicephore.ingestion.sequenceur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Main application class
 * Created by swinside on 02/04/16.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SequenceurApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SequenceurApp.class, args);
    }

}
