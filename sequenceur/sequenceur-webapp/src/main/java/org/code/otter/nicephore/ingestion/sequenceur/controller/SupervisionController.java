package org.code.otter.nicephore.ingestion.sequenceur.controller;

import org.code.otter.nicephore.ingestion.sequenceur.settings.IngestionSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Supervision controller
 * Created by swinside on 02/04/16.
 */
@RestController
public class SupervisionController {

    @Autowired
    IngestionSettings ingestionSettings;

    private final static Logger LOGGER = LoggerFactory.getLogger(SupervisionController.class);

    @RequestMapping("/supervision")
    public String isOk(){

        LOGGER.debug("Réponse : OK");
        return "OK";
    }


    @RequestMapping("/configuration")
    public List<String> configurationList(){
        List<String> configurationList = new ArrayList<String>();
        configurationList.add(ingestionSettings.getFolder().getIn());
        configurationList.add(ingestionSettings.getFolder().getReject());
        return configurationList;
    }
}
