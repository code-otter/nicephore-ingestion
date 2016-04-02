package org.code.otter.nicephore.ingestion.sequenceur;

import org.code.otter.nicephore.ingestion.sequenceur.settings.IngestionSettings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Main application class
 * Created by swinside on 02/04/16.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableConfigurationProperties(value = IngestionSettings.class)
@ImportResource("integration/integration-context.xml")
public class SequenceurApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SequenceurApp.class, args);
    }

}
