package com.idi.gameofthrones.ironbankstarter;/**
 * @author Evgeny Borisov
 */

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(OnProductionCondition.class)
public @interface ConditionalOnProduction {
}
