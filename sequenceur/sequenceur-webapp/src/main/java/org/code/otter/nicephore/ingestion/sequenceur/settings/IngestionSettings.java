package org.code.otter.nicephore.ingestion.sequenceur.settings;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Classe de gestion des propriétés d'ingestion
 * Created by swinside on 02/04/16.
 */
@Configuration
@ConfigurationProperties(prefix = "ingestion")
public class IngestionSettings {

    public static class Folder {
        private String in;

        private String reject;

        public String getIn() {
            return in;
        }

        public void setIn(String in) {
            this.in = in;
        }

        public String getReject() {
            return reject;
        }

        public void setReject(String reject) {
            this.reject = reject;
        }
    }

    private Folder folder;

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
