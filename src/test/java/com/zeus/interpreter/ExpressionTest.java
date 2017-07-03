package com.zeus.interpreter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xuxingbo
 * @Date 2017/6/30
 */
public class ExpressionTest {

    //包含Robert和john中的其中一个，返回为True
    private Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("john");
        return new OrExpression(robert, john);
    }

    //当且仅当包含Julie和Married时，返回为True
    private Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }

    @Test
    public void test(){
        Expression isMale = getMaleExpression();
        Expression married = getMarriedWomanExpression();

        System.out.println("John is male ? " + isMale.interpret("john"));
        System.out.println("Julie is a married women ? " + married.interpret("Married Julie"));
    }

}