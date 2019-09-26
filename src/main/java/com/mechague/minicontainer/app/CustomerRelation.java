package com.mechague.minicontainer.app;

import com.mechague.minicontainer.Container;
import com.mechague.minicontainer.service.DeliveryService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mechague
 * @since 9/26/19
 */
public class CustomerRelation {

    private static final Logger LOGGER = LogManager.getLogger(CustomerRelation.class);

    private DeliveryService deliveryService;

    //This method is used to inject the dependency
    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void notifyNoticesToSubscribedCustomers(){
        deliveryService = (DeliveryService) Container.getComponent("deliveryService");
        String[] subscribedCustomers = {"John", "Megan", "Tyler"} ;
        LOGGER.error("Trying to send notification to customers");
        deliveryService.sendNotifications(subscribedCustomers);
    }
}
