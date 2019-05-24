package com.springboot.bean.admin;

import org.springframework.stereotype.Component;
@Component
public class RoleLabelValue {
    private String label;
    private int value;

    public RoleLabelValue() {
    }

    public RoleLabelValue(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


