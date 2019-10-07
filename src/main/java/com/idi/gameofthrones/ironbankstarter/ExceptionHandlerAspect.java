package com.idi.gameofthrones.ironbankstarter;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class ExceptionHandlerAspect {

    private Map<NotEnoughMoneyException,Void> exceptions = new WeakHashMap<>();

    @Autowired
    private RavenProps ravenProps;

    @AfterThrowing(value = "execution(* com.idi.gameofthrones.ironbank.services.*.*(..))", throwing = "ex")
    public void handleNotEnoughMoneyException(NotEnoughMoneyException ex) {
        if (!exceptions.containsKey(ex)) {

            System.out.println("info from raven: " + ex.getMessage());
            System.out.println("sent to "+ravenProps.getDestination());
            exceptions.put(ex,null);
        }

    }
}
