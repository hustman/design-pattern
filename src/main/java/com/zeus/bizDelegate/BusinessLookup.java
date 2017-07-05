package com.zeus.bizDelegate;

import com.zeus.bizDelegate.impl.EJBService;
import com.zeus.bizDelegate.impl.JMSService;

/**
 * @author xuxingbo
 * @Date 2017/7/5
 */
public class BusinessLookup {

    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }
}
