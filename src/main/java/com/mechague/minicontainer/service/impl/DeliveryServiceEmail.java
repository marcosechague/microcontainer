package com.mechague.minicontainer.service.impl;

import com.mechague.minicontainer.service.DeliveryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author mechague
 * @since 9/26/19
 */
public class DeliveryServiceEmail implements DeliveryService {

    private static final Logger LOGGER = LogManager.getLogger(DeliveryServiceEmail.class);

    public void sendNotifications(String[] customerToNotify){
        LOGGER.info("Sending notification by EMAIL to "+ customerToNotify);
    }

}
