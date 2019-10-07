package com.idi.gameofthrones.ironbankstarter;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class OnProductionCondition implements Condition {
    private static String answer;

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (answer == null) {
            answer = JOptionPane.showInputDialog("Is this production?");
        }

        return answer.toLowerCase().contains("yes");
    }
}
