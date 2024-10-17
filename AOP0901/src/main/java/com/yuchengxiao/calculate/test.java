package com.yuchengxiao;

import org.junit.jupiter.api.Test;
import com.yuchengxiao.calculate.CalculatorImpl;

public class test {
    @Test
    public void test() {
        ProxyFactory factory = new ProxyFactory(new CalculatorLogImpl());
        cc proxy = (cc) factory.getProxy();
        proxy.div(1,0);
    }
}
