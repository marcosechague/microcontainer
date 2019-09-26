package com.mechague.minicontainer;


import com.mechague.minicontainer.app.CustomerRelation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author mechague
 * @since 9/26/19
 */
public class Application {

    private static final Logger LOGGER = LogManager.getLogger(Application.class);

    public static void main(String... args){
        LOGGER.info("Starting applicasdtionasd");
        CustomerRelation customerRelation = (CustomerRelation) Container.getComponent("customerRelation");
        customerRelation.notifyNoticesToSubscribedCustomers();
    }
}
