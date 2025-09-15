package com.springcore.springcore.ci;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ConInjection {
    private int id;
    private String name;
    private Certi certi;

    public ConInjection(int id, String name, Certi certi) {
        this.id = id;
        this.name = name;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return id + ":    " + name + "   : " + certi;
    }
 
}