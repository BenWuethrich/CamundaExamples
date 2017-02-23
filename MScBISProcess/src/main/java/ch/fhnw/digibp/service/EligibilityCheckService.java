/*
 * Copyright (c) 2017. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.digibp.service;

import java.util.logging.Logger;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 *
 * @author andreas.martin
 */
@Named
public class EligibilityCheckService implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger(EligibilityCheckService.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        LOGGER.info("checkEligibility called!!! | " + (String) execution.getVariable("mscbis_personHasFamilyName") + " | " + execution.getVariable("mscbis_applicationHasAdditionalInformation"));

    }
}
