package org.code.otter.nicephore.ingestion.sequenceur.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Supervision controller
 * Created by swinside on 02/04/16.
 */
@RestController
public class SupervisionController {

    private final static Logger LOGGER = LoggerFactory.getLogger(SupervisionController.class);

    @RequestMapping("/supervision")
    public String isOk(){

        LOGGER.debug("Réponse : OK");
        return "OK";
    }
}
