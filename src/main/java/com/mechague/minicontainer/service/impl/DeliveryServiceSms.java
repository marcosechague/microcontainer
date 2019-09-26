package com.mechague.minicontainer.service.impl;

import com.mechague.minicontainer.service.DeliveryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mechague
 * @since 9/26/19
 */
public class DeliveryServiceSms implements DeliveryService {

    private static final Logger LOGGER = LogManager.getLogger(DeliveryServiceSms.class);

    public void sendNotifications(String[] customerToNotify){
        LOGGER.info("Sending notifications by SMS to "+ customerToNotify);
    }

}
