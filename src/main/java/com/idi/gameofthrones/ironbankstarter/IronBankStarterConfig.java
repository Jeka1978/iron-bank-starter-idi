package com.idi.gameofthrones.ironbankstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.ScheduledAnnotationBeanPostProcessor;
import org.springframework.scheduling.annotation.SchedulingConfiguration;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
//@Import(SchedulingConfiguration.class)
@EnableScheduling
@EnableAspectJAutoProxy
@EnableConfigurationProperties(RavenProps.class)
public class IronBankStarterConfig {




    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.destination")
    public ExceptionHandlerAspect exceptionHandlerAspect(){
        return new ExceptionHandlerAspect();
    }


    @Bean
    public HelloWorldService helloWorldService() {
        return new HelloWorldService();
    }
  /*
    @Bean
    public ScheduledAnnotationBeanPostProcessor scheduledAnnotationBeanPostProcessor(){
        return new ScheduledAnnotationBeanPostProcessor();
    }*/
}
