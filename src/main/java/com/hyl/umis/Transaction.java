package com.hyl.umis;

import org.springframework.stereotype.Component;

@Component
public class Transaction {

    public void begin() {
        System.out.println("事务开始");
    }

    public void sava() {
        System.out.println("保存");
    }

    public void rollback() {
        System.out.println("回滚");
    }

    public void end() {
        System.out.println("事务结束");
    }
}
