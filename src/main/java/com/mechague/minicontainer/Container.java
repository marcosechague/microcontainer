package com.mechague.minicontainer;

import com.mechague.minicontainer.app.CustomerRelation;
import com.mechague.minicontainer.service.DeliveryService;
import com.mechague.minicontainer.service.impl.DeliveryServiceEmail;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mechague
 * @since 9/26/19
 */
public class Container {

    private static Map<String, Object> components;

    private Container(){
    }

    static {
        initContainer();
    }

    private static void initContainer(){
        components = new HashMap<String, Object>();
        DeliveryService deliveryService = new DeliveryServiceEmail();
        components.put("deliveryService", deliveryService);
        CustomerRelation customerRelation = new CustomerRelation();
        customerRelation.setDeliveryService(deliveryService);
        components.put("customerRelation", customerRelation);
    }

    public static Object getComponent(String componentKey){
        return components.get(componentKey);
    }

}
