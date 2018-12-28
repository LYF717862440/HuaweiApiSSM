package com.liangyaofeng.entity;

import java.io.Serializable;

public class GoodsMax implements Serializable {

    private int max;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }


    @Override
    public String toString() {
        return "GoodsMax{" +
                "max=" + max +
                '}';
    }
}
